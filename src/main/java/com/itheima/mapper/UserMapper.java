package com.itheima.mapper;

import com.itheima.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> findAll();

    // 清空表数据
    @Delete("TRUNCATE TABLE user")
    void clearTable();

    // 添加数据
    @Insert("INSERT INTO user (name, age) VALUES (#{name}, #{age})")
    void insertUser(@Param("name") String name, @Param("age") Integer age);
}
