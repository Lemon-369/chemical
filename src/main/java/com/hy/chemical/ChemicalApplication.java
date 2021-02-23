package com.hy.chemical;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 标注一个主程序类，表示这是一个Spring Boot 应用
 */
//@MapperScan("com.hy.chemical.mapper")  //扫描mapper包下的所有接口
@SpringBootApplication
public class ChemicalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChemicalApplication.class, args);
        System.out.println("Hello Spring-Boot !");
    }

}
