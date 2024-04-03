package com.novelidea.gumeonggage.controller.admin;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/order")
public class AdminOrderController {

    @GetMapping("/feedback")
    public ResponseEntity<?> adminOrderFeedback() {
        return ResponseEntity.ok().body(null);
    }
}
