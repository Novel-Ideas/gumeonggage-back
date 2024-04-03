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

public class Admin {
    private int adminId;
    private int roleId;
    private String adminName;
    private String adminPassword;
    private String email;
    private LocalDate createDate;
    private LocalDate updateDate;
}
