package com.novelidea.gumeonggage.entity.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Point {
    private int pointId;
    private int userId;
    private int currentPoint;
    private int orderListId;
}
