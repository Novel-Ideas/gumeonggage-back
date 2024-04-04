package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.dto.user.FeedbackReqDto;
import com.novelidea.gumeonggage.dto.user.UserOrderMenusReqDto;
import com.novelidea.gumeonggage.service.user.FeedbackService;
import com.novelidea.gumeonggage.service.user.UserMenuService;
import com.novelidea.gumeonggage.service.user.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class UserMenuController {
    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private PointService pointService;

    @Autowired
    private UserMenuService userMenuService;

    @PostMapping("/order/feedback/add")
    public ResponseEntity<?> saveFeedback(@RequestBody FeedbackReqDto feedbackReqDto) {
        feedbackService.saveFeedback(feedbackReqDto);
        System.out.println(feedbackReqDto);
        return ResponseEntity.ok().body(true);
    }
  
    @GetMapping("/all")
    public ResponseEntity<?> getAllMenu() {
        return ResponseEntity.ok().body(userMenuService.getAllMenu());
    }

    @PostMapping("/order")
    public ResponseEntity<?> orderMenus(@RequestBody List<UserOrderMenusReqDto> userOrderMenusReqDtos) {
        userMenuService.orderMenus(userOrderMenusReqDtos);
        return ResponseEntity.ok(true);
    }

    @GetMapping("/order/point")
    public ResponseEntity<?> getPoint(@RequestParam String number) {

        return ResponseEntity.ok().body(pointService.getPointByNumber(number));

    }
}
