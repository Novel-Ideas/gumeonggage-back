package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.user.User;
import com.novelidea.gumeonggage.entity.user.Point;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PointMapper {
    public User findUser(String phoneNumber);
    public int getPoint(String phoneNumber);
    public int useOrSavePoint(
            @Param("userId") int userId,
            @Param("currentPoint") int currentPoint,
            @Param("orderListId") int orderListId);
}
