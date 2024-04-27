package com.novelidea.gumeonggage.service.admin;

import com.novelidea.gumeonggage.dto.admin.AdminSalesRespDto;
import com.novelidea.gumeonggage.dto.admin.AdminSearchSalesReqDto;
import com.novelidea.gumeonggage.entity.MenuSales;
import com.novelidea.gumeonggage.entity.Sales;
import com.novelidea.gumeonggage.repository.SalesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminSalesService {

    @Autowired
    private SalesMapper salesMapper;

    public List<AdminSalesRespDto> getSales() {
        List<Sales> sales = salesMapper.getSales();

        return sales.stream().map(Sales::toAdminSalesRespDto).collect(Collectors.toList());
    }

    @Transactional(rollbackFor = Exception.class)
    public List<MenuSales> getSalesByMenu() {
        salesMapper.findSales();

        return salesMapper.findSales();
    }

}
