package com.hy.chemical.service;

import com.hy.chemical.pojo.User;
import com.hy.chemical.vo.UserKey;

import java.util.List;

public interface UserService {

    /**
     * 登录验证
     * @param key
     * @return
     */
    int login(UserKey key);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    public User query(int id);

    /**
     * 查询所有业务员
     * @return
     */
    public List<User> queryAll();
}