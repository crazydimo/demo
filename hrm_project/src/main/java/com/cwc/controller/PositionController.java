package com.cwc.controller;

import com.cwc.model.Position;
import com.cwc.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class PositionController {
    @Resource
    private PositionService positionService;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @RequestMapping("createPosition")
    public String createPosition()throws Exception{
        Position position = new Position();
        position.setPos_time(sdf.format(new Date()));
        positionService.addPosition(position);
        return "";
    }
    @RequestMapping("toPostRecruitment")
    public String toPostRecruitment()throws Exception{
        return "postRecruitment";
    }

    @RequestMapping("queryPosition")
    @ResponseBody
    public List<Position> queryPosition(Integer dep_id)throws Exception{
        Position position = new Position();
        position.setPos_depId(dep_id);
        List<Position> positions = positionService.queryPositionByDepId(position);
        return positions;
    }
}
