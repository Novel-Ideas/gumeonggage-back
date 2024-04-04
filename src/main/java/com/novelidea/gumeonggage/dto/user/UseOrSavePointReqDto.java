package com.novelidea.gumeonggage.dto.user;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UseOrSavePointReqDto {
    private String phoneNumber;
    private int point;
    private int orderListId;
}
