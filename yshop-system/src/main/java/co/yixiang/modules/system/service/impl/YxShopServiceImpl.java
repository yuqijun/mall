package co.yixiang.modules.system.service.impl;

import co.yixiang.gen.dao.YxShopMapper;
import co.yixiang.gen.domain.YxShop;
import co.yixiang.gen.domain.YxShopExample;
import co.yixiang.modules.system.service.mapper.IYxShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class YxShopServiceImpl implements IYxShopService {
    @Autowired
    private YxShopMapper mapper;
    @Override
    public List<YxShop> getByUserId(int userId) {
        YxShopExample example = new YxShopExample();
        YxShopExample.Criteria criteria =example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return mapper.selectByExampleSelective(example);
    }
}
