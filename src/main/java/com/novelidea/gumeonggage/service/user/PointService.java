package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.dto.user.UseOrSavePointReqDto;
import com.novelidea.gumeonggage.dto.user.UserOrderMenusReqDto;
import com.novelidea.gumeonggage.dto.user.UserPointRespDto;
import com.novelidea.gumeonggage.entity.user.User;
import com.novelidea.gumeonggage.entity.user.Point;
import com.novelidea.gumeonggage.repository.PointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointService {

    @Autowired
    private PointMapper pointMapper;

    public int getPointByPhoneNumber(String phonenumber) {
        return pointMapper.getPoint(phonenumber);
    }

    public int useOrSavePointByNumber(UseOrSavePointReqDto useOrSavePointReqDto) {
        User user = pointMapper.findUser(useOrSavePointReqDto.getPhoneNumber());
        if(user != null) {
            return pointMapper.useOrSavePoint(
                    user.getUserId(),
                    useOrSavePointReqDto.getPoint(),
                    useOrSavePointReqDto.getOrderListId());
        }

        return 0;
    }
}
