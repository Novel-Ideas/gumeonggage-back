package com.novelidea.gumeonggage.controller.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class UserMenuController {

    @PostMapping("/order/feedback")
    public ResponseEntity<?> addFeedback() {
        System.out.println("/order/feedback");
        return ResponseEntity.ok().body(null);
    }
}
