package com.novelidea.gumeonggage.controller.admin;

import com.novelidea.gumeonggage.dto.admin.AdminLogoReqDto;
import com.novelidea.gumeonggage.dto.admin.EditPasswordReqDto;
import com.novelidea.gumeonggage.security.PrincipalUser;
import com.novelidea.gumeonggage.service.admin.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/admin/account")
public class AdminAccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/principal")
    public ResponseEntity<?> getPrincipal() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(authentication);
        PrincipalUser principalUser = (PrincipalUser) authentication.getPrincipal();
        return ResponseEntity.ok(principalUser);
    }

    @PutMapping("/password")
    public ResponseEntity<?> editPassword(@Valid @RequestBody EditPasswordReqDto editPasswordReqDto, BindingResult bindingResult) {
        accountService.editPassword(editPasswordReqDto);
        return ResponseEntity.ok(true);
    }

    @PutMapping("/logo")
    public ResponseEntity<?> updateImg(@RequestBody AdminLogoReqDto adminLogoReqDto) {
        accountService.updateLogo(adminLogoReqDto);
        return ResponseEntity.ok(true);
    }

    @PutMapping("tradename")
    public ResponseEntity<?> editTradeName(@Valid @RequestBody)
}
