package com.novelidea.gumeonggage.service.admin;

import com.novelidea.gumeonggage.dto.admin.AdminRegisterMenuReqDto;
import com.novelidea.gumeonggage.dto.admin.AdminSearchMenuRespDto;
import com.novelidea.gumeonggage.dto.admin.AdminUpdateMenuReqDto;
import com.novelidea.gumeonggage.entity.Menu;
import com.novelidea.gumeonggage.repository.MenuMapper;
import com.novelidea.gumeonggage.repository.OrderMapper;
import com.novelidea.gumeonggage.repository.SalesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private SalesMapper salesMapper;

    @Transactional(rollbackFor = Exception.class)
    public int saveMenu(AdminRegisterMenuReqDto adminRegisterMenuReqDto) {
        return menuMapper.saveMenu(adminRegisterMenuReqDto.toEntity());
    }

    public List<AdminSearchMenuRespDto> getMenus() {
        List<Menu> menus = menuMapper.getMenus();

        return menus.stream().map(Menu::toSearchMenuRespDto).collect(Collectors.toList());
    }

    @Transactional(rollbackFor = Exception.class)
    public int updateMenu(AdminUpdateMenuReqDto adminUpdateMenuReqDto) {
        return menuMapper.updateMenuByMenuId(adminUpdateMenuReqDto.toEntity());
    }

    @Transactional(rollbackFor = Exception.class)
    public int deleteMenu(int menuId) {
        return menuMapper.deleteMenuByMenuId(menuId);
    }

}