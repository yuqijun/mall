package co.yixiang.modules.system.service.impl;

import co.yixiang.gen.dao.YxOrderMapper;
import co.yixiang.gen.domain.YxOrder;
import co.yixiang.gen.domain.YxOrderExample;
import co.yixiang.gen.domain.YxProduct;
import co.yixiang.gen.domain.increase.ShopOrder;
import co.yixiang.gen.domain.increase.ShopProduct;
import co.yixiang.modules.system.service.mapper.IYxOrderServer;
import co.yixiang.modules.system.service.mapper.IYxProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class YxOrderServiceImpl implements IYxOrderServer {
    @Resource
    private YxOrderMapper mapper;

    @Transactional
    @Override
    public int add(List<YxOrder> orderList) {
        int row = 0;
        for(YxOrder order : orderList){
            row += mapper.insertSelective(order);
        }
        return row;
    }




}
