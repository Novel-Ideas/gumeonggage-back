package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.dto.user.FeedbackReqDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class UserMenuController {

    @PostMapping("/order/feedback")
    public ResponseEntity<?> addFeedback(@RequestBody FeedbackReqDto feedbackReqDto) {
        System.out.println("/order/feedback");
        return ResponseEntity.ok().body(null);
    }
}
