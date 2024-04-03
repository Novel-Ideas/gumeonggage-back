package com.novelidea.gumeonggage.controller.admin;

import com.novelidea.gumeonggage.service.admin.AdminSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminSalesController {

    @Autowired
    private AdminSalesService adminSalesService;

    @PutMapping("/sales")
    public ResponseEntity<?> salesUpdate() {

        return ResponseEntity.ok(null);
    }

    @GetMapping("/sales/{month}")
    public ResponseEntity<?> getSales(@PathVariable int month) {

        return ResponseEntity.ok().body(adminSalesService.getSalesByMonth(month));
    }
}
