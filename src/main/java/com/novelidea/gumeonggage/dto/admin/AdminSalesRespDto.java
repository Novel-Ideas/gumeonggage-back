package com.novelidea.gumeonggage.dto.admin;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdminSalesRespDto {
    private int month;
    private int orderCount;
    private int totalSales;
}
