package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.jwt.user.SignupReqDto;
import com.novelidea.gumeonggage.service.user.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")//공통 상위 주소
public class UserAuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup") // 전화번호 가입
    public ResponseEntity<?> signup(@Valid @RequestBody SignupReqDto signupReqDto, BindingResult bindingResult) {

        authService.signup(signupReqDto);

        return ResponseEntity.created(null).body(true);
    }
}
