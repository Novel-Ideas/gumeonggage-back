package com.novelidea.gumeonggage.controller.admin;


import com.novelidea.gumeonggage.dto.admin.*;
import com.novelidea.gumeonggage.service.admin.AdminMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminMenuController {
    @Autowired
    private AdminMenuService adminMenuService;

    @PostMapping("/menu")
    public ResponseEntity<?> registerMenu(@RequestBody AdminRegisterMenuReqDto adminRegisterMenuReqDto) {
        return ResponseEntity.ok().body(adminMenuService.saveMenu((adminRegisterMenuReqDto)));
    }

    @GetMapping("/menu")
    public ResponseEntity<?> findMenu() {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/menu")
    public ResponseEntity<?> updateMenu(int menuId, AdminUpdateMenuReqDto adminUpdateMenuReqDto) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/menu")
    public ResponseEntity<?> deleteMenu() {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/menu/complete")
    public ResponseEntity<?> completeMenu() {
        return ResponseEntity.ok(null);
    }
}

