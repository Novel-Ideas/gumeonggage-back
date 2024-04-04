package com.novelidea.gumeonggage.controller.admin;


import com.novelidea.gumeonggage.dto.admin.*;
import com.novelidea.gumeonggage.service.admin.AdminMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminMenuController {

    @Autowired
    private AdminMenuService adminMenuService;

    @PostMapping("/admin/menu")
    public ResponseEntity<?> registerMenu(@RequestBody AdminRegisterMenuReqDto adminRegisterMenuReqDto) {
        return ResponseEntity.ok().body(adminMenuService.saveMenu((adminRegisterMenuReqDto)));
    }

    @GetMapping("/admin/menus")
    public ResponseEntity<?> getMenu() {
        return ResponseEntity.ok(adminMenuService.getMenus());
    }

    @PutMapping("/admin/menu")
    public ResponseEntity<?> updateMenu(@RequestBody AdminUpdateMenuReqDto adminUpdateMenuReqDto) {
        return ResponseEntity.ok(adminMenuService.updateMenu(adminUpdateMenuReqDto));
    }

    @DeleteMapping("/admin/menu")
    public ResponseEntity<?> deleteMenu(@RequestParam int menuId) {
        return ResponseEntity.ok(adminMenuService.deleteMenu(menuId));
    }
}

