package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.user.User;
import com.novelidea.gumeonggage.entity.user.Point;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PointMapper {
    public User findUser(String phonenumber);
    public int getPoint(String phonenumber);
    public int useOrSavePoint(
            @Param("userId") int userId,
            @Param("point") int point,
            @Param("orderListId") int orderListId);
}