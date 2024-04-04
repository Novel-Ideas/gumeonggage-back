package com.novelidea.gumeonggage.entity.user;

import com.novelidea.gumeonggage.dto.admin.FeedbackRespDto;
import com.novelidea.gumeonggage.dto.user.FeedbackReqDto;
import com.novelidea.gumeonggage.repository.FeedbackMapper;
import com.novelidea.gumeonggage.service.user.FeedbackService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Feedback {
    private int feedbackId;
    private int orderListId;
    private int answer1;
    private int answer2;
    private int answer3;
    private LocalDateTime orderTime;
    private LocalDateTime orderOkTime;

    public FeedbackRespDto toFeedbackRespDto() {
        return FeedbackRespDto.builder()
                .feedbackId(feedbackId)
                .orderListId(orderListId)
                .answer1(answer1)
                .answer2(answer2)
                .answer3(answer3)
                .orderTime(orderTime)
                .orderOkTime(orderOkTime)
                .build();
    }
}
