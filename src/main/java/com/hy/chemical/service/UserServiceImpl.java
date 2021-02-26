package com.hy.chemical.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hy.chemical.mapper.UserMapper;
import com.hy.chemical.pojo.User;
import com.hy.chemical.vo.UserKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    /**
     * 登录验证
     * @param
     * @return
     */
    @Override
    public int login(UserKey key) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (!key.getUsername().isEmpty() && !key.getPassword().isEmpty()){
            queryWrapper.eq("user_name",key.getUsername());
            queryWrapper.eq("password",key.getPassword());
            List<User> users = userMapper.selectList(queryWrapper);
            if(!users.isEmpty()){
                return 1;
            }else {
                return 0;
            }
        }
        return 2;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Override
    public User query(int id) {
        return userMapper.selectById(id);
    }

    /**
     * 查询所有 这里selectList方法的参数是一个Wrapper，条件构造器，不需要时 为NUll即可
     * @return
     */
    @Override
    public List<User> queryAll() {
        return userMapper.selectList(null);
    }
}
