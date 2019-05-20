package com.cwc.controller;

import com.cwc.model.Interview;
import com.cwc.model.RAR;
import com.cwc.model.User;
import com.cwc.service.InterviewService;
import com.cwc.service.RARService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class InterviewController {
    @Resource
    private InterviewService interviewService;
    @Resource
    private RARService rarService;

    @RequestMapping("showInterview")
    public String showInterview(HttpSession session)throws Exception{
        User user = (User) session.getAttribute("user");
        Interview interview = new Interview();
        interview.setInt_uid(user.getUser_id());
        List<Interview> interviews = interviewService.queryInterviewByUid(interview);
        session.setAttribute("interviews",interviews);
        return "interviewInvitation";
    }
    @RequestMapping("addInterview")
    public String addInterview(Interview interview,HttpSession session)throws Exception{
        interview.setInt_state(1);
        interviewService.addInterview(interview);

        //将rar记录成为已发送面试
        RAR rar = (RAR) session.getAttribute("rarAdmin");
        RAR rar1 = rarService.queryRARById(rar);
        rar1.setRar_state(3);
        rarService.updateRAR(rar1);

        return "adminMain";
    }
    @RequestMapping("toInterview")
    public String toInterview(Interview interview)throws Exception{
        Interview interview1 = interviewService.queryInterviewById(interview);
        interview1.setInt_state(2);
        interviewService.updateInterview(interview1);
        return "deliveryRecord";
    }
    @RequestMapping("toArrangeInterview")
    public String toArrangeInterview()throws Exception{
        return "arrangeInterview";
    }
    @RequestMapping("refuseInterview")
    public String refuseInterview(Interview interview)throws Exception{
        Interview interview1 = interviewService.queryInterviewById(interview);
        interview1.setInt_state(3);
        interviewService.updateInterview(interview1);
        return "deliveryRecord";
    }
}
