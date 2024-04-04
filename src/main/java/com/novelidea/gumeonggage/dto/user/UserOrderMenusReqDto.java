package com.novelidea.gumeonggage.dto.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserOrderMenusReqDto {
    private String menuName;
    private int menuPrice;
    private String categoryName;
    private int menuCount;
    private int menuCal;
    private String menuImgUrl;
    private LocalDateTime orderTime;

}
