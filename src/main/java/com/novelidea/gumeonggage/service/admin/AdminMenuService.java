package com.novelidea.gumeonggage.service.admin;

import com.novelidea.gumeonggage.dto.admin.AdminRegisterMenuReqDto;
import com.novelidea.gumeonggage.dto.admin.AdminSearchMenuReqDto;
import com.novelidea.gumeonggage.entity.Menu;
import com.novelidea.gumeonggage.repository.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Transactional(rollbackFor = Exception.class)
    public int saveMenu(AdminRegisterMenuReqDto adminRegisterMenuReqDto) {
        return menuMapper.saveMenu((adminRegisterMenuReqDto.toEntity()));
    }

    public List<AdminSearchMenuReqDto> findMenus() {
        List<Menu> menus =menuMapper.findMenu();

        return menus.stream().map(Menu::)
    }


}