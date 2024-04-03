package com.novelidea.gumeonggage.service.admin;

import com.novelidea.gumeonggage.dto.admin.AdminSignupReqDto;
import com.novelidea.gumeonggage.entity.admin.Admin;
import com.novelidea.gumeonggage.entity.user.User;
import com.novelidea.gumeonggage.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminAuthService {
    @Autowired
    UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)// * 롤 계정 머지
    public void adminSignup(AdminSignupReqDto adminSignupReqDto) {
        Admin admin = adminSignupReqDto.toEntity();
        userMapper.saveAdmin(admin);
    }

    public String adminSignin(AdminSignupReqDto adminSignupReqDto) {
        Admin admin = userMapper.findAdminByUsername(adminSignupReqDto.getUsername());

    }

}
