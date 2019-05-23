package com.cwc.controller;

import com.cwc.model.Resume;
import com.cwc.model.User;
import com.cwc.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;

    @RequestMapping("addResume")
    public void addResume(Resume resume, HttpSession session , HttpServletResponse response)throws Exception{
        if (resumeService.addResume(resume)){
            session.setAttribute("resume",resume);
            response.getWriter().print("<script language='javascript'>alert('创建成功');window.location.href='toUserMain';</script>");
        }else{
            response.getWriter().print("<script language='javascript'>alert('创建失败');window.location.href='toUserMain';</script>");
        }
    }
    @RequestMapping("updateResume")
    public void updateResume(Resume resume, HttpSession session,HttpServletResponse response)throws Exception{
        if (resumeService.updateResume(resume)) {
            session.setAttribute("resume",resume);
            response.getWriter().print("<script language='javascript'>alert('修改成功');window.location.href='toUserMain';</script>");
        }else{
            session.setAttribute("resume",resume);
            response.getWriter().print("<script language='javascript'>alert('修改失败');window.location.href='toUserMain';</script>");
        }
    }
    @RequestMapping("showResume")
    public String showResume( HttpSession session)throws Exception{
        User user = (User) session.getAttribute("user");
        Resume resume = new Resume();
        resume.setRes_uid(user.getUser_id());
        Resume resume1 = resumeService.queryResumeByUid(resume);
        session.setAttribute("resume",resume1);
        return "/WEB-INF/page2/old/showResume.jsp";
    }
    @RequestMapping("toResume")
    public String toResume()throws Exception{
        return "/WEB-INF/page2/old/myResume.jsp";
    }
}
