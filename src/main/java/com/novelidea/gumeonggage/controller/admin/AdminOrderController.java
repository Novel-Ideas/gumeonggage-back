package com.novelidea.gumeonggage.controller.admin;

import com.novelidea.gumeonggage.service.user.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/order")
public class AdminOrderController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/feedback/answer")
    public ResponseEntity<?> adminOrderFeedback() {
        return ResponseEntity.ok().body(feedbackService.findFeedbacks());
    }
}
