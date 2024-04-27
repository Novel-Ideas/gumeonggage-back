package com.novelidea.gumeonggage.dto.admin;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdminSalesRespDto {
    private int year;
    private int month;
    private int orderCount;
    private int totalSales;
}
