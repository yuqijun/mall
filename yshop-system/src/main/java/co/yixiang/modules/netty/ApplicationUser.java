//package co.yixiang.modules.netty;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ApplicationUser {
//    public static Map<String,User> userMap = new HashMap<>();
//    static{
//        User user1 = new User();
//        user1.setName("Dog Woofson");
//        user1.setUserId("0001");
//        user1.setReceveId("0002");
//
//        User user2 = new User();
//        user2.setName("Thomas Bangalter");
//        user2.setUserId("0002");
//        user2.setReceveId("0001");
//
//        userMap.put("0001",user1);
//        userMap.put("0002",user2);
//
//
//    }
//
//    public static  User getUser(String userId){
//        return userMap.get(userId);
//    }
//}
