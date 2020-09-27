package co.yixiang.modules.system.service.impl;

import co.yixiang.gen.dao.YxProductManulMapper;
import co.yixiang.gen.domain.increase.ProductManul;
import co.yixiang.modules.system.service.mapper.IYxProductManulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YxProductManulServiceImpl  implements IYxProductManulService {

    @Autowired
    private YxProductManulMapper  productManulMapper;
    public List<ProductManul> getByClassId(int classId){
        return productManulMapper.getByClassId(classId);
    }

    @Override
    public List<ProductManul> searchProductName(String productName) {
        return productManulMapper.searchByProductName(productName);
    }

}
