package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.user.Feedback;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FeedbackMapper {
    public int saveFeedback(Feedback feedback);
    public List<Feedback> findFeedback();
}
