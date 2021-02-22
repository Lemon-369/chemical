package com.hy.chemical.service;

import com.hy.chemical.pojo.User;

import java.util.List;

public interface UserService {
    public User query(int id);
    public List<User> queryAll();
}