package com.novelidea.gumeonggage.controller.admin;

import com.novelidea.gumeonggage.service.admin.AdminFeedbackService;
import com.novelidea.gumeonggage.service.user.UserFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminFeedbackController {

    @Autowired
    private AdminFeedbackService adminFeedbackService;

    @GetMapping("/admin/feedback/answer")
    public ResponseEntity<?> adminOrderFeedback() {
        return ResponseEntity.ok().body(adminFeedbackService.findFeedbacks());
    }

    @GetMapping("/admin/feedback/answercount")
    public ResponseEntity<?> adminFeedbackCount() {
        return ResponseEntity.ok().body(adminFeedbackService.feedbackCount());
    }
}
