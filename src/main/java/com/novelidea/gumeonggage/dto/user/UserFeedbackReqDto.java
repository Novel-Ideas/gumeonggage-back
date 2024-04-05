package com.novelidea.gumeonggage.dto.user;

import com.novelidea.gumeonggage.entity.Feedback;
import lombok.Data;

@Data
public class UserFeedbackReqDto {
    private int orderListId;
    private int answer1;
    private int answer2;
    private int answer3;


    public Feedback toEntity() {
        return Feedback.builder()
                .orderListId(orderListId)
                .answer1(answer1)
                .answer2(answer2)
                .answer3(answer3)
                .build();
    }
}
