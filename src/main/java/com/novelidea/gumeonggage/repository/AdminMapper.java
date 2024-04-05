package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.User;
import com.novelidea.gumeonggage.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {
    public int saveAdmin(Admin admin); //관리자 회원가입
    public Admin findAdminByUsername(String username); // 관리자 로그인
    public int saveRole(@Param("adminId") int adminId, @Param("roleId") int roleId);
    public int modifyPassword(Admin admin);
    public List<User> getUserAuth();
}
