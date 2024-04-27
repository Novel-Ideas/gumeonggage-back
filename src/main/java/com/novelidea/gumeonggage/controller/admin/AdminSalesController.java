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

    @GetMapping("/sales")
    public ResponseEntity<?> getSales() {
        return ResponseEntity.ok().body(adminSalesService.getSales());
    }

    @GetMapping("/menusales")
    public ResponseEntity<?> getSalesByMenu() {
        return ResponseEntity.ok(adminSalesService.getSalesByMenu());
    }

}
