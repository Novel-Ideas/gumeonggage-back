package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper {
    public int saveMenu(Menu menu);

    public List<Menu> findMenu();

    public int deleteMenuByMenuId(List<Integer> menuId);

    public int updateMenuByMenuId(Menu menu);

}
