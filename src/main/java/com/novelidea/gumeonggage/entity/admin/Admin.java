package com.novelidea.gumeonggage.entity.admin;

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
    private int roleId;
    private String adminName;
    private String adminPassword;
    private String name;
    private String email;
    private LocalDate createDate;
    private LocalDate updateDate;

    public List<SimpleGrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for(RoleRegister roleRegister : roleRegisters) {
            authorities.add(new SimpleGrantedAuthority(roleRegister.getRole().getRoleName()));
        }
        return authorities;
}
