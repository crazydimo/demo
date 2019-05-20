package com.cwc.service;

import com.cwc.model.Interview;

import java.util.List;

public interface InterviewService {
    boolean addInterview(Interview interview);
    boolean delInterview(Interview interview);
    boolean updateInterview(Interview interview);
    List<Interview> queryInterviewByUid(Interview interview);
    List<Interview> queryInterviewByState();
    Interview queryInterviewById(Interview interview);
    Interview queryInterview();
}
