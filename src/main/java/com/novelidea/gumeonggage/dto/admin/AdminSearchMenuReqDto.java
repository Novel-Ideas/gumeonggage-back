package com.novelidea.gumeonggage.dto.admin;

import lombok.Data;

@Data
public class AdminSearchMenuReqDto {
    private int menuId;
    private String menuName;
    private int categoryId;
    private String categoryName;
    private int menuPrice;
    private int menuCal;
    private String menuImgUrl;

}