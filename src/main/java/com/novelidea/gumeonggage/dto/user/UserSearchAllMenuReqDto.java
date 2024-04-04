package com.novelidea.gumeonggage.dto.user;

import lombok.Data;

@Data
public class UserSearchAllMenuReqDto {
    private String menuName;
    private int menuPrice;
    private String categoryName;
    private int menuCal;
    private String menuImgUrl;

}
