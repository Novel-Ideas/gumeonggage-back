package com.novelidea.gumeonggage.dto.admin;

import com.novelidea.gumeonggage.entity.Admin;
import lombok.Data;

@Data
public class AdminStoreSettingReqDto {
    private int feedbackUse;
    private int playUse;

    public Admin toEntity() {
        return Admin.builder()
                .feedbackUse(feedbackUse)
                .playUse(playUse)
                .build();
    }
}
