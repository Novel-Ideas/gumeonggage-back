package com.novelidea.gumeonggage.controller.admin;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminSalesController {

    @PutMapping("/sales")
    public ResponseEntity<?> salesUpdate() {

        return ResponseEntity.ok(null);
    }

    @GetMapping("/sales")
    public ResponseEntity<?> getSales() {

        System.out.println("getsales");
        return ResponseEntity.ok(null);
    }
}
