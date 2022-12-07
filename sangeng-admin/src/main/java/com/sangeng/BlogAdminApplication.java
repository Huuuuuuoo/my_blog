package com.sangeng;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author 三更  B站： https://space.bilibili.com/663528522
 */
@SpringBootApplication
@MapperScan("com.sangeng.mapper")
@EnableTransactionManagement
public class BlogAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogAdminApplication.class, args);
    }
}
