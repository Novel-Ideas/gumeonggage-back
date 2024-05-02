package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.OAuth2.OAuth2;
import com.novelidea.gumeonggage.entity.Sales;
import com.novelidea.gumeonggage.entity.User;
import com.novelidea.gumeonggage.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {
    public int saveAdmin(Admin admin);
    public Admin findAdminByUsername(String username);
    public int saveRole(@Param("adminId") int adminId, @Param("roleId") int roleId);
    public int modifyPassword(Admin admin);
    public int saveOAuth2(OAuth2 oAuth2);
    public Admin findAdminByOAuth2name(String oAuth2name);
    public List<User> getUserAuth();
    public int updateLogo(Admin admin);
    public int storeSettingChange(Admin admin);
    public int modifyTradeName(Admin admin);
}