package co.yixiang.gen.dao;

import co.yixiang.gen.domain.increase.Coupon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CouponMapper {
    //获取用户可用的优惠券
    List<Coupon> getUserCoupon(@Param("shopId")int shopId,@Param("classType")int classType,@Param("userId")int userId);
}
