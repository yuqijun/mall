package co.yixiang;

import co.yixiang.gen.dao.YxOrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)//设置启动器
@SpringBootTest(classes={AppRuner.class})//指定启动类

public class YxOrderTest {
    @Resource
    private YxOrderMapper mapper;
    @Test
    public void test(){

//        System.err.println("自定义sql----"+mapper.getProductList("4","b99dd2937c7e4620ab97002f612b6bd8"));
    }
}
