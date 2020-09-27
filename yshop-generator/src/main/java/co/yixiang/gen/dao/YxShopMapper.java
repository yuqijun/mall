package co.yixiang.gen.dao;

import co.yixiang.gen.domain.YxShop;
import co.yixiang.gen.domain.YxShopExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface YxShopMapper {
    long countByExample(YxShopExample example);

    int deleteByExample(YxShopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YxShop record);

    int insertSelective(YxShop record);

    YxShop selectOneByExample(YxShopExample example);

    YxShop selectOneByExampleSelective(@Param("example") YxShopExample example, @Param("selective") YxShop.Column ... selective);

    List<YxShop> selectByExampleSelective(@Param("example") YxShopExample example, @Param("selective") YxShop.Column ... selective);

    List<YxShop> selectByExample(YxShopExample example);

    YxShop selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") YxShop.Column ... selective);

    YxShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YxShop record, @Param("example") YxShopExample example);

    int updateByExample(@Param("record") YxShop record, @Param("example") YxShopExample example);

    int updateByPrimaryKeySelective(YxShop record);

    int updateByPrimaryKey(YxShop record);
}