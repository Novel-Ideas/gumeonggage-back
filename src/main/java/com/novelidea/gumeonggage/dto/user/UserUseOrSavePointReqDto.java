package com.novelidea.gumeonggage.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserUseOrSavePointReqDto {
    private String phoneNumber;
    private int point;
}
