package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper {
    public int saveMenu(Menu menu);

    public List<Menu> getMenu();

    public int deleteMenuByMenuId(int menuId);

    public int updateMenuByMenuId(Menu menu);

}
