package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedbackMapper {
    public int saveFeedback(Feedback feedback);
    public List<Feedback> findFeedback();
}
