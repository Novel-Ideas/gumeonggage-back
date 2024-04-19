package com.novelidea.gumeonggage.service.admin.OAuth2;

import com.novelidea.gumeonggage.dto.admin.OAuth2.OAuth2MergeReqDto;
import com.novelidea.gumeonggage.dto.admin.OAuth2.OAuth2SignupReqDto;
import com.novelidea.gumeonggage.entity.Admin;
import com.novelidea.gumeonggage.entity.OAuth2.OAuth2;
import com.novelidea.gumeonggage.exception.SaveException;
import com.novelidea.gumeonggage.jwt.JwtProvider;
import com.novelidea.gumeonggage.repository.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OAuth2Service {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private JwtProvider jwtProvider;

    @Transactional(rollbackFor = Exception.class)
    public void oAuth2Signup(OAuth2SignupReqDto oAuth2SignupReqDto) {
        int successCount = 0;
        Admin admin = oAuth2SignupReqDto.toEntity(passwordEncoder);
        successCount += adminMapper.saveAdmin(admin);
        successCount += adminMapper.saveRole(admin.getAdminId(),1);
        successCount += adminMapper.saveOAuth2(oAuth2SignupReqDto.toOAuth2Entity(admin.getAdminId()));

        if(successCount < 3) {
            throw new SaveException();
        }
    }

    public void oAuth2Merge(OAuth2MergeReqDto oAuth2MergeReqDto) {
        Admin admin = adminMapper.findAdminByUsername(oAuth2MergeReqDto.getUsername());

        if(admin == null) {
            throw new UsernameNotFoundException("사용자 정보를 확인하세요");
        }
        if(!passwordEncoder.matches(oAuth2MergeReqDto.getPassword(),admin.getAdminPassword())) {
            throw new BadCredentialsException("사용자 정보를 확인하세요");
        }
        OAuth2 oAuth2 = OAuth2.builder()
                .oAuth2Name(oAuth2MergeReqDto.getOauth2Name())
                .adminId(admin.getAdminId())
                .providerName(oAuth2MergeReqDto.getProviderName())
                .build();
        adminMapper.saveOAuth2(oAuth2);
    }
}
