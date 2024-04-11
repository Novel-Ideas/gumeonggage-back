package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.Sales;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SalesMapper {
//    public int updateSales();
    public List<Sales> getSales();
}
