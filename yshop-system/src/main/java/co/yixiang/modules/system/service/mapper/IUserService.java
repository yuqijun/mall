package co.yixiang.modules.system.service.mapper;

import co.yixiang.gen.domain.User;

import java.util.List;

public interface IUserService {
    public int save(User user);
    public List<User> findByPhone(String phone);
}
