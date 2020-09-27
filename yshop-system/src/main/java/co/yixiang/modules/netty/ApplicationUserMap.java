//package co.yixiang.modules.netty;
//
//import io.netty.channel.ChannelHandlerContext;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ApplicationUserMap {
//    private  static Map<String , ChannelHandlerContext > userCtx =new HashMap<>();
//    public  void add(String userId,ChannelHandlerContext ctx){
//        System.err.println("applicationUserMap 赋值 参数"+userId);
//        System.err.println("applicationUserMap 赋值 参数"+ctx);
//        userCtx.put(userId,ctx);
//        Map<String,String> map = new HashMap<>();
//    }
//    public  static void remove(String userId){
//        userCtx.remove(userId);
//    }
//
//    public static ChannelHandlerContext getUserCtx(String userId){
//        return userCtx.get(userId);
//    }
//}
