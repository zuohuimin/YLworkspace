package cn.zhomp.module.service.impl;

import cn.zhomp.entity.User;
import cn.zhomp.module.dao.UserDao;
import cn.zhomp.module.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    public List<User> selectUser(){

        return userDao.selectUser();
    }
}
