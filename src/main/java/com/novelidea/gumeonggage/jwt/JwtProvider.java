package com.novelidea.gumeonggage.jwt;

import com.novelidea.gumeonggage.entity.User;
import com.novelidea.gumeonggage.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.security.Key;
import java.util.Collection;

@Component
public class JwtProvider {
    private final Key key;
    private UserMapper userMapper;
//    public JwtProvider(@Valid("${jwt.secret}") String secret,
//                       @Autowired UserMapper userMapper) {
//        key = Keys.h
//    }
    public String generateToken(User user) {
        int UserId = user.getUserId();
        String username = user.getPhoneNumber();
        Collection<? extends GrantedAuthority> authorities = user.get
    }
}
