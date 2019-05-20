package com.cwc.dao;

import com.cwc.model.Interview;

import java.util.List;

public interface InterviewDao {
    boolean addInterview(Interview interview);
    boolean delInterview(Interview interview);
    boolean updateInterview(Interview interview);
    List<Interview> queryInterviewByUid(Interview interview);
    List<Interview> queryInterviewByState(Interview interview);
    Interview queryInterviewById(Interview interview);
    Interview queryInterview();
}
