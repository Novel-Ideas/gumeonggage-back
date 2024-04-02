package com.novelidea.gumeonggage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private int UserId;
    private String phone;
    private LocalDate createDate;
    private LocalDate updateDate;

}
