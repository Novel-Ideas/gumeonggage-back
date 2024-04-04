package com.novelidea.gumeonggage.controller.admin;


import com.novelidea.gumeonggage.dto.admin.*;
import com.novelidea.gumeonggage.service.admin.AdminMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<?> getMenu() {
        return ResponseEntity.ok(adminMenuService.getMenus());
    }

    @PutMapping("/menu")
    public ResponseEntity<?> updateMenu(@RequestBody AdminUpdateMenuReqDto adminUpdateMenuReqDto) {
        return ResponseEntity.ok(adminMenuService.updateMenu(adminUpdateMenuReqDto));
    }

    @DeleteMapping("/menu")
    public ResponseEntity<?> deleteMenu(@RequestParam int menuId) {
        return ResponseEntity.ok(adminMenuService.deleteMenu(menuId));
    }

    @PutMapping("/menu/complete")
    public ResponseEntity<?> completeMenu() {
        return ResponseEntity.ok(null);
    }
}

