package com.novelidea.gumeonggage.controller.admin;

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
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/principal")
    public ResponseEntity<?> getPrincipal() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PrincipalUser principalUser = (PrincipalUser) authentication.getPrincipal();
        return ResponseEntity.ok(principalUser);
    }

    @PutMapping("/password")
    public ResponseEntity<?> editPassword(@Valid @RequestBody EditPasswordReqDto editPasswordReqDto, BindingResult bindingResult) {
        accountService.editPassword(editPasswordReqDto);
        return ResponseEntity.ok(true);
    }
}
