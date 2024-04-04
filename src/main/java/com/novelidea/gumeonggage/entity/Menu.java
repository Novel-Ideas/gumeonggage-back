package com.novelidea.gumeonggage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private int menuId;
    private String menuName;
    private int categoryId;
    private String categoryName;
    private String categoryNameKor;
    private int menuCount;
    private int menuPrice;
    private int menuCal;
    private String menuImgUrl;

}