package com.novelidea.gumeonggage.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPointRespDto {
    private String phoneNumber;
    private int point;
}
