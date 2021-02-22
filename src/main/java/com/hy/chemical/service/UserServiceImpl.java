package com.hy.chemical.service;

import com.hy.chemical.mapper.UserMapper;
import com.hy.chemical.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;


    @Override   //根据id查询
    public User query(int id) {
        return userMapper.selectById(id);
    }

    @Override   //查询所有
    public List<User> queryAll() {
        return userMapper.selectList(null);
    }
}
