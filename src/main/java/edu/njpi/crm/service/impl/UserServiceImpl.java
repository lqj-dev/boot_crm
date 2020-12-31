package edu.njpi.crm.service.impl;

import edu.njpi.crm.mapper.UserMapper;
import edu.njpi.crm.model.User;
import edu.njpi.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2020/12/16 2:00 下午
 * @Created by lqj(1724226325@qq.com)
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUser(String userCode,String password) {
        return userMapper.findUser(userCode,password);
    }
}
