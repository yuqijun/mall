package co.yixiang.modules.system.service.mapper;

import co.yixiang.gen.domain.YxOrder;
import co.yixiang.gen.domain.YxProduct;
import co.yixiang.gen.domain.increase.ShopOrder;
import co.yixiang.gen.domain.increase.ShopProduct;

import java.util.List;

public interface IYxOrderServer {
    int add(List<YxOrder> orderList);
}
