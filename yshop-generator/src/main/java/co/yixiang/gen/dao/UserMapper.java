package co.yixiang.gen.dao;

import co.yixiang.gen.domain.User;
import co.yixiang.gen.domain.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectOneByExample(UserExample example);

    User selectOneByExampleSelective(@Param("example") UserExample example, @Param("selective") User.Column ... selective);

    List<User> selectByExampleSelective(@Param("example") UserExample example, @Param("selective") User.Column ... selective);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") User.Column ... selective);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}