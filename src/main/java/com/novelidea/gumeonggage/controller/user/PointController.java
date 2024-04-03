package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.dto.user.UseEarnPointReqDto;
import com.novelidea.gumeonggage.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class PointController {
    @Autowired
    AuthService authService;
    @PostMapping("/usepoint")
    public ResponseEntity<?> usepoint(@RequestBody UseEarnPointReqDto useEarnPointReqDto ) {
        authService.usepoint(useEarnPointReqDto);
        return ResponseEntity.created(null).body(true); // *리턴문
    }

    @PostMapping("/savepoint")
    public ResponseEntity<?> savepoint(@RequestBody UseEarnPointReqDto useEarnPointReqDto) {
        authService.savepoint(useEarnPointReqDto);
        return(null);
    }
}
