package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public int saveUser(User user);
    public User findUserByPhonenumber(String phoneNumber);
    public int useUserByPoint(int point);
    public int saveUserByPoint(int point):
}
