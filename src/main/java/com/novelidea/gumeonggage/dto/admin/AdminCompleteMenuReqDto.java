package com.novelidea.gumeonggage.dto.admin;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdminCompleteMenuReqDto {
    private int orderListId;
    private int menuCount;
    private LocalDateTime orderOkTime;

}