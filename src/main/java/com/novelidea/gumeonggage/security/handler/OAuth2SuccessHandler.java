package com.novelidea.gumeonggage.security.handler;

import com.novelidea.gumeonggage.entity.Admin;
import com.novelidea.gumeonggage.jwt.JwtProvider;
import com.novelidea.gumeonggage.repository.AdminMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class OAuth2SuccessHandler implements AuthenticationSuccessHandler {

    @Value("${client.deploy-address}")
    private String clientAddress;

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        System.out.println("여기야 여기" + authentication);
        String name = authentication.getName();
        Admin admin = adminMapper.findAdminByOAuth2name(name);
        System.out.println("admin:" + admin);

        if(admin == null ) {
            System.out.println("여기로 와라랏");
            DefaultOAuth2User oAuth2User= (DefaultOAuth2User) authentication.getPrincipal();
            String providerName = oAuth2User.getAttribute("provider").toString();

            response.sendRedirect("http://" + clientAddress + "/oauth2?name=" + name + "&provider=" + providerName);
            return;
        }

        String accessToken = jwtProvider.generateToken(admin);
        response.sendRedirect("http://" + clientAddress + "/oauth2/signin?accessToken=" +accessToken);

    }
}

