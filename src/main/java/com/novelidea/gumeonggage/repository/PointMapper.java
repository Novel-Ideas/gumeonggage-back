package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.user.UserPoint;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PointMapper {
    public UserPoint getPoint(String number);
}
