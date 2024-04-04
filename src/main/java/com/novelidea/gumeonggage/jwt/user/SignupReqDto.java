package com.novelidea.gumeonggage.jwt.user;

import com.novelidea.gumeonggage.entity.User;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
    public class SignupReqDto {
        @Pattern(regexp = "^\\d{3}-\\d{3,4}-\\d{4}$", message = "올바른 전화번호 형식이어야 합니다.")
        private String phoneNumber;

    public User toEntity() {
        return User.builder()
                .phoneNumber(phoneNumber)
                .build();
    }

}
