package co.yixiang.gen.domain.increase;

import co.yixiang.gen.domain.YxProduct;

import java.math.BigDecimal;
import java.util.List;

public class IncreaseYxOrder {
    private List<YxProduct> productList;
    // 订单金额
    private BigDecimal orderPrice;
    // 实际支付金额
    private BigDecimal aPayMent;
    // 优惠金额
    private BigDecimal dAmount;
}
