package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.Sales;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SalesMapper {
//    public int updateSales();
    public Sales getSales(int month);
}
