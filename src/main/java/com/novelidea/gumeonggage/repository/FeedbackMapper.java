package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.user.Feedback;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedbackMapper {
    public int saveFeedback(Feedback feedback);
}
