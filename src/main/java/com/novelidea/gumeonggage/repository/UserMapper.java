package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.admin.Admin;
import com.novelidea.gumeonggage.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public int saveUser(User user);// 유저 회원가입 - .xml
    public User findUserByPhonenumber(String phoneNumber); //유저 로그인



}
