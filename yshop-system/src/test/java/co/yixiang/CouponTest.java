package co.yixiang;


import co.yixiang.modules.system.service.impl.CouponServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//设置启动器
@SpringBootTest(classes={AppRuner.class})//指定启动类
public class CouponTest {
    @Autowired
    private CouponServiceImpl service;

    @Test
    public void getCoupon(){
        System.err.println("当前用户可用优惠券----"+service.getUserCoupon(2,7,4));
    }
}
