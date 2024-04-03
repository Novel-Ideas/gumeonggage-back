package com.novelidea.gumeonggage.controller.admin;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/auth")
public class AdminAuthController {

    @PostMapping("/signup")
    public ResponseEntity<?> adminAuthSignup() {

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
