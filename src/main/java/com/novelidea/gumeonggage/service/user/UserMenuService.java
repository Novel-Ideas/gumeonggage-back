package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.dto.user.UserOrderMenusReqDto;
import com.novelidea.gumeonggage.entity.Category;
import com.novelidea.gumeonggage.entity.Menu;
import com.novelidea.gumeonggage.entity.Order;
import com.novelidea.gumeonggage.entity.OrderList;
import com.novelidea.gumeonggage.repository.MenuMapper;
import com.novelidea.gumeonggage.repository.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    OrderMapper orderMapper;

    public List<?> getAllMenu(int categoryId) {
        if(categoryId == 1) {
            return menuMapper.getMenus();
        } else if (categoryId == 2) {
            List<Order> orders = orderMapper.getRanking();

            return orders;
        } else if (categoryId == 3) {
            return menuMapper.getBurger();
        }

        return menuMapper.getDrink();
    }

    public List<Category> getCategory() {
        return menuMapper.getCategory();
    }




}
