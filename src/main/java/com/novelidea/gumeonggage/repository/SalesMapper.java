package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.MenuSales;
import com.novelidea.gumeonggage.entity.Sales;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SalesMapper {
    public List<Sales> getSales();
    public List<MenuSales> findSales();
}