package com.cwc.service.impl;

import com.cwc.dao.InterviewDao;
import com.cwc.model.Interview;
import com.cwc.service.InterviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {
    @Resource
    private InterviewDao interviewDao;

    public boolean addInterview(Interview interview) {
        if (interview==null){
            return false;
        }
        return interviewDao.addInterview(interview);
    }

    public boolean delInterview(Interview interview) {
        if (interview==null){
            return false;
        }
        return interviewDao.delInterview(interview);
    }

    public boolean updateInterview(Interview interview) {
        if (interview==null){
            return false;
        }
        return interviewDao.updateInterview(interview);
    }

    public List<Interview> queryInterviewByUid(Interview interview) {
        if (interview==null){
            return null;
        }
        return interviewDao.queryInterviewByUid(interview);
    }

    public List<Interview> queryInterviewByState() {
        Interview interview = new Interview();
        interview.setInt_state(2);
        return interviewDao.queryInterviewByState(interview);
    }

    public Interview queryInterviewById(Interview interview) {
        if (interview==null){
            return null;
        }
        return interviewDao.queryInterviewById(interview);
    }

    public Interview queryInterview() {
        return interviewDao.queryInterview();
    }
}
