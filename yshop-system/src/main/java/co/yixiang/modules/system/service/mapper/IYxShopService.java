package co.yixiang.modules.system.service.mapper;

import co.yixiang.gen.domain.YxShop;

import java.util.List;

public interface IYxShopService {
    public List<YxShop> getByUserId(int userId);
}
