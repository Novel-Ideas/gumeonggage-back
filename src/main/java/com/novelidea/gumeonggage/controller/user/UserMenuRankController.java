package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.service.user.UserMenuRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserMenuRankController {

    @Autowired
    UserMenuRankingService userMenuRankingService;

    @GetMapping("/menu/ranking")
    public ResponseEntity<?> getMenuRanking() {
        return ResponseEntity.ok().body(userMenuRankingService.getMenuRanking());
    }


}
