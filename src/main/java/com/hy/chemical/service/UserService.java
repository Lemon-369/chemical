package com.hy.chemical.service;

import com.hy.chemical.pojo.Users;

import java.util.List;

public interface UserService {
    public Users query(int id);
    public List<Users> queryAll();
}
