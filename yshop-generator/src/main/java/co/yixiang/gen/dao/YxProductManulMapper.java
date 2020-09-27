package co.yixiang.gen.dao;

import co.yixiang.gen.domain.increase.ProductManul;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface YxProductManulMapper {
    List<ProductManul> getByClassId(@Param("classId") int classId);
    List<ProductManul> searchByProductName(@Param("productName") String productName);
}