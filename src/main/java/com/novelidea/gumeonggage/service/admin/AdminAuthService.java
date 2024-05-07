package com.novelidea.gumeonggage.service.admin;

import com.novelidea.gumeonggage.dto.admin.AdminSignupReqDto;
import com.novelidea.gumeonggage.entity.Admin;
import com.novelidea.gumeonggage.entity.User;
import com.novelidea.gumeonggage.exception.SaveException;
import com.novelidea.gumeonggage.jwt.JwtProvider;
import com.novelidea.gumeonggage.repository.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminAuthService {
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;
    @Autowired
    JwtProvider jwtProvider;

    @Transactional(rollbackFor = Exception.class)// * 롤 계정 머지
    public void adminSignup(AdminSignupReqDto adminSignupReqDto) {
        System.out.println("서비스 진입");
        int successCount = 0;
        Admin admin = adminSignupReqDto.toEntity(passwordEncoder);

        successCount += adminMapper.saveAdmin(admin);
        successCount += adminMapper.saveRole(admin.getAdminId(),1);

        if(successCount < 2) {
            throw new SaveException();
        }
    }

//    @Transactional(rollbackFor = Exception.class)
//    public void oAuth2Signup(OAuth2SignupReqDto oAuth2SignupReqDto) {
//
//    }

    public String adminSignin(AdminSignupReqDto adminSignupReqDto) {
        Admin admin = adminMapper.findAdminByUsername(adminSignupReqDto.getUsername());
        if( admin == null) {
            throw new UsernameNotFoundException("사용자 정보를 확인하세요");
        }
        if(!passwordEncoder.matches(adminSignupReqDto.getPassword(), admin.getAdminPassword())) {// getpassword를 만들어줘야함??
            throw new BadCredentialsException("사용자 정보를 확인하세요");
        }
        return jwtProvider.generateToken(admin);
    }

}
