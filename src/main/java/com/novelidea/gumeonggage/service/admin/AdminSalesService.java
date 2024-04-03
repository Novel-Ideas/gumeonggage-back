package com.novelidea.gumeonggage.service.admin;

import com.novelidea.gumeonggage.entity.Sales;
import com.novelidea.gumeonggage.repository.SalesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminSalesService {

    @Autowired
    private SalesMapper salesMapper;

    public Sales getSalesByMonth(String month) {

        return salesMapper.getSales(month);
    }
}
