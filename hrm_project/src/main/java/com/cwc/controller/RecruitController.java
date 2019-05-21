package com.cwc.controller;

import com.cwc.model.Recruit;
import com.cwc.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class RecruitController {
    @Resource
    private RecruitService recruitService;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @RequestMapping("showRecruit")
    public String showRecruit(Integer rec_id, HttpSession session)throws Exception{
        Recruit recruit = new Recruit();
        recruit.setRec_id(rec_id);
        Recruit recruit1 = recruitService.queryRecruitById(recruit);
        session.setAttribute("recruit",recruit1);
        return "showRecruit";
    }

    @RequestMapping("issueRecruit")
    public String issueRecruit(Recruit recruit, HttpSession session)throws Exception{
        recruit.setRec_time(sdf.format(new Date()));
        recruit.setRec_state(1);
        recruitService.addRecruit(recruit);
        return "";
    }
    @RequestMapping("withdrawRecruit")
    public String withdrawRecruit(Integer rec_id, HttpSession session)throws Exception{
        //未实现页面
        Recruit recruit = new Recruit();
        recruit.setRec_id(rec_id);
        Recruit recruit1 = recruitService.queryRecruitById(recruit);
        recruit1.setRec_state(0);
        recruitService.updateRecruit(recruit1);
        return "";
    }
}
