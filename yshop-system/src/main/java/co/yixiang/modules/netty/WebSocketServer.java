//package co.yixiang.modules.netty;
//
//import io.netty.bootstrap.ServerBootstrap;
//import io.netty.channel.ChannelFuture;
//import io.netty.channel.ChannelInitializer;
//import io.netty.channel.ChannelOption;
//import io.netty.channel.EventLoopGroup;
//import io.netty.channel.nio.NioEventLoopGroup;
//import io.netty.channel.socket.SocketChannel;
//import io.netty.channel.socket.nio.NioServerSocketChannel;
//import io.netty.handler.codec.http.HttpObjectAggregator;
//import io.netty.handler.codec.http.HttpServerCodec;
//import io.netty.handler.stream.ChunkedWriteHandler;
//import io.netty.handler.timeout.IdleStateHandler;
//import io.netty.handler.timeout.ReadTimeoutHandler;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.util.concurrent.TimeUnit;
//
//@Component
//public class WebSocketServer {
////    public static void main(String [] args){
////        new WebSocketServer().bind("localhost",9090);
////    }
//    @PostConstruct
//    public void starter(){
//        new WebSocketServer().bind("localhost",9090);
//    }
//    public void bind(String path,int port){
//        EventLoopGroup bossGroup = new NioEventLoopGroup();
//        EventLoopGroup workGroup = new NioEventLoopGroup();
//        try{
//            ServerBootstrap b = new ServerBootstrap();
//            b.group(bossGroup,workGroup)
//                    .channel(NioServerSocketChannel.class)
//                    .childHandler(new ChannelInitializer<SocketChannel>() {
//                        @Override
//                        protected void initChannel(SocketChannel ch) throws Exception {
//                            ch.pipeline()
//                                    .addLast("http-codec",new HttpServerCodec())
//                                    .addLast("aggregator",new HttpObjectAggregator(65536))
//                                    .addLast("http-chunked",new ChunkedWriteHandler())
////                                    .addLast(new WebSocketServerProtocolHandler("/ws"))
////                                    .addLast(new IdleStateHandler(40,0,0, TimeUnit.SECONDS))
////                                    .addLast("headHandler",new ServerHeadHandler())
//                                    .addLast(new ReadTimeoutHandler(10,TimeUnit.SECONDS))
//                                    .addLast("handler",new WebSocketServerHandler());
//                        }
//                    })
//                    .option(ChannelOption.SO_BACKLOG,128)
//                    .childOption(ChannelOption.SO_KEEPALIVE,true);
//            ChannelFuture f =  b.bind(path,port).sync();
//            System.err.println("服务器已开启 port："+port);
//            f.channel().closeFuture().sync();
//        }catch (Exception e){e.printStackTrace();}finally {
//            bossGroup.shutdownGracefully();
//            workGroup.shutdownGracefully();
//        }
//    }
//}
