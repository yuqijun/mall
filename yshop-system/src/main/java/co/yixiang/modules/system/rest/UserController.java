package co.yixiang.modules.system.rest;

import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import co.yixiang.gen.domain.User;
import co.yixiang.modules.system.service.impl.UserServiceImpl;
import co.yixiang.tools.utils.JsonUtil;
import co.yixiang.tools.utils.RASUtils;
import co.yixiang.tools.utils.ResponseUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cn.hutool.crypto.asymmetric.RSA;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@RestController
public class UserController {

    @Value("${rsa.public_key}")
    private String publicKey;

    @Autowired
    private UserServiceImpl userService;
    /*
    niceName
    passWord
    phone
    sex
    emali
    avatar(avatar_id)
    typeId
     */
    @PostMapping("/regist")
    public Object regist(@RequestBody String reqStr) throws Exception {
        System.err.println("用户注册发送过来的新账号信息="+reqStr);
        Map<String,String> reqMap =JsonUtil.toHashMap(reqStr);

        //校验参数
        if(reqMap.get("nickName").isEmpty()||reqMap.get("passWord").isEmpty()||
                reqMap.get("phone").isEmpty()||reqMap.get("email").isEmpty()||
                reqMap.get("typeId").isEmpty()
        ){
            System.err.println("===============");
            return ResponseUtil.regist(0);
        }

        //校验参数 合法性
        if(!"1".equals(reqMap.get("typeId"))&&!"2".equals(reqMap.get("typeId"))){

            return ResponseUtil.regist(2);
        }

        //将传进来的参数封装到对象中
        User user = new User();
        BeanUtils.populate(user,reqMap);
        user.setPassword(reqMap.get("passWord"));
        user.setTypeId(Integer.parseInt(reqMap.get("typeId")));
        System.err.println("注册信息 user="+user);

        //对密码加密
        System.err.println("注册信息 未加密前的password："+user.getPassword());
        user.setPassword(RASUtils.encrypt(user.getPassword(),publicKey));
        System.err.println("注册信息 加密后的密码=="+user.getPassword());


        //数据存表
        userService.save(user);

        return ResponseUtil.regist(1);
    }

    @PostMapping("/upload")
    public Object upload(@RequestBody String reqStr){
        System.err.println("进入上传图片控制器");
        System.err.println("fileList=="+reqStr);
        return "success";
    }
}
