package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.dto.SignupReqDto;
import com.novelidea.gumeonggage.dto.UsePointReqDto;
import com.novelidea.gumeonggage.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
@RequestMapping("/auth")
public class PointController {
    @Autowired
    AuthService authService;
    @PostMapping("/usepoint")
    public ResponseEntity<?> usepoint(@RequestBody UsePointReqDto usePointReqDto) {

        authService.signup(usePointReqDto);

        return ResponseEntity.created(null).body(true);
    }
}
