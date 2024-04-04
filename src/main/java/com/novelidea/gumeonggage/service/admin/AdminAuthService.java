package com.novelidea.gumeonggage.service.admin;

import com.novelidea.gumeonggage.dto.admin.AdminSignupReqDto;
import com.novelidea.gumeonggage.entity.admin.Admin;
import com.novelidea.gumeonggage.entity.user.User;
import com.novelidea.gumeonggage.repository.AdminMapper;
import com.novelidea.gumeonggage.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminAuthService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Transactional(rollbackFor = Exception.class)// * 롤 계정 머지
    public void adminSignup(AdminSignupReqDto adminSignupReqDto) {
        Admin admin = adminSignupReqDto.toEntity();
        AdminMapper.saveAdmin(admin);
    }

    public String adminSignin(AdminSignupReqDto adminSignupReqDto) {
        Admin admin = AdminMapper.findAdminByUsername(adminSignupReqDto.getUsername());
        if( admin == null) {
            throw new UsernameNotFoundException("사용자 정보를 확인하세요");
        }
        if(!passwordEncoder.matches(adminSignupReqDto.getPassword(), admin.getAdminPassword())) {// getpassword를 만들어줘야함??
            throw new BadCredentialsException("사용자 정보를 확인하세요");
        }
    }

}
