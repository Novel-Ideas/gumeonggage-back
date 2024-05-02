package com.novelidea.gumeonggage.dto.admin;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CheckPasswordReqDto {
    @NotBlank
    private String password;
}
