package com.novelidea.gumeonggage.dto.admin;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class AdminFeedbackRespDto {
    private int feedbackId;
    private int orderListId;
    private int answer1;
    private int answer2;
    private int answer3;
    private LocalDateTime orderTime;
    private LocalDateTime orderOkTime;
}
