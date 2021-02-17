package com.hy.chemical;

import com.hy.chemical.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ChemicalApplicationTests {
    @Autowired
    private UserServiceImpl userService;
    @Test
    public void test(){
        //测试查询
        System.out.println(userService.queryAll());
    }

}
