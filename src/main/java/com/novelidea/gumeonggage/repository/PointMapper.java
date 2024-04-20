package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PointMapper {
    public User findUser(String phonenumber);
    public Integer getPoint(String phonenumber);
    public int useOrSavePoint(
            @Param("userId") int userId,
            @Param("point") int point);
}
