package com.novelidea.gumeonggage.dto.admin;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class EditPasswordReqDto {
    @NotBlank
    private String oldPassword;
    private String newPassword;
    @NotBlank
    private String newPasswordCheck;
}
