package com.novelidea.gumeonggage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private int userId;
    private String phonenumber;
    private LocalDate createDate;
    private LocalDate updateDate;
}
