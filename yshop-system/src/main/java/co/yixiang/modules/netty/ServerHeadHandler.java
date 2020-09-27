//package co.yixiang.modules.netty;
//
//import io.netty.channel.ChannelHandlerContext;
//import io.netty.channel.SimpleChannelInboundHandler;
//import io.netty.handler.timeout.IdleState;
//import io.netty.handler.timeout.IdleStateEvent;
//
//public class ServerHeadHandler extends SimpleChannelInboundHandler {
//
//
//
//    private int count = 0 ;
//    @Override
//    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object msg) throws Exception {
//        System.err.println("Client say:"+msg.toString());
//
//        //重置 心跳数
//        count=0;
//    }
//
//    @Override
//    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
//        System.err.println("Netty 异常 即将关闭通道");
//        cause.printStackTrace();
//        ctx.close();
//    }
//
//
//    //检验是否触发空闲事件
//    //判断是否为读空闲事件
//    //判断掉包次数是否大于等于3次
//    @Override
//    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
//        if(evt instanceof IdleStateEvent){
//            IdleStateEvent event =  (IdleStateEvent)evt;
//            if(event.state().equals(IdleState.READER_IDLE)){
//                if(count>=3){
//                    ctx.channel().close().sync();
//                    System.err.println("已于"+ctx.channel().remoteAddress()+"断开连接");
//                }else{
//                    count++;
//                    System.err.println("已丢失了第 "+count+"个包");
//                }
//            }
//        }
//    }
//}
