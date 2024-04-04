package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.dto.user.UserOrderMenusReqDto;
import com.novelidea.gumeonggage.entity.Menu;
import com.novelidea.gumeonggage.entity.Order;
import com.novelidea.gumeonggage.entity.OrderList;
import com.novelidea.gumeonggage.repository.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMenuService {

    @Autowired
    private MenuMapper menuMapper;

    public List<Menu> getAllMenu() {
        return menuMapper.findMenu();
    }

    @Transactional(rollbackFor = Exception.class)
    public void orderMenus(List<UserOrderMenusReqDto> userOrderMenusReqDtos) {
        OrderList orderList = new OrderList();

        menuMapper.addOrderList(orderList);
        menuMapper.addOrders(userOrderMenusReqDtos.stream().map(userOrderMenusReqDto -> userOrderMenusReqDto.toEntity(orderList.getOrderListId())).collect(Collectors.toList()));
    }
}
