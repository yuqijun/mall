package co.yixiang.tools.utils;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtil {
    private static Map<Object,Object> map = new HashMap<>();

    public static Map<Object,Object> regist(int num){
        switch (num){
            case 0:
                map.put("info","err");
                break;
            case 1:
                map.put("info","success");
                break;
            case 2:
                map.put("info","请选择商家或者普通用户...");
            default:
                break;
        }
        return map;
    }

    public static Map<Object,Object> login(int num,String token,String typeId,Long userId,String perm){
        if(num==0){
            map.put("respCode","000000");
            map.put("respDesc","请求成功");
            map.put("token",token);
            map.put("typeId",typeId);
            map.put("userId",userId);
            map.put("perm",perm);
        }else if(num==1){
            map.put("info","参数不全...");
        }else if (num == 2 ){
            map.put("info","密码错误...");
        }else if (num == 3){
            map.put("info","用户不存在...");
        }
        return map;
    }

    public static Map<Object,Object> restFull(){
        map.put("info","参数不全");
        return map;
    }

    public static Map<Object,Object> success(){
        map.put("info","success");
        return map;
    }

    public static Map<Object,Object> fail(){
        map.put("info","fial");
        return map;
    }

    public static Map<Object,Object> succ(Object obj){
        map.put("respCode","000000");
        map.put("respDesc","请求成功");
        map.put("info",obj);
        return map;
    }

    public static Map<Object,Object>err(){
        map.put("respCode","111111");
        map.put("respDesc","请求失败");
        return map;
    }


}
