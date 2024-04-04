package com.novelidea.gumeonggage.entity.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleRegister {
    private int roleRegisterId;
    private int userId;
    private int roleId;
    private LocalDate createDate;
    private LocalDate updateDate;

    private Role role;
}
