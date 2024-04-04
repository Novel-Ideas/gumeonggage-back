package com.novelidea.gumeonggage.dto.user;

import com.novelidea.gumeonggage.entity.Menu;
import com.novelidea.gumeonggage.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserOrderMenusReqDto {
    private int menuId;
    private int menuCount;

    public Order toEntity(int orderListId) {
        return Order.builder()
                .orderListId(orderListId)
                .menuId(menuId)
                .menuCount(menuCount)
                .build();
    }
}
