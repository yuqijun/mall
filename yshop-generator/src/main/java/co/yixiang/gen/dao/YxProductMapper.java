package co.yixiang.gen.dao;

import co.yixiang.gen.domain.YxProduct;
import co.yixiang.gen.domain.YxProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface YxProductMapper {
    long countByExample(YxProductExample example);

    int deleteByExample(YxProductExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(YxProduct record);

    int insertSelective(YxProduct record);

    YxProduct selectOneByExample(YxProductExample example);

    YxProduct selectOneByExampleSelective(@Param("example") YxProductExample example, @Param("selective") YxProduct.Column ... selective);

    List<YxProduct> selectByExampleSelective(@Param("example") YxProductExample example, @Param("selective") YxProduct.Column ... selective);

    List<YxProduct> selectByExample(YxProductExample example);

    YxProduct selectByPrimaryKeySelective(@Param("pId") Integer pId, @Param("selective") YxProduct.Column ... selective);

    YxProduct selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") YxProduct record, @Param("example") YxProductExample example);

    int updateByExample(@Param("record") YxProduct record, @Param("example") YxProductExample example);

    int updateByPrimaryKeySelective(YxProduct record);

    int updateByPrimaryKey(YxProduct record);
}