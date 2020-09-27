package co.yixiang.gen.dao;

import co.yixiang.gen.domain.YxOrder;
import co.yixiang.gen.domain.YxOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("orderMapper")
public interface YxOrderMapper {
    long countByExample(YxOrderExample example);

    int deleteByExample(YxOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YxOrder record);

    int insertSelective(YxOrder record);

    YxOrder selectOneByExample(YxOrderExample example);

    YxOrder selectOneByExampleSelective(@Param("example") YxOrderExample example, @Param("selective") YxOrder.Column ... selective);

    List<YxOrder> selectByExampleSelective(@Param("example") YxOrderExample example, @Param("selective") YxOrder.Column ... selective);

    List<YxOrder> selectByExample(YxOrderExample example);

    YxOrder selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") YxOrder.Column ... selective);

    YxOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YxOrder record, @Param("example") YxOrderExample example);

    int updateByExample(@Param("record") YxOrder record, @Param("example") YxOrderExample example);

    int updateByPrimaryKeySelective(YxOrder record);

    int updateByPrimaryKey(YxOrder record);
}