package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.dto.user.SigninReqDto;
import com.novelidea.gumeonggage.dto.user.SignupReqDto;
import com.novelidea.gumeonggage.dto.user.UseEarnPointReqDto;
import com.novelidea.gumeonggage.entity.user.User;
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
        User user = signinReqDto.toEntity();
        userMapper.findUserByPhonenumber(signinReqDto.getPhoneNumber());
        // * exception만들기
        return user != null ? user : null;
    }

    public int usepoint(UseEarnPointReqDto useEarnPointReqDto ) {
        User user = userMapper.useUserByPoint(useEarnPointReqDto.getPoint());
        return useEarnPointReqDto.getPoint(); // * 리턴 문
    }

    public int savepoint(UseEarnPointReqDto useEarnPointReqDto) {
        User user = userMapper.saveUserByPoint(useEarnPointReqDto.getPoint());
        return (null); // * 리턴 문
    }



}
