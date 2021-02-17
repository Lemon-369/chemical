package com.hy.chemical.service;

import com.hy.chemical.mapper.UserMapper;
import com.hy.chemical.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;


    @Override
    public Users query(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<Users> queryAll() {
        return userMapper.selectList(null);
    }
}
