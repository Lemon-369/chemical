package com.hy.chemical.controller;

import com.hy.chemical.service.UserServiceImpl;
import com.hy.chemical.vo.UserKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhang
 * @date 2021/2/26 14:23
 */
@Controller
@CrossOrigin
public class LoginController {
    @Autowired
    private UserServiceImpl service;

    @ResponseBody
    @PostMapping(value = "/user/login")
    public int login(UserKey key){
        return service.login(key);
    }
}
