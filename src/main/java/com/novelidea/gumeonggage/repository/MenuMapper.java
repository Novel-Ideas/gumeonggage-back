package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.dto.admin.AdminRegisterMenuReqDto;
import com.novelidea.gumeonggage.dto.user.UserOrderMenusReqDto;
import com.novelidea.gumeonggage.entity.Menu;
import com.novelidea.gumeonggage.entity.Order;
import com.novelidea.gumeonggage.entity.OrderList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    public int saveMenu(AdminRegisterMenuReqDto adminRegisterMenuReqDto);

    public List<Menu> findMenu();

    public int addOrderList(OrderList orderList);

    public int addOrders(List<Order> orders);

    public int deleteMenuByMenuId(List<Integer> menuId);

    public int updateMenuByMenuId(Menu menu);

}
