package com.novelidea.gumeonggage.service;

import com.novelidea.gumeonggage.dto.SignupReqDto;
import com.novelidea.gumeonggage.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    @Transactional(rollbackFor = Exception.class)
    public void signup(SignupReqDto signupReqDto){
        User user = signupReqDto.toEntity();
        user
    }
}
