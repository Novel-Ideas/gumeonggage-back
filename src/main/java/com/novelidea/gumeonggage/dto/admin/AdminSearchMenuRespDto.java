package com.novelidea.gumeonggage.dto.admin;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdminSearchMenuRespDto {
    private int menuId;
    private String menuName;
    private int menuPrice;
    private int menuCal;
    private String menuImgUrl;
    private String categoryName;
    private String categoryKorName;
}
