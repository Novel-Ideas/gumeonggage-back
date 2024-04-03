package com.novelidea.gumeonggage.repository;

import com.novelidea.gumeonggage.entity.user.Feedback;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FeedbackMapper {
    public int saveFeedback(Feedback feedback);
    public List<Feedback> findFeedback(
            @Param("orderListId") int orderListId,
            @Param("answer1") int answer1,
            @Param("answer2") int answer2,
            @Param("answer3") int answer3
    );
}
