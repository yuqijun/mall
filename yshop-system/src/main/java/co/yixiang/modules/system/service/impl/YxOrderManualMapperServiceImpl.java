package co.yixiang.modules.system.service.impl;

import co.yixiang.gen.dao.YxOrderManualMapper;
import co.yixiang.gen.domain.increase.ShopOrder;
import co.yixiang.modules.system.service.mapper.YxOrderManualMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class YxOrderManualMapperServiceImpl implements YxOrderManualMapperService {
    @Autowired
    private YxOrderManualMapper mapper;
    @Override
    public List<ShopOrder> getUserOrder(int userId) {
        return mapper.getUserOrder(userId);
    }

    @Override
    public List<ShopOrder> getShopOrderByShopId(String shopId) {
        return mapper.getShopOrderByShopId(shopId);
    }

    @Override
    public List<ShopOrder> getOrderByStatus(String shopId, int status) {
        return mapper.getShopOrderByStatus(shopId,status);
    }


}
