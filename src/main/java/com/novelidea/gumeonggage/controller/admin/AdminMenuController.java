package com.novelidea.gumeonggage.controller.admin;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/menu")
public class AdminMenuController {

    @PostMapping
    public ResponseEntity<?> addMenu() {
        return ResponseEntity.ok(null);
    }

    @PutMapping
    public ResponseEntity<?> updateMenu() {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteMenu() {
        return ResponseEntity.ok(null);
    }


    public ResponseEntity<?> completeMenu() {
        return ResponseEntity.ok(null);
    }
}

