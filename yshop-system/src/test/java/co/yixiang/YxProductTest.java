package co.yixiang;

import co.yixiang.gen.domain.increase.ProductManul;
import co.yixiang.modules.system.service.impl.YxProductManulServiceImpl;
import co.yixiang.modules.system.service.impl.YxProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)//设置启动器
@SpringBootTest(classes={AppRuner.class})//指定启动类
public class YxProductTest {
    @Autowired
    private YxProductServiceImpl service;

    @Autowired
    private YxProductManulServiceImpl manulService;

    @Test
    public void test1(){
        System.err.println("三号店的所有产品---"+service.getAllByShopId(3).toString());
    }

    @Test
    public void test2(){
        System.err.println("根据产品类型 获得 产品集合  --- "+manulService.getByClassId(3));
    }

    @Test
    public void test3(){
        List<ProductManul> pList = manulService.searchProductName("茶");
        System.err.println("模糊查询productName 记录数---"+pList.size());
        System.err.println("模糊查询productName---"+manulService.searchProductName("茶"));
    }
}
