package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.dto.user.UserFeedbackReqDto;
import com.novelidea.gumeonggage.service.user.UserFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFeedbackController {

    @Autowired
    private UserFeedbackService userFeedbackService;

    @PostMapping("/feedback/add")
    public ResponseEntity<?> saveFeedback(@RequestBody UserFeedbackReqDto userFeedbackReqDto) {
        userFeedbackService.saveFeedback(userFeedbackReqDto);
        System.out.println(userFeedbackReqDto);
        return ResponseEntity.ok().body(true);
    }
}
