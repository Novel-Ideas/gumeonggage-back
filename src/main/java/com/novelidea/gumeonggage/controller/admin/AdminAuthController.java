package com.novelidea.gumeonggage.controller.admin;

import com.novelidea.gumeonggage.dto.admin.AdminSignupReqDto;
import com.novelidea.gumeonggage.service.admin.AdminAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AdminAuthController {

    @Autowired
    AdminAuthService adminAuthService;
    @PostMapping("/signup")
    public ResponseEntity<?> adminSignup(@Valid @RequestBody AdminSignupReqDto adminSignupReqDto, BindingResult bindingResult) {
        System.out.println("컨트롤러 진입");
        adminAuthService.adminSignup(adminSignupReqDto);
        System.out.println("컨트롤러 진입 끝");
        return ResponseEntity.created(null).body(true);
    }
//    @PostMapping("/oauth2/signup")
//    public ResponseEntity<?> oAuth2Signup(@Valid @RequestBody OAuth2SignupReqDto oAuth2SignupReqDto, BindingResult bindingResult) {
//        adminAuthService.oAuth2Signup(oAuth2SignupReqDto);
//        return ResponseEntity.created(null).body(true);
//    }

    @PostMapping("/signin")
    public ResponseEntity<?> adminSignin(@RequestBody AdminSignupReqDto adminSignupReqDto) {

        return ResponseEntity.ok(adminAuthService.adminSignin(adminSignupReqDto));
    }


    @GetMapping("/admin/auth/users")
    public ResponseEntity<?> getUserAuth() {

        return ResponseEntity.ok().body(null);
    }
}
