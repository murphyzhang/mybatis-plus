package com.baomidou.springmvc.service.system.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.springmvc.mapper.system.UserMapper;
import com.baomidou.springmvc.model.system.User;
import com.baomidou.springmvc.service.system.IUserService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public void insertUser() {
        baseMapper.insertUser();
    }

    @Override
    public void insertUser2() {
        User user = new User();
        user.setName("cccc");
        user.setAge(222);
        user.setCtime(new Date());
        baseMapper.insert(user);
    }
}