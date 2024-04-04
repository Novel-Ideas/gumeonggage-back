package com.novelidea.gumeonggage.controller.admin;


import com.novelidea.gumeonggage.dto.admin.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminMenuController {

    @PostMapping("/menu")
    public ResponseEntity<?> registerMenu(AdminRegisterMenuReqDto adminRegisterMenuReqDto) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/menu")
    public ResponseEntity<?> searchMenu() {
        return ResponseEntity.ok(null);
    }

//    @PutMapping("/menu")
//    public ResponseEntity<?> updateMenu(int menuId, AdminUpdateMenuReqDto adminUpdateMenuReqDto) {
//        return ResponseEntity.ok(null);
//    }

    @DeleteMapping("/menu")
    public ResponseEntity<?> deleteMenu() {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/menu")
    public ResponseEntity<?> completeMenu() {
        return ResponseEntity.ok(null);
    }
}

