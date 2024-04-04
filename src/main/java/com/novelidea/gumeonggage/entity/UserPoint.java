package com.novelidea.gumeonggage.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserPoint {
    private String phoneNumber;
    private int point;
}
