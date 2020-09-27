package co.yixiang.gen.dao;

import co.yixiang.gen.domain.YxCoupon;
import co.yixiang.gen.domain.YxCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YxCouponMapper {
    long countByExample(YxCouponExample example);

    int deleteByExample(YxCouponExample example);

    int deleteByPrimaryKey(Integer couponId);

    int insert(YxCoupon record);

    int insertSelective(YxCoupon record);

    YxCoupon selectOneByExample(YxCouponExample example);

    YxCoupon selectOneByExampleSelective(@Param("example") YxCouponExample example, @Param("selective") YxCoupon.Column ... selective);

    List<YxCoupon> selectByExampleSelective(@Param("example") YxCouponExample example, @Param("selective") YxCoupon.Column ... selective);

    List<YxCoupon> selectByExample(YxCouponExample example);

    YxCoupon selectByPrimaryKeySelective(@Param("couponId") Integer couponId, @Param("selective") YxCoupon.Column ... selective);

    YxCoupon selectByPrimaryKey(Integer couponId);

    int updateByExampleSelective(@Param("record") YxCoupon record, @Param("example") YxCouponExample example);

    int updateByExample(@Param("record") YxCoupon record, @Param("example") YxCouponExample example);

    int updateByPrimaryKeySelective(YxCoupon record);

    int updateByPrimaryKey(YxCoupon record);
}