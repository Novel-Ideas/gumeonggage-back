package com.novelidea.gumeonggage.controller.admin;

import com.novelidea.gumeonggage.service.admin.AdminMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminOrderController {

    @Autowired
    private AdminMenuService adminMenuService;

    @PutMapping("/admin/menu/complete")
    public ResponseEntity<?> completeMenu(@RequestParam int orderListId) {
        return ResponseEntity.ok(adminMenuService.completeMenu(orderListId));
    }
}
