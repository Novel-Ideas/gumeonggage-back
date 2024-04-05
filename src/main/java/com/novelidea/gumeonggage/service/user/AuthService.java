package com.novelidea.gumeonggage.service.user;


import com.novelidea.gumeonggage.dto.user.UserSignupReqDto;
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
    public void signup(UserSignupReqDto userSignupReqDto){
        User user = userSignupReqDto.toEntity();
        userMapper.saveUser(user);
        System.out.println("유저 서비스옴? ");
    }



}
