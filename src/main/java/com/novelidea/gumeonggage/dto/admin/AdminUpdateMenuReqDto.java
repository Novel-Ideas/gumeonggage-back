package com.novelidea.gumeonggage.dto.admin;

import com.novelidea.gumeonggage.entity.Menu;
import lombok.Data;

@Data
public class AdminUpdateMenuReqDto {
    private int menuId;
    private String menuName;
    private int categoryId;
    private int menuPrice;
    private int menuCal;
    private String menuImgUrl;

    public Menu toEntity() {
        return Menu.builder()
                .menuId(menuId)
                .menuName(menuName)
                .categoryId(categoryId)
                .menuPrice(menuPrice)
                .menuCal(menuCal)
                .menuImgUrl(menuImgUrl)
                .build();
    }
}