package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.dto.user.FeedbackReqDto;
import com.novelidea.gumeonggage.service.user.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/menu")
public class UserMenuController {
    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/order/feedback")
    public ResponseEntity<?> saveFeedback(@RequestBody FeedbackReqDto feedbackReqDto) {
        feedbackService.saveFeedback(feedbackReqDto);
        System.out.println(feedbackReqDto);
        return ResponseEntity.ok().body(true);
    }
}
