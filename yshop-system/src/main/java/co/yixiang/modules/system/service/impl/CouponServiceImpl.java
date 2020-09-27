package co.yixiang.modules.system.service.impl;

import co.yixiang.gen.dao.CouponMapper;
import co.yixiang.gen.domain.increase.Coupon;
import co.yixiang.modules.system.service.mapper.ICouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CouponServiceImpl implements ICouponService {
    @Autowired
    private CouponMapper mapper;
    @Override
    public List<Coupon> getUserCoupon(int shopId, int classType, int userId) {
        return mapper.getUserCoupon(shopId,classType,userId);
    }
}
