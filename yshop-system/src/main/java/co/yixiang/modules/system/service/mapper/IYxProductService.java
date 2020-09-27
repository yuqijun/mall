package co.yixiang.modules.system.service.mapper;

import co.yixiang.gen.domain.YxProduct;

import java.util.List;

public interface IYxProductService {
    List<YxProduct> getAllByShopId(int shopId);

    List<YxProduct>getByClassId (int classId);
}
