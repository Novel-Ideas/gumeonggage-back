package com.novelidea.gumeonggage.dto.admin;

import com.novelidea.gumeonggage.entity.Sales;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class AdminSearchSalesReqDto {
    private int menuId;
    private int orderCount;
    private int totalSales;
    private LocalDate orderYear;
    private LocalDate orderMonth;

    public Sales toEntity(int menuId) {
        return Sales.builder()
                .orderCount(orderCount)
                .totalSales(totalSales)
                .build();
    }
}