package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.dto.user.UserOrderMenusReqDto;
import com.novelidea.gumeonggage.service.user.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserOrderController {

    @Autowired
    private UserOrderService userOrderService;

    @PostMapping("/order")
    public ResponseEntity<?> orderMenus(@RequestBody List<UserOrderMenusReqDto> userOrderMenusReqDtos) {
        userOrderService.orderMenus(userOrderMenusReqDtos);
        return ResponseEntity.ok(true);
    }


}
