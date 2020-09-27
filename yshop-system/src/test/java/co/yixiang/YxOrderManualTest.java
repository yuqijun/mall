package co.yixiang;

import co.yixiang.gen.dao.YxOrderManualMapper;
import co.yixiang.modules.system.service.impl.YxOrderManualMapperServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//设置启动器
@SpringBootTest(classes={AppRuner.class})//指定启动类
public class YxOrderManualTest {
    @Autowired
    private YxOrderManualMapperServiceImpl service;

    @Test
    public void test1(){
        System.err.println("当前用户订单信息------"+service.getUserOrder(4));
    }
}
