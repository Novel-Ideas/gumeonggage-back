package com.novelidea.gumeonggage.entity;

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

    public AdminFeedbackRespDto toFeedbackRespDto() {
        return AdminFeedbackRespDto.builder()
                .feedbackId(feedbackId)
                .answer1(answer1)
                .answer2(answer2)
                .answer3(answer3)
                .createDate(createDate)
                .build();
    }
}
