package com.novelidea.gumeonggage.service.admin;

import com.novelidea.gumeonggage.repository.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminMenuService {

    @Autowired
    private MenuMapper menuMapper;

}