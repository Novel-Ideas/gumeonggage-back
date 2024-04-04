package com.novelidea.gumeonggage.entity;


import com.novelidea.gumeonggage.dto.admin.AdminSearchMenuRespDto;
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

    public AdminSearchMenuRespDto toSearchMenuRespDto() {
        return AdminSearchMenuRespDto.builder()
                .menuId(menuId)
                .menuName(menuName)
                .menuPrice(menuPrice)
                .menuCal(menuCal)
                .menuImgUrl(menuImgUrl)
                .categoryName(categoryName)
                .categoryNameKor(categoryNameKor)
                .build();
    }
}