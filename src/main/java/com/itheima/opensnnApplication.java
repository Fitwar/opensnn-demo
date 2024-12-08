package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itheima.mapper")  // 添加 Mapper 扫描
public class opensnnApplication {
    public static void main(String[] args) {
        SpringApplication.run(opensnnApplication.class, args);
    }
}
