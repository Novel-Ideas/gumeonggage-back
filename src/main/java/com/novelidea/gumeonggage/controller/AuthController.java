package com.novelidea.gumeonggage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")//공통 상위 주소
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@Valid @RequestBody) {
        return ResponseEntity.created(null).body(true);
    }
}
