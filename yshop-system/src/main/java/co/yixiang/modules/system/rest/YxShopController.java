package co.yixiang.modules.system.rest;

import co.yixiang.modules.system.service.impl.YxProductServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class YxShopController {

    @Autowired
    private YxProductServiceImpl productService;
    @PostMapping("/getshop")
    public Object getShopByShopId(@Param("shopId")int shopId){

        return null;
    }
}
