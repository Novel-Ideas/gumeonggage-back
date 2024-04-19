package com.novelidea.gumeonggage.entity.OAuth2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OAuth2 {
    private int oAuth2Id;
    private String oAuth2Name;
    private int adminId;
    private String providerName;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
