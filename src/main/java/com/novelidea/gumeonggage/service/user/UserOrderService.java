package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.dto.user.UserOrderMenusReqDto;
import com.novelidea.gumeonggage.entity.OrderList;
import com.novelidea.gumeonggage.repository.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Transactional(rollbackFor = Exception.class)
    public void orderMenus(List<UserOrderMenusReqDto> userOrderMenusReqDtos) {
        OrderList orderList = new OrderList();

        orderMapper.addOrderList(orderList);
        orderMapper.addOrders(userOrderMenusReqDtos.stream().map(userOrderMenusReqDto -> userOrderMenusReqDto.toEntity(orderList.getOrderListId())).collect(Collectors.toList()));
    }
}
