package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.dto.user.UserUseOrSavePointReqDto;
import com.novelidea.gumeonggage.entity.User;
import com.novelidea.gumeonggage.repository.PointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPointService {

    @Autowired
    private PointMapper pointMapper;

    public int getPointByPhoneNumber(String phonenumber) {
        return pointMapper.getPoint(phonenumber);
    }

    public int useOrSavePointByNumber(UserUseOrSavePointReqDto UserUseOrSavePointReqDto) {
        User user = pointMapper.findUser(UserUseOrSavePointReqDto.getPhoneNumber());
        if(user != null) {
            return pointMapper.useOrSavePoint(
                    user.getUserId(),
                    UserUseOrSavePointReqDto.getPoint());
        }

        return 0;
    }
}
