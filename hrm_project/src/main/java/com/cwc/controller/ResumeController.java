package com.cwc.controller;

import com.cwc.model.Resume;
import com.cwc.model.User;
import com.cwc.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;

    @RequestMapping("addResume")
    public String addResume(Resume resume, HttpSession session)throws Exception{
        resumeService.addResume(resume);
        return "userMain";
    }
    @RequestMapping("updateResume")
    public String updateResume(Resume resume, HttpSession session)throws Exception{
        resumeService.updateResume(resume);
        return showResume(session);
    }
    @RequestMapping("showResume")
    public String showResume( HttpSession session)throws Exception{
        User user = (User) session.getAttribute("user");
        Resume resume = new Resume();
        resume.setRes_uid(user.getUser_id());
        Resume resume1 = resumeService.queryResumeByUid(resume);
        session.setAttribute("resume",resume1);
        return "showResume";
    }
    @RequestMapping("toResume")
    public String toResume()throws Exception{
        return "myResume";
    }
}
