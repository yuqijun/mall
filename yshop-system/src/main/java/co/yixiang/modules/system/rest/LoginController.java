package co.yixiang.modules.system.rest;

import co.yixiang.gen.domain.User;
import co.yixiang.modules.system.service.impl.UserServiceImpl;
import co.yixiang.modules.system.service.impl.YxShopServiceImpl;
import co.yixiang.mp.utils.JsonUtils;
import co.yixiang.tools.utils.JsonUtil;
import co.yixiang.tools.utils.RASUtils;
import co.yixiang.tools.utils.ResponseUtil;
import co.yixiang.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.UUID;

@RestController
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private YxShopServiceImpl  shopService;



    @Value("${rsa.private_key}")
    private String privatekey;
    @PostMapping("/")
    public Object check(@RequestBody String reqStr) throws Exception {
        HashMap reqMap = JsonUtil.toHashMap(reqStr);
        String phone = reqMap.get("phone").toString();
        String password = reqMap.get("password").toString();

        //校验必填参数
        if("".equals(phone)||"".equals(password)||null==phone||null==password){
            return ResponseUtil.login(1,"","",0L,"");
        }

        //校验用户是否存在
        if(userService.findByPhone(phone)==null||userService.findByPhone(phone).size()<=0){
            return ResponseUtil.login(3,"","",0L,"");
        }

        //校验密码是否正确
        User jwtUser = userService.findByPhone(phone).get(0);
        if(!RASUtils.decrypt(jwtUser.getPassword(),privatekey).equals(password)){
            System.err.println("passowrd:"+password);
            System.err.println("jwtPassWord:"+RASUtils.decrypt(jwtUser.getPassword(),privatekey).toString());
            System.err.println("jwtPassWord2:"+jwtUser.getPassword());
            return ResponseUtil.login(2,"","",0L,"");
        }

        //redis存储token
        String token = UUID.randomUUID().toString().replaceAll("-","");
        RedisUtil.set("login-"+phone,token);



        if(jwtUser.getTypeId()==1){
            System.err.println("  登陆身份是  商家");
            int shopId =  shopService.getByUserId(jwtUser.getId().intValue()).get(0).getId();
            System.err.println("登录商家 店铺编号---"+shopId);
            return co.yixiang.modules.system.util.ResponseUtil.loginSuccess(token,jwtUser,true,String.valueOf(shopId),jwtUser.getTypeId().toString());
        }
        //返回数据     用户类型标记   用户java对象   token

        return co.yixiang.modules.system.util.ResponseUtil.loginSuccess(token,jwtUser,true,"",jwtUser.getTypeId().toString());
    }
}
