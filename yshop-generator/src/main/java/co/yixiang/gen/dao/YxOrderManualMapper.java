package co.yixiang.gen.dao;

import co.yixiang.gen.domain.increase.ShopOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("yxOrderManualMapper")
public interface YxOrderManualMapper {
    public List<ShopOrder> getUserOrder(@Param("userId")int userId);
    public List<ShopOrder> getShopOrderByShopId(@Param("shopId") String shopId);
    public List<ShopOrder> getShopOrderByStatus(@Param("shopId")String shopId,@Param("status") int status);
    public List<ShopOrder> getOrderIndexStatus(@Param("userId") String userId,@Param("status") String status);
}
