package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.dto.user.UseOrSavePointReqDto;
import com.novelidea.gumeonggage.service.user.UserPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserPointController {

    @Autowired
    private UserPointService userPointService;

    @GetMapping("/point")
    public ResponseEntity<?> getPoint(@RequestParam String phonenumber) {

        return ResponseEntity.ok().body(userPointService.getPointByPhoneNumber(phonenumber));
    }

    @PostMapping("/point")
    public ResponseEntity<?> useOrSavePoint(@RequestBody UseOrSavePointReqDto useOrSavePointReqDto) {
        System.out.println(useOrSavePointReqDto);
        return ResponseEntity.ok().body(userPointService.useOrSavePointByNumber(useOrSavePointReqDto));
    }
}
