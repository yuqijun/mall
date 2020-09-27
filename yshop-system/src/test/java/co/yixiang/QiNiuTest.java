package co.yixiang;

import co.yixiang.tools.utils.QiNiuUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//设置启动器
@SpringBootTest(classes={AppRuner.class})//指定启动类
public class QiNiuTest {

    @Autowired
    private QiNiuUtil  qiNiuUtil;


    @Test
    public void test1(){
        String url = qiNiuUtil.put("C:\\Users\\Administrator\\Desktop\\photo1.jpg");
        System.err.println("七牛云返回的地址："+url);
    }
}
