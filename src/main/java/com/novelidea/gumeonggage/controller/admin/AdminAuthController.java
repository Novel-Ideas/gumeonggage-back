package com.novelidea.gumeonggage.controller.admin;

import com.novelidea.gumeonggage.dto.admin.AdminSignupReqDto;
import com.novelidea.gumeonggage.dto.admin.OAuth2SignupReqDto;
import com.novelidea.gumeonggage.service.admin.AdminAuthService;
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
    @PostMapping("/signup")
    public ResponseEntity<?> adminSignup(@Valid @RequestBody AdminSignupReqDto adminSignupReqDto, BindingResult bindingResult) {
        adminAuthService.adminSignup(adminSignupReqDto);
        return ResponseEntity.created(null).body(true);
    }
//    @PostMapping("/oauth2/signup")
//    public ResponseEntity<?> oAuth2Signup(@Valid @RequestBody OAuth2SignupReqDto oAuth2SignupReqDto, BindingResult bindingResult) {
//        adminAuthService.oAuth2Signup(oAuth2SignupReqDto);
//        return ResponseEntity.created(null).body(true);
//    }


    @GetMapping("/signin")
    public ResponseEntity<?> adminSignin(@RequestBody AdminSignupReqDto adminSignupReqDto) {

        return ResponseEntity.ok(adminAuthService.adminSignin).body(null);
    }

    @PutMapping("/edit/password")
    public ResponseEntity<?> adminAuthEditPassword() {

        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/user")
    public ResponseEntity<?> getUserAuth() {

        return ResponseEntity.ok().body(null);
    }
}
