package com.novelidea.gumeonggage.entity;

import com.novelidea.gumeonggage.dto.admin.AdminFeedbackCountRespDto;
import com.novelidea.gumeonggage.dto.admin.AdminFeedbackRespDto;
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
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private int q1a1;
    private int q1a2;
    private int q1a3;
    private int q2a1;
    private int q2a2;
    private int q2a3;
    private int q3a1;
    private int q3a2;
    private int q3a3;

    public AdminFeedbackRespDto toFeedbackRespDto() {
        return AdminFeedbackRespDto.builder()
                .feedbackId(feedbackId)
                .answer1(answer1)
                .answer2(answer2)
                .answer3(answer3)
                .createDate(createDate)
                .build();
    }

    public AdminFeedbackCountRespDto toFeedbackCountRespDto() {
        return AdminFeedbackCountRespDto.builder()
                .q1a1(q1a1)
                .q1a2(q1a2)
                .q1a3(q1a3)
                .q2a1(q2a1)
                .q2a2(q2a2)
                .q2a3(q2a3)
                .q3a1(q3a1)
                .q3a2(q3a2)
                .q3a3(q3a3)
                .build();
    }
}
