package com.novelidea.gumeonggage.controller.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(SaveException.class) // 처리하고자 하는 예외 클래스 지정
    public ResponseEntity<?> saveException(SaveException e) {
        return ResponseEntity.internalServerError().body(e.getMessage()); //500에러 코드
    }

    @ExceptionHandler(ValidException.class)
    public ResponseEntity<?> validException(ValidException e) {
        return ResponseEntity.badRequest().body(e.getErrorMap());
    }

    @ExceptionHandler(UsernameNotFoundException.class)// 자동 으로 UsernameNotFoundException 생성해서 내장 되어있는거 사용
    public ResponseEntity<?> usernameNotFoundException(UsernameNotFoundException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<?> badCredentialsException(BadCredentialsException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
}
