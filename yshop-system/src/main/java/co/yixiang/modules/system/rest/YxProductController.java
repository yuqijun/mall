package co.yixiang.modules.system.rest;

import co.yixiang.modules.system.service.impl.YxProductManulServiceImpl;
import co.yixiang.modules.system.service.impl.YxProductServiceImpl;
import co.yixiang.tools.utils.JacksonUtil;
import co.yixiang.tools.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequestMapping("/product")
public class YxProductController {

    @Autowired
    private YxProductServiceImpl productService;

    @Autowired
    private YxProductManulServiceImpl manulService;

    @PostMapping("/allofshopid")
    public Object getAllByShopId(@RequestBody String reqStr){

        System.err.println("/allofshopid     接收参数"+reqStr);

        Map<String,String> reqMap = JacksonUtil.toMap(reqStr);
        Integer shopId = Integer.parseInt(reqMap.get("shopId"));

        if("".equals(String.valueOf(shopId))) {
            return ResponseUtil.restFull();
        }

        System.err.println("/allofshopid   ----"+ResponseUtil.succ(productService.getAllByShopId(shopId)));
        return ResponseUtil.succ(productService.getAllByShopId(shopId));
    }

    @PostMapping("/getByClassId")
    public Object getByShopId(@RequestBody String reqStr){

        //接收参数
        Map<String,String> reqMap =  JacksonUtil.toMap(reqStr);
        int classId = Integer.parseInt(reqMap.get("classId"));

        //校验参数
        if("".equals(classId)){
            return ResponseUtil.err();
        }
        return ResponseUtil.succ(productService.getByClassId(classId));
    }



    @PostMapping("/byClassId")
    public Object byClassId(@RequestBody String reqStr){
        //接收参数
        Map<String,String> reqMap =  JacksonUtil.toMap(reqStr);
        int classId =  Integer.parseInt(reqMap.get("classId"));


        //校验参数
        if("".equals(classId)){
            return ResponseUtil.err();
        }

        return ResponseUtil.succ(manulService.getByClassId(classId));
    }

    @PostMapping("/search")
    public Object searchByProductName(@RequestBody String reqStr){
        Map<String,String> reqMap = JacksonUtil.toMap(reqStr);
        String productName = reqMap.get("productName");

        System.err.println("search 接收到的值---"+productName);

        if("".equals(productName)||null == productName){
            return ResponseUtil.err();
        }


        System.err.println("/product/search  返回值----"+ResponseUtil.succ(manulService.searchProductName(productName)).toString());
        return  ResponseUtil.succ(manulService.searchProductName(productName));
    }
}
