package com.novelidea.gumeonggage.service.user;

import com.novelidea.gumeonggage.dto.admin.AdminFeedbackRespDto;
import com.novelidea.gumeonggage.dto.user.UserFeedbackReqDto;
import com.novelidea.gumeonggage.entity.Feedback;
import com.novelidea.gumeonggage.repository.FeedbackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserFeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;

    @Transactional(rollbackFor = Exception.class)
    public void saveFeedback(UserFeedbackReqDto userFeedbackReqDto) {
        feedbackMapper.saveFeedback(userFeedbackReqDto.toEntity());
    }

}
