package com.novelidea.gumeonggage.jwt;

import com.novelidea.gumeonggage.entity.admin.Admin;
import com.novelidea.gumeonggage.entity.user.User;
import com.novelidea.gumeonggage.repository.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Slf4j
public class JwtProvider {

    private UserMapper userMapper;

    public String generateToken(Admin admin) {
        int adminId = admin.getAdminId();
        String username = admin.getAdminName();
        Collection<? extends GrantedAuthority> authorities = admin.
        return null;
    }
}
