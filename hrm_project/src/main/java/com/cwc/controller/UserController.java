package com.cwc.controller;

import com.cwc.model.Recruit;
import com.cwc.model.Resume;
import com.cwc.model.User;
import com.cwc.service.RecruitService;
import com.cwc.service.ResumeService;
import com.cwc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private RecruitService recruitService;
    @Resource
    private ResumeService resumeService;

    @RequestMapping("index")
    public String index(HttpSession session)throws Exception{
        List<Recruit> recruits = recruitService.queryRecruit();
        session.setAttribute("recruits",recruits);
        return "../../index";
    }

    @RequestMapping("userLogin")
    public String login(User user, HttpSession session)throws Exception{
        User u = userService.login(user);
        Resume resume = new Resume();
        if (u!=null){
            resume.setRes_uid(u.getUser_id());
            Resume res = resumeService.queryResumeByUid(resume);
            session.setAttribute("user" ,u);
            session.setAttribute("resume" ,res);
            return "userMain";
        }
        return "../../index";
    }
    @RequestMapping("register")
    public String register(User user)throws Exception{
        if (userService.register(user)){
            return "../../index";
        }
        return "register";
    }
    @RequestMapping("toRegister")
    public String toRegister()throws Exception{
        return "register";
    }
    @RequestMapping("toUserMain")
    public String toUserMain()throws Exception{
        return "userMain";
    }

}
