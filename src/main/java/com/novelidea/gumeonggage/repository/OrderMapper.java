package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.Order;
import com.novelidea.gumeonggage.entity.OrderList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    public int addOrderList(OrderList orderList);

    public int addOrders(List<Order> orders);

    public int completeMenuByOrderListId(int orderListId);
}
