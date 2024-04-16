package com.novelidea.gumeonggage.service.admin;

import com.novelidea.gumeonggage.dto.admin.AdminFeedbackCountRespDto;
import com.novelidea.gumeonggage.dto.admin.AdminFeedbackRespDto;
import com.novelidea.gumeonggage.entity.Feedback;
import com.novelidea.gumeonggage.repository.FeedbackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminFeedbackService {

    @Autowired
    private FeedbackMapper feedbackMapper;

    public List<AdminFeedbackRespDto> findFeedbacks() {
        List<Feedback> feedbacks = feedbackMapper.findFeedback();

        return feedbacks.stream().map(Feedback::toFeedbackRespDto).collect(Collectors.toList());

    }

    public List<AdminFeedbackCountRespDto> feedbackCount() {
        List<Feedback> feedbackCount = feedbackMapper.feedbackCount();

        return feedbackCount.stream().map(Feedback::toFeedbackCountRespDto).collect(Collectors.toList());
    }
}
