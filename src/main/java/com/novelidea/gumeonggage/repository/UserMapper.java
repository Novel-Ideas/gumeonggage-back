package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public int saveUser(User user);// 유저 회원가입 - .xml




}
