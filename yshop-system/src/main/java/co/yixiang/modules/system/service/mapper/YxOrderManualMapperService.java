package co.yixiang.modules.system.service.mapper;

import co.yixiang.gen.domain.increase.ShopOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YxOrderManualMapperService {
    public List<ShopOrder> getUserOrder(int userId);
    public List<ShopOrder> getShopOrderByShopId(String shopId);
    public List<ShopOrder> getOrderByStatus(String shopId, int status);
    public List<ShopOrder> getOrderIndexStatus(String userId,  String status);
}
