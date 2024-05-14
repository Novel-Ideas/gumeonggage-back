package com.novelidea.gumeonggage.controller.admin;

import com.novelidea.gumeonggage.aop.annotation.ValidAspect;
import com.novelidea.gumeonggage.dto.admin.AdminSignupReqDto;
import com.novelidea.gumeonggage.dto.admin.OAuth2.OAuth2MergeReqDto;
import com.novelidea.gumeonggage.dto.admin.OAuth2.OAuth2SignupReqDto;
import com.novelidea.gumeonggage.service.admin.AdminAuthService;
import com.novelidea.gumeonggage.service.admin.OAuth2.OAuth2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/admin/auth")
public class AdminAuthController {

    @Autowired
    AdminAuthService adminAuthService;
    @Autowired
    OAuth2Service oAuth2Service;

    @ValidAspect
    @PostMapping("/signup")
    public ResponseEntity<?> adminSignup(@Valid @RequestBody AdminSignupReqDto adminSignupReqDto, BindingResult bindingResult) {
        System.out.println("컨트롤러 진입");
        adminAuthService.adminSignup(adminSignupReqDto);
        System.out.println("컨트롤러 진입 끝");
        return ResponseEntity.created(null).body(true);
    }
    @ValidAspect
    @PostMapping("/oauth2/signup")
    public ResponseEntity<?> oAuth2Signup(@Valid @RequestBody OAuth2SignupReqDto oAuth2SignupReqDto, BindingResult bindingResult) {
        oAuth2Service.oAuth2Signup(oAuth2SignupReqDto);
        return ResponseEntity.created(null).body(true);
    }

    @PostMapping("/signin")
    public ResponseEntity<?> adminSignin(@RequestBody AdminSignupReqDto adminSignupReqDto) {
        return ResponseEntity.ok(adminAuthService.adminSignin(adminSignupReqDto));
    }

    @PostMapping("/oauth2/merge")
    public ResponseEntity<?> oAuth2Merge(@RequestBody OAuth2MergeReqDto oAuth2MergeReqDto) {
        System.out.println(oAuth2MergeReqDto);
        oAuth2Service.oAuth2Merge(oAuth2MergeReqDto);
        return ResponseEntity.ok(true);
    }


}