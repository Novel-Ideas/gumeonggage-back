package com.novelidea.gumeonggage.dto.admin;

import com.novelidea.gumeonggage.entity.Menu;
import lombok.Data;

@Data
public class AdminRegisterMenuReqDto {
    private int menuId;
    private String menuName;
    private int categoryId;
    private String categoryName;
    private int menuPrice;
    private int menuCal;
    private String menuImgUrl;

    public Menu toEntity() {
        return Menu.builder()
                .menuId(menuId)
                .menuName(menuName)
                .categoryId(categoryId)
                .categoryName(categoryName)
                .menuPrice(menuPrice)
                .menuCal(menuCal)
                .menuImgUrl(menuImgUrl)
                .build();
    }
}