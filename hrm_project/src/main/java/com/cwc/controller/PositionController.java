package com.cwc.controller;

import com.cwc.model.Position;
import com.cwc.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class PositionController {
    @Resource
    private PositionService positionService;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @RequestMapping("createPosition")
    public void createPosition(Position position,HttpServletResponse response)throws Exception{
        PrintWriter out= response.getWriter();
        position.setPos_time(sdf.format(new Date()));
        if (positionService.addPosition(position)){
            out.print("<script language='javascript'>alert('创建成功');window.location.href='flushAdmin';</script>");
        }else{
            out.print("<script language='javascript'>alert('创建失败');window.location.href='flushAdmin';</script>");
        }
    }
    @RequestMapping("toPostRecruitment")
    public String toPostRecruitment()throws Exception{
        return "postRecruitment";
    }

    @RequestMapping("queryPosition")
    @ResponseBody
    public List<Position> queryPosition(Integer dep_id, HttpSession session)throws Exception{
        Position position = new Position();
        position.setPos_depId(dep_id);
        List<Position> positions = positionService.queryPositionByDepId(position);
        session.setAttribute("positionsAdmin",positions);
        return positions;
    }
}
