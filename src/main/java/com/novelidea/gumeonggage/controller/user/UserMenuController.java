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
    public ResponseEntity<?> getAllMenu() {
        return ResponseEntity.ok().body(userMenuService.getAllMenu());
    }

    @GetMapping("/menus/burger")
    public ResponseEntity<?> getBurgerMenu() {
        return ResponseEntity.ok().body(userMenuService.getBurgerMenu());
    }

    @GetMapping("/menus/drink")
    public ResponseEntity<?> getDrinkMenu() {
        return ResponseEntity.ok().body(userMenuService.getDrinkMenu());
    }

}
