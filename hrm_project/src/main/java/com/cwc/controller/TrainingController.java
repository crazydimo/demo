package com.cwc.controller;

import com.cwc.model.Training;
import com.cwc.service.TAEService;
import com.cwc.service.TrainingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TrainingController {
    @Resource
    private TrainingService trainingService;
    @Resource
    private TAEService taeService;

    @RequestMapping("addTraining")
    public String addTraining(Training training)throws Exception{
        training.setTra_state(0);
        trainingService.addTraining(training);
        return "";
    }
    @RequestMapping("confirmTraining")
    public String confirmTraining(Training training)throws Exception{
        training.setTra_state(1);
        trainingService.updateTraining(training);
        return "";
    }
}
