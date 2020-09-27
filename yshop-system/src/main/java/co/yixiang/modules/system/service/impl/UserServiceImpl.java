package co.yixiang.modules.system.service.impl;

import co.yixiang.gen.dao.UserMapper;
import co.yixiang.gen.domain.User;
import co.yixiang.gen.domain.UserExample;
import co.yixiang.modules.system.service.mapper.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public int save(User user) {
        return mapper.insertSelective(user);
    }

    @Override
    public List <User> findByPhone(String phone) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(phone);
        return mapper.selectByExample(example);
    }

}
