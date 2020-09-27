package co.yixiang.modules.system.service.mapper;

import co.yixiang.gen.domain.increase.Coupon;

import java.util.List;

public interface ICouponService {
    List<Coupon> getUserCoupon(int shopId,int classType,int userId);
}
