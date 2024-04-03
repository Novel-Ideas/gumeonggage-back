package com.novelidea.gumeonggage.service;

import com.novelidea.gumeonggage.dto.SigninReqDto;
import com.novelidea.gumeonggage.dto.SignupReqDto;
import com.novelidea.gumeonggage.entity.User;
import com.novelidea.gumeonggage.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class) // 전화번호 가입
    public void signup(SignupReqDto signupReqDto){
        User user = signupReqDto.toEntity();
        userMapper.saveUser(user);
    }

    public User signin(SigninReqDto signinReqDto) { // 전화번호 조회
        User user = userMapper.findUserByPhonenumber(signinReqDto.getPhoneNumber());
        // * exception만들기
        return user != null ? user : null;
    }


}
