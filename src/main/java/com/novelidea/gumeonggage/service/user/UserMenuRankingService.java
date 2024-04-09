package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.entity.Menu;
import com.novelidea.gumeonggage.entity.Order;
import com.novelidea.gumeonggage.repository.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserMenuRankingService {

    @Autowired
    OrderMapper orderMapper;

    public List<Order> getMenuRanking() {
        List<Order> orders = orderMapper.getRanking();
        System.out.println("???");
        System.out.println(orders);
        return orders;
    }


}
