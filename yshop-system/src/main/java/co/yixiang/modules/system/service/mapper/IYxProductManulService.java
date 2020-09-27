package co.yixiang.modules.system.service.mapper;

import co.yixiang.gen.domain.increase.ProductManul;

import java.util.List;

public interface IYxProductManulService {
    public List<ProductManul> getByClassId(int classId);
    public List<ProductManul> searchProductName(String productName);
}
