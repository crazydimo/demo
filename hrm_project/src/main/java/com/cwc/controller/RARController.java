package com.cwc.controller;

import com.cwc.model.RAR;
import com.cwc.model.Resume;
import com.cwc.model.User;
import com.cwc.service.RARService;
import com.cwc.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class RARController {
    @Resource
    private RARService rarService;
    @Resource
    private ResumeService resumeService;

    @RequestMapping("dropResume")
    public void dropResume(RAR rar, HttpSession session, HttpServletResponse response)throws Exception{
        PrintWriter out= response.getWriter();
        User user = (User) session.getAttribute("user");
        if (user==null){
            out.print("<script language='javascript'>alert('你还没有登录');window.location.href='index';</script>");
        }
        //还需要判断是否重复投
        rar.setRar_state(1);
        rarService.addRAR(rar);
        out.print("<script language='javascript'>alert('投递成功');window.location.href='toUserMain';</script>");
    }
    @RequestMapping("showRAR")
    public String showRAR(HttpSession session)throws Exception{
        User user = (User) session.getAttribute("user");
        Resume resume = new Resume();
        resume.setRes_uid(user.getUser_id());
        Resume resume1 = resumeService.queryResumeByUid(resume);
        RAR rar = new RAR();
        rar.setRar_resId(resume1.getRes_id());
        List<RAR> rars = rarService.queryRARByResId(rar);
        session.setAttribute("rars",rars);
        return "deliveryRecord";
    }
}
