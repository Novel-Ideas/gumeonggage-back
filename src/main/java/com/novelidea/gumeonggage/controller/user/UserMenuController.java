package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.service.user.UserMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserMenuController {

    @Autowired
    private UserMenuService userMenuService;
  
    @GetMapping("/menus")
    public ResponseEntity<?> getAllMenu(@RequestParam int categoryId) {
        return ResponseEntity.ok().body(userMenuService.getAllMenu(categoryId));
    }

    @GetMapping("/menus/category")
    public ResponseEntity<?> getCategory() {
        return ResponseEntity.ok().body(userMenuService.getCategory());
    }

}
