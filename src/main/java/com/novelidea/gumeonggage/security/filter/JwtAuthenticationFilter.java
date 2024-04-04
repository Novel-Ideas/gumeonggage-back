package com.novelidea.gumeonggage.security.filter;

import com.novelidea.gumeonggage.jwt.JwtProvider;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class JwtAuthenticationFilter extends GenericFilter {

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        boolean isPermitAll = (Boolean) request.getAttribute("isPermitAll");

        if (!isPermitAll) {// 인증이 필요없으면 그냥 다음 필터로 넘어감
            String accessToken = request.getHeader("Authorization");
            String removedBearerToken = jwtProvider.removeBearer(accessToken);
            Claims claims = null;
            try {
                claims = jwtProvider.getClaims(removedBearerToken); // 요청 유알엘에 따라서 이거 실행할건지 말건지
            } catch (Exception e) {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED);//401 에러 -인증실패
                return;
            }

            Authentication authentication = jwtProvider.getAuthentication(claims);

            if(authentication == null) {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED);//401 에러 -인증실패
                return;
            }

            SecurityContextHolder.getContext().setAuthentication(authentication);
//        }


            //전처리
            filterChain.doFilter(request, response);
            //후처리
        }


    }
}
