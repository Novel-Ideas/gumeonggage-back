package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.dto.user.FeedbackReqDto;
import com.novelidea.gumeonggage.service.user.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/menu")
public class UserMenuController {
    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/order/feedback/add")
    public ResponseEntity<?> saveFeedback(@RequestBody FeedbackReqDto feedbackReqDto) {
        feedbackService.saveFeedback(feedbackReqDto);
        System.out.println(feedbackReqDto);
        return ResponseEntity.ok().body(true);
    }

    @GetMapping("/order/point")
    public ResponseEntity<?> getPoint(@RequestParam String number) {
        System.out.println(number);
        return ResponseEntity.ok().body(null);
    }
}
