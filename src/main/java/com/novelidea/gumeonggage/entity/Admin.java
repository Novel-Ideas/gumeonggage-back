package com.novelidea.gumeonggage.entity;

import com.novelidea.gumeonggage.entity.OAuth2.OAuth2;
import com.novelidea.gumeonggage.security.PrincipalUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Admin {
    private int adminId;
    private String adminName;
    private String adminPassword;
    private String name;
    private String email;
    private LocalDate createDate;
    private LocalDate updateDate;

    private List<AdminRoleRegister> adminRoleRegisters;
    private List<OAuth2> oAuth2s;

    public List<SimpleGrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (AdminRoleRegister adminRoleRegister : adminRoleRegisters) {
            authorities.add(new SimpleGrantedAuthority(adminRoleRegister.getRole().getRoleName()));
        }
        return authorities;
    }

    public PrincipalUser toPrincipalUser() {
        return PrincipalUser.builder()
                .userId(adminId)
                .username(adminName)
                .name(name)
                .email(email)
                .authorities(getAuthorities())
                .build();
    }
}
