//package co.yixiang.modules.netty;
//
//import co.yixiang.tools.utils.JacksonUtil;
//import io.netty.buffer.ByteBuf;
//import io.netty.buffer.Unpooled;
//import io.netty.channel.ChannelFuture;
//import io.netty.channel.ChannelFutureListener;
//import io.netty.channel.ChannelHandlerContext;
//import io.netty.channel.SimpleChannelInboundHandler;
//import io.netty.handler.codec.http.*;
//import io.netty.handler.codec.http.websocketx.*;
//import io.netty.util.CharsetUtil;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class WebSocketServerHandler extends SimpleChannelInboundHandler<Object> {
//
//
//    private ApplicationUserMap applicationUserMap = new ApplicationUserMap();
//    private static Logger logger = Logger.getLogger(WebSocketServerHandler.class.getName());
//    private WebSocketServerHandshaker handshaker;
//
//    private static ChannelHandlerContext ctx;
//    private User user =null;
//
//    @Override
//    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        this.ctx = ctx;
//        System.err.println("服务端  channelActive, 已完成客户端ctx 保存至服务端");
//    }
//
//    @Override
//    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
//        System.err.println("服务端 handlerAdded");
//    }
//
//    @Override
//    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
//        System.err.println("服务端 channelInactive");
//    }
//
//    @Override
//    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
//        System.err.println("服务端 channelRegistered");
//    }
//
//    @Override
//    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
//        System.err.println("服务端 handlerRemoved");
//    }
//
//
//
//    @Override
//    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
//        //如果是传统的http请求
//        if(msg instanceof FullHttpRequest){
//            handleHttpRequest(ctx,(FullHttpRequest) msg);
//        }else if(msg instanceof WebSocketFrame){
//            handleWebSocketFrame(ctx,(WebSocketFrame) msg);
//        }
//    }
//
//    @Override
//    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
//        ctx.flush();
//    }
////  →→→→→→→→→→→→→→→→→→→→→→传统http链接走这个响应  ①
//    private  void handleHttpRequest(ChannelHandlerContext ctx , FullHttpRequest request){                                 //进行握手
//
//        System.err.println("uri地址=="+request.getUri().toString());
//        //获取 用户信息，
//        String [] strList = request.getUri().split("\\?");
//        System.err.println("strList=="+strList);
//        String param = strList[1];
//        System.err.println("param=="+param);
//        String userId = param.split("=")[1];
//        System.err.println("userId=="+userId);
//
//        System.err.println("this.ctx=="+this.ctx);
//        //将客户端ctx存入全局变量
//        applicationUserMap.add(userId,this.ctx);
//        //输出 ctx
//        System.err.println("applicationUserCtx=="+applicationUserMap.getUserCtx(userId));
//
//        User user = ApplicationUser.getUser(userId);
//        //将登录用户保存到类中
//        this.user =  user;
//
//
//        if(!request.getDecoderResult().isSuccess() ||(!"websocket".equals(request.headers().get("Upgrade")))){
//            sendResponse(ctx,request,new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
//            return ;
//        }
//
//        WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory("ws://localhost:9090/ws",null,false);
//        handshaker=wsFactory.newHandshaker(request);
//        //如果不支持 websocket
//        if(handshaker==null){
//            // 源码猜测：通过channel 输出信息
//            WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(ctx.channel());
//        }else{
//            handshaker.handshake(ctx.channel(),request);
//        }
//    }
//
//    // websocket  走这个
//    private void handleWebSocketFrame(ChannelHandlerContext ctx, WebSocketFrame frame){
//        //如果是关闭请求
//        if(frame instanceof CloseWebSocketFrame){
//            handshaker.close(ctx.channel(),(CloseWebSocketFrame)frame.retain());
//        }
//
//        //如果是检测心跳消息
//        if(frame instanceof PingWebSocketFrame){
//            //转给下一个 channelHandle
//            ctx.channel().write(new PongWebSocketFrame(frame.content().retain()));
//            return ;
//        }
//
//
//        //如果不是文笔消息
//        if(!(frame instanceof TextWebSocketFrame)){
//            throw  new UnsupportedOperationException(String.format("%s fram types  not supported",frame.getClass().getName()));
//        }
//        //返回应答消息
//        String request =((TextWebSocketFrame)frame).text();
//
//        //如果是心跳消息
//        if("head".equals(request)){
//            System.err.println("Client Say:"+request);
//            //转给下一个 channelHandle
//            ctx.writeAndFlush(new TextWebSocketFrame("head"));
//            return ;
//        }
//        if(logger.isLoggable(Level.FINE)){
//            logger.fine(String.format("%s  received  %s",ctx.channel(),request));
//        }
////        ctx.channel().write(new TextWebSocketFrame(request+"欢迎使用netty websocket 服务，当前时间："+ LocalDateTime.now().toString()));
//        //得到当前用户的 用户信息 ，获取receveId   ，根据receveId 得到ctx 使用该ctx输出消息
//        //在自己的页面显示自己发的信息
//        ctx.writeAndFlush(new TextWebSocketFrame(DataUtil.getNow()+"\r\n"+user.getName()+": "+request+"\r\n"));
//
//        ChannelHandlerContext ctx2 = ApplicationUserMap.getUserCtx(user.getReceveId());
//        System.err.println("ctx2==="+ctx2);
//
//        System.err.println("Client Say:"+request);
//        if(ctx2==null){
//            System.err.println("您的好友未上线---");
//            ctx.writeAndFlush(new TextWebSocketFrame(DataUtil.getNow()+"\r\n"+"您的好友暂未上线---"+"\r\n"));
//        }else{
//            System.err.println("已将消息转发至 userId："+user.getReceveId()+"\r\n");
//            ctx2.writeAndFlush(new TextWebSocketFrame(DataUtil.getNow()+"\r\n"+user.getName()+": "+request+"\r\n"));
//            Map<String,String> respMap = new HashMap<>();
//            respMap.put("time",DataUtil.getNow());
//            respMap.put("userName",user.getName());
//            respMap.put("msg",request);
//            String respJson = JacksonUtil.toJson(respMap);
////            ctx2.writeAndFlush(new TextWebSocketFrame(respJson));
//        }
//    }
//
//    //→→→→→→→→→→→→→→→→→→→→→→传统http链接走这个响应  ②
//    private static void sendResponse(ChannelHandlerContext ctx, FullHttpRequest request, FullHttpResponse response){
//        if(!"200".equals(response.getStatus().code())){
//            ByteBuf buf = Unpooled.copiedBuffer(response.getStatus().toString(), CharsetUtil.UTF_8);
//            response.content().writeBytes(buf);
//            buf.release();
////            response.headers().set("CONTENT-LENGTH",response.content().readableBytes());
//            HttpHeaders.setContentLength(response,response.content().readableBytes());
//        }
//        ChannelFuture f =  ctx.channel().writeAndFlush(response);
//        if(!HttpHeaders.isKeepAlive(request)||response.getStatus().code()!=200){
//            f.addListener(ChannelFutureListener.CLOSE);
//        }
//    }
//
//
//
//    @Override
//    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
//        System.err.println("服务端异常即将关闭...");
//        cause.printStackTrace();
//        ctx.close();
//    }
//}
