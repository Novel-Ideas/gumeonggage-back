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

    public List<Menu> getAllMenu() {
        return menuMapper.getMenus();
    }

    public List<Menu> getBurgerMenu() {
        return menuMapper.getBurger();
    }

    public List<Menu> getDrinkMenu() {
        return menuMapper.getDrink();
    }

    public List<Category> getCategory() {
        return menuMapper.getCategory();
    }




}
