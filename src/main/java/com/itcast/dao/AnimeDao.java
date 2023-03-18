package com.itcast.dao;

import com.itcast.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnimeDao {

//  查询所有user
    List<User> selectAll();

//  根据name查询user
    @Select("select name, c1, c2 from user where name = #{name}")
    User selectByName(String name);

}
