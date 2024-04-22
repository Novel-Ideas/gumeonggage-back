package com.novelidea.gumeonggage.dto.admin;

import com.novelidea.gumeonggage.entity.Admin;
import lombok.Data;

@Data
public class AdminLogoReqDto {
    private String imgUrl;

    public Admin toEntity(){
        return Admin.builder()
                .imgUrl(imgUrl)
                .build();
    }
}
