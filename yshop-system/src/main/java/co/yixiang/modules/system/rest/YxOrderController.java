package co.yixiang.modules.system.rest;


import co.yixiang.gen.domain.YxOrder;
import co.yixiang.gen.domain.YxProduct;
import co.yixiang.gen.domain.increase.LitellOrder;
import co.yixiang.gen.domain.increase.ShopOrder;
import co.yixiang.gen.domain.increase.ShopProduct;
import co.yixiang.gen.domain.vo.Submit;
import co.yixiang.modules.system.service.impl.YxOrderManualMapperServiceImpl;
import co.yixiang.modules.system.service.impl.YxOrderServiceImpl;
import co.yixiang.tools.utils.JsonUtil;
import co.yixiang.tools.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;


@RestController
@RequestMapping("/order")
public class YxOrderController {

    @Autowired
    private YxOrderManualMapperServiceImpl orderManualService;

    @Autowired
    private YxOrderServiceImpl orderService;

    @PostMapping("/submit")
    public Object submit (@RequestBody Submit param) throws InterruptedException {

        System.err.println("用户提交订单参数------"+param.toString());

        //获取订单产品列表
        List<YxProduct> productList = param.getProductList();

        List<YxOrder> orderList = new ArrayList<>();

        String no = (UUID.randomUUID().toString().replaceAll("-",""));

        for(YxProduct product : productList){
            YxOrder o = new YxOrder();
            o.setNo(no);
            System.err.println("  赋值 no："+no);
            o.setConsumerId(Integer.parseInt(param.getUserId()));
            o.setNumber(product.getNumber());
            o.setProductClassId(product.getClassId());
            o.setProductId(product.getId());
            o.setShopId(Integer.parseInt(param.getShopId()));
            orderList.add(o);
        }

        int row = orderService.add(orderList);

        if(row>0){
            return ResponseUtil.success();
        }

        return ResponseUtil.fail();
    }

    @PostMapping("/list")
    public Object orderList(@RequestBody  String param){

        //接收参数
        HashMap paramMap = JsonUtil.toHashMap(param);
        String userId = paramMap.get("userId").toString();


        //校验参数
        if("".equals(userId)||null==userId){
            return ResponseUtil.err();
        }

        //获取数据
        List<ShopOrder> orderList = orderManualService.getUserOrder(Integer.parseInt(userId));
        System.err.println("-------------1  1-----------"+orderList.toString());
        List<ShopOrder> orderList1 = new ArrayList<>();


        //计算应付金额
        for(ShopOrder order : orderList){
           List<ShopProduct> productList =  order.getProductList();
            BigDecimal orderPirce = new BigDecimal(0);
           for(ShopProduct product : productList){
               orderPirce = orderPirce.add(product.getTotalPrice());

           }
           order.setaPayment(orderPirce.subtract(order.getdPayment()));
           order.setAmountDue(orderPirce);
           orderList1.add(order);
        }

        System.err.println("");

        return ResponseUtil.succ(orderList1);
    }


    @PostMapping("/getProductByShopId")
    public Object getProductByShopId(@RequestBody String req){
        Map reqMap = JsonUtil.toHashMap(req);
        String shopId =(String) reqMap.get("shopId");
        return ResponseUtil.succ(orderManualService.getShopOrderByShopId(shopId));
    }

    @PostMapping("/getOrderByStatus")
    public Object getOrderByStatus(@RequestBody String req){
        System.err.println("getOrderByStatus  :: req"+req.toString());
        Map reqMap = JsonUtil.toHashMap(req);
        String shopId =(String) reqMap.get("shopId");
        String status =  reqMap.get("status").toString();
        System.err.println("getOrderByStatus  ::shopId"+shopId);
        System.err.println("getOrderByStatus  ::status"+status);

        return ResponseUtil.succ(orderManualService.getOrderByStatus(shopId,Integer.parseInt(status)));
    }


    @PostMapping("/changeStatus")
    public Object changeStatus(@RequestBody String reqStr){
        System.err.println("进入更新订单状态控制器----参数："+reqStr);
        Map map = JsonUtil.toHashMap(reqStr);
        String orderNo = map.get("orderNo").toString();
        String status = map.get("status").toString();
        int  row = orderService.changeStatus(orderNo,status);
        if(row<=0){
            return ResponseUtil.err();
        }else{
            return ResponseUtil.succ(row);
        }
    }

}
