package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.Category;
import com.novelidea.gumeonggage.entity.Menu;
import com.novelidea.gumeonggage.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    public int saveMenu(Menu menu);

    public List<Menu> getMenus();

    public int deleteMenuByMenuId(int menuId);

    public int updateMenuByMenuId(Menu menu);

    public List<Menu> getBurger();

    public List<Menu> getDrink();

    public List<Category> getCategory();

}
