package com.novelidea.gumeonggage.entity;

import com.novelidea.gumeonggage.dto.admin.AdminSalesRespDto;
import com.novelidea.gumeonggage.dto.admin.AdminSearchMenuRespDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sales {
    private int month;
    private int orderCount;
    private int totalSales;

    public AdminSalesRespDto toAdminSalesRespDto() {
        return AdminSalesRespDto.builder()
                .month(month)
                .orderCount(orderCount)
                .totalSales(totalSales)
                .build();
    }
}
