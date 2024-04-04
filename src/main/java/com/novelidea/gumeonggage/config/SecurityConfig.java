package com.novelidea.gumeonggage.config;


import com.novelidea.gumeonggage.security.exception.AuthEntryPoint;
import com.novelidea.gumeonggage.security.filter.JwtAuthenticationFilter;
import com.novelidea.gumeonggage.security.filter.PermitAllFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutFilter;


@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private PermitAllFilter permitAllFilter;

    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;


    @Autowired
    private AuthEntryPoint authEntryPoint;

//    @Autowired
//    private OAuth2PrincipalUserService oAuth2PrincipalUserService;


//    @Autowired
//    private OAuth2SuccessHandler oAuth2SuccessHandler;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors();
        http.csrf().disable();//csrf 검사하지마  //서버사이드랜더링/ 클라이언트 알아보기

        http.authorizeRequests() //빌더 패턴으러 - 요청이들어오면 아래 절차를 거쳐라 // . . . 찍는건 빌더패턴
                .antMatchers("/server/**", "/auth/**")// "/server/**" 서버라는 요청주소에 뒤에 머가 들어오든
                // (여기에 들어오면 인증이 필요없다 = 얘들은 허용해줘라)
                .permitAll()  //permit(권한)허용해라
                .antMatchers("/mail/authenticate")
                .permitAll()
                .antMatchers("/admin/**")
                .hasRole("ADMIN")
                .anyRequest() // 나머지 모든요청은
                .authenticated() //인증받아라
                .and()
                .addFilterAfter(permitAllFilter, LogoutFilter.class)// 위에 보다 얘들이 먼저다 매개변수 순서대로 간다 1하고 2
                // 요청들어왔을떄 url분석해서 바로보낼건지 jwtAuthenticationFilter거칠지 결정한다
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .exceptionHandling()
                .authenticationEntryPoint(authEntryPoint);
//                .and()
//                .oauth2Login()// 로그인 시작 이거 다는순간에 oauth2 정보들을 가지고와서 필터 거칠거다
//                .successHandler(oAuth2SuccessHandler)
//                .userInfoEndpoint()
//                // OAuth2로그인 토큰검사
//                .userService(oAuth2PrincipalUserService);
    }

}
