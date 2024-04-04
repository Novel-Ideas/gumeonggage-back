package com.novelidea.gumeonggage.entity;

import com.novelidea.gumeonggage.dto.admin.AdminSearchMenuReqDto;
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
    private int menuPrice;
    private int menuCal;
    private String menuImgUrl;

    public AdminSearchMenuReqDto toSearchMenuR
}