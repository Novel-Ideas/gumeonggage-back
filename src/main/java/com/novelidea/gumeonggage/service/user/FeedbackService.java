package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.dto.user.FeedbackReqDto;
import com.novelidea.gumeonggage.repository.FeedbackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;
    @Transactional(rollbackFor = Exception.class)
    public void saveFeedback(FeedbackReqDto feedbackReqDto) {
        feedbackMapper.saveFeedback(feedbackReqDto.toEntity());
    }
}
