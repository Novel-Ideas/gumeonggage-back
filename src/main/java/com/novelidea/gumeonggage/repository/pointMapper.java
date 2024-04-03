package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.dto.user.UserPointRespDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface pointMapper {
    public UserPointRespDto getPoint();
}
