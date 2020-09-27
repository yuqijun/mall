package co.yixiang.test;

import co.yixiang.gen.GApplication;
import co.yixiang.gen.dao.UserMapper;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)//设置启动器
@SpringBootTest(classes={GApplication.class})//指定启动类''

public class UserTest {

//    @Resource
//    private UserMapper mapper;
//
//    @Test
//    public void getById(){
//        UserExample example = new UserExample();
//        UserExample.Criteria criteria = example.createCriteria();
//        criteria.andIdEqualTo(3l);
//        System.err.println("user=="+mapper.selectByExample(example));
//    }
    @Autowired
    private UserMapper mapper;

    @Test
    public void getById (){

        System.err.println("user=="+mapper.selectByPrimaryKey(3l));
    }

}