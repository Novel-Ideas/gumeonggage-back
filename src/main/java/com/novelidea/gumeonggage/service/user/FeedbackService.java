package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.dto.admin.FeedbackRespDto;
import com.novelidea.gumeonggage.dto.user.FeedbackReqDto;
import com.novelidea.gumeonggage.entity.user.Feedback;
import com.novelidea.gumeonggage.repository.FeedbackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;

    @Transactional(rollbackFor = Exception.class)
    public void saveFeedback(FeedbackReqDto feedbackReqDto) {
        feedbackMapper.saveFeedback(feedbackReqDto.toEntity());
    }

    public List<FeedbackRespDto> findFeedbacks() {
        List<Feedback> feedbacks = feedbackMapper.findFeedback();

        return feedbacks.stream().map(Feedback::toFeedbackRespDto).collect(Collectors.toList());
    }
}
