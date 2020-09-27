package co.yixiang.gen.dao;

import co.yixiang.gen.domain.YxCouponTemp;
import co.yixiang.gen.domain.YxCouponTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YxCouponTempMapper {
    long countByExample(YxCouponTempExample example);

    int deleteByExample(YxCouponTempExample example);

    int deleteByPrimaryKey(Integer couponTempId);

    int insert(YxCouponTemp record);

    int insertSelective(YxCouponTemp record);

    YxCouponTemp selectOneByExample(YxCouponTempExample example);

    YxCouponTemp selectOneByExampleSelective(@Param("example") YxCouponTempExample example, @Param("selective") YxCouponTemp.Column ... selective);

    List<YxCouponTemp> selectByExampleSelective(@Param("example") YxCouponTempExample example, @Param("selective") YxCouponTemp.Column ... selective);

    List<YxCouponTemp> selectByExample(YxCouponTempExample example);

    YxCouponTemp selectByPrimaryKeySelective(@Param("couponTempId") Integer couponTempId, @Param("selective") YxCouponTemp.Column ... selective);

    YxCouponTemp selectByPrimaryKey(Integer couponTempId);

    int updateByExampleSelective(@Param("record") YxCouponTemp record, @Param("example") YxCouponTempExample example);

    int updateByExample(@Param("record") YxCouponTemp record, @Param("example") YxCouponTempExample example);

    int updateByPrimaryKeySelective(YxCouponTemp record);

    int updateByPrimaryKey(YxCouponTemp record);
}