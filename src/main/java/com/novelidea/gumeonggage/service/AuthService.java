package com.novelidea.gumeonggage.service;

import com.novelidea.gumeonggage.dto.SignupReqDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    @Transactional(rollbackFor = Exception.class)
    public void signup(SignupReqDto signupReqDto){

    }
}
