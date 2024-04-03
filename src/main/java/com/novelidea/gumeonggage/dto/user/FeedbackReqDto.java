package com.novelidea.gumeonggage.dto.user;

import lombok.Data;

@Data
public class FeedbackReqDto {
    private int orderListId;
    private int answer1;
    private int answer2;
    private int answer3;
}
