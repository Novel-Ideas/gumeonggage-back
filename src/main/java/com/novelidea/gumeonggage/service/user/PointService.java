package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.dto.user.UserPointRespDto;
import com.novelidea.gumeonggage.entity.user.UserPoint;
import com.novelidea.gumeonggage.repository.PointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointService {

    @Autowired
    private PointMapper pointMapper;

    public UserPointRespDto getPointByNumber(String number) {
        UserPoint userPoint = pointMapper.getPoint(number);

        return UserPointRespDto.builder()
                .phoneNumber(userPoint.getPhoneNumber())
                .point(userPoint.getPoint())
                .build();
    }
}
