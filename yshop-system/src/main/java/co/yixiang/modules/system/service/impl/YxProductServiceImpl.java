package co.yixiang.modules.system.service.impl;

import co.yixiang.gen.dao.YxProductMapper;
import co.yixiang.gen.domain.YxProduct;
import co.yixiang.gen.domain.YxProductExample;
import co.yixiang.modules.system.service.mapper.IYxProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class YxProductServiceImpl implements IYxProductService {
    @Autowired
    private YxProductMapper mapper;
    /*
    根据店铺id返回该店铺的所有产品的 产品信息
     */
    @Override
    public List<YxProduct> getAllByShopId(int shopId) {
        YxProductExample example = new YxProductExample();
        YxProductExample.Criteria criteria = example.createCriteria();
        criteria.andShopIdEqualTo(shopId);
        return mapper.selectByExampleSelective(example);
    }

    @Override
    public List<YxProduct> getByClassId(int classId) {
        YxProductExample example = new YxProductExample();
        YxProductExample.Criteria criteria = example.createCriteria();
        criteria.andClassIdEqualTo(classId);
        return mapper.selectByExampleSelective(example);
    }
}
