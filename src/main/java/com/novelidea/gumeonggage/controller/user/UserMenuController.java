package com.novelidea.gumeonggage.controller.user;

import com.novelidea.gumeonggage.dto.user.FeedbackReqDto;
import com.novelidea.gumeonggage.dto.user.UserSearchAllMenuReqDto;
import com.novelidea.gumeonggage.service.user.FeedbackService;
import com.novelidea.gumeonggage.service.user.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/menu")
public class UserMenuController {
    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private PointService pointService;

    @PostMapping("/order/feedback/add")
    public ResponseEntity<?> saveFeedback(@RequestBody FeedbackReqDto feedbackReqDto) {
        feedbackService.saveFeedback(feedbackReqDto);
        System.out.println(feedbackReqDto);
        return ResponseEntity.ok().body(true);
    }
  
    @GetMapping("/all")
    public ResponseEntity<?> searchAllMenu(UserSearchAllMenuReqDto userSearchAllMenuReqDto) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/order")
    public ResponseEntity<?> orderMenus() {
        return ResponseEntity.ok(null);

    @GetMapping("/order/point")
    public ResponseEntity<?> getPoint(@RequestParam String number) {

        return ResponseEntity.ok().body(pointService.getPointByNumber(number));

    }
}
