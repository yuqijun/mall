package co.yixiang;

import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import co.yixiang.gen.dao.UserMapper;
import co.yixiang.tools.utils.RASUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//设置启动器
@SpringBootTest(classes={AppRuner.class})//指定启动类
public class UserTest {
    @Value("${rsa.public_key}")
    private String publicKey;

    @Value("${rsa.private_key}")
    private String privateKey;
//
//    @Autowired
//    private UserServerImpl server;

//    @Test
//    public void test1(){
//        //..测试内容
//        System.err.println("yshop-system test1==");
//        System.err.println("server=="+server);
//        User u = server.getById("3");
//        System.err.println("test user == "+u.toString());
//    }

//    @Test
//    public void test2(){
//        System.err.println("yshop-system test1==");
//        System.err.println("测试测试环境");
//    }

    @Autowired
    private UserMapper mapper;
    @Test
    public void getById(){
        System.err.println("user="+mapper.selectByPrimaryKey(3l).toString());
    }

    @Test
    public void RASTest() throws Exception {
        String password = "123465";
        String data = RASUtils.encrypt(password,publicKey);
        System.err.println("encrydata===="+data);

        String enData = RASUtils.decrypt("UY+vYAK5IggN9t77QEDX52Fa9UCvNlgsg9CS0FjYEKKD/SfStUugTZhJ7hSLrrfCIIfZWpWfXpixLu2mQzq0TXt7+KDTubxs8qcrXl/azSfatZRcfvwRzwDtP7fkikL9wO4XxArHO8+N5RjqnYAdkfpQtrlf1DNIrEce1nBOlhk=\n",privateKey);
        System.err.println("deData=="+enData);

    }

}