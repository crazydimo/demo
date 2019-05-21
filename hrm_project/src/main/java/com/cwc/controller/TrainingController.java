package com.cwc.controller;

import com.cwc.model.Training;
import com.cwc.service.TAEService;
import com.cwc.service.TrainingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class TrainingController {
    @Resource
    private TrainingService trainingService;
    @Resource
    private TAEService taeService;

    @RequestMapping("addTraining")
    public void addTraining(Training training, HttpServletResponse response)throws Exception{
        PrintWriter out = response.getWriter();
        training.setTra_state(0);
        trainingService.addTraining(training);
        out.print("<script language='javascript'>alert('创建成功');window.location.href='showTraining';</script>");
    }

    @RequestMapping("showTraining")
    public String showTraining(HttpSession session)throws Exception{
        List<Training> trainings = trainingService.queryTraining();
        session.setAttribute("trainingsAdmin",trainings);
        return "issueTraining";
    }

    @RequestMapping("confirmTraining")
    public String confirmTraining(Training training,HttpSession session)throws Exception{
        training.setTra_state(1);
        trainingService.updateTraining(training);
        return showTraining(session);
    }
    @RequestMapping("delTraining")
    public String delTraining(Training training,HttpSession session)throws Exception{
        trainingService.delTraining(training);
        return showTraining(session);
    }

    @RequestMapping("withdrawTraining")
    public String withdrawTraining(Training training,HttpSession session)throws Exception{
        training.setTra_state(0);
        trainingService.updateTraining(training);
        return showTraining(session);
    }


    @RequestMapping("toIssueTraining")
    public String toIssueTraining()throws Exception{
        return "issueTraining";
    }
    @RequestMapping("toCreateTraining")
    public String toCreateTraining()throws Exception{
        return "createTraining";
    }
}
