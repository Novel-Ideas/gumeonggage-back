package com.novelidea.gumeonggage.entity;

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
}
