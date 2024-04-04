package com.novelidea.gumeonggage.controller.admin;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminAuthController {

    @PostMapping("/admin/auth/signup")
    public ResponseEntity<?> adminAuthSignup() {

        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/admin/auth/signin")
    public ResponseEntity<?> adminAuthSignin() {
        System.out.println("signin");
        return ResponseEntity.ok().body(null);
    }

    @PutMapping("/admin/auth/edit/password")
    public ResponseEntity<?> adminAuthEditPassword() {

        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/admin/auth/users")
    public ResponseEntity<?> getUserAuth() {

        return ResponseEntity.ok().body(null);
    }
}
