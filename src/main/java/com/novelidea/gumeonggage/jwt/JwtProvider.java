package com.novelidea.gumeonggage.jwt;

import com.novelidea.gumeonggage.entity.user.User;
import com.novelidea.gumeonggage.repository.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {
//    private final Key key;
    private UserMapper userMapper;
//    public JwtProvider(@Valid("${jwt.secret}") String secret,
//                       @Autowired UserMapper userMapper) {
//        key = Keys.h
//    }
    public String generateToken(User user) {
        int UserId = user.getUserId();
        String username = user.getPhoneNumber();
//        Collection<? extends GrantedAuthority> authorities = user.get
        return null;
    }
}
