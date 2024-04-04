package com.novelidea.gumeonggage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderList {
    private int orderListId;
    private boolean orderOk;
    private LocalDateTime orderTime;
    private LocalDateTime orderOkTime;

}
