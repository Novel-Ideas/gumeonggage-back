package com.novelidea.gumeonggage.controller.admin;

import com.novelidea.gumeonggage.dto.admin.AdminSignupReqDto;
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
    AdminAuthService adminAuthService
    @PostMapping("/signup")
    public ResponseEntity<?> adminAuthSignup(@Valid @RequestBody AdminSignupReqDto adminSignupReqDto, BindingResult bindingResult) {
        adminAuthService.adminAuthSignup(adminSignupReqDto);
        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/signin")
    public ResponseEntity<?> adminAuthSignin() {
        System.out.println("signin");
        return ResponseEntity.ok().body(null);
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
