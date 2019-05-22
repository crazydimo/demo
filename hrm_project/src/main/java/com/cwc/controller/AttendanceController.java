package com.cwc.controller;

import com.cwc.model.Attendance;
import com.cwc.model.Employee;
import com.cwc.service.AttendanceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class AttendanceController {
    @Resource
    private AttendanceService attendanceService;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

    //上班打卡
    @RequestMapping("clockIn")
    public String clockIn(HttpSession session) throws Exception{
        Employee employee = (Employee) session.getAttribute("employee");
        Attendance attendance = new Attendance();
        Date startTime = new Date();
        attendance.setAtt_startTime(sdf.format(startTime));
        attendance.setAtt_eid(employee.getEmp_id());
        if (startTime.getHours()<=9){
            attendance.setAtt_state(1);
        }else if (startTime.getHours()<=12){
            attendance.setAtt_state(3);
        }else{
            attendance.setAtt_state(4);
        }
        return "";
    }
    //下班打卡
    @RequestMapping("clockOut")
    public String clockOut(HttpSession session) throws Exception{
        Employee employee = (Employee) session.getAttribute("employee");
        Attendance attendance = new Attendance();
        Date endTime = new Date();
        attendance.setAtt_startTime(sdf.format(endTime));
        attendance.setAtt_eid(employee.getEmp_id());
        if (endTime.getHours()>=18){
            attendance.setAtt_state(1);
        }else if (endTime.getHours()>15){
            attendance.setAtt_state(3);
        }else if (endTime.getHours()>=18 && endTime.getHours()<24){
            attendance.setAtt_state(2);
        }else{
            attendance.setAtt_state(4);
        }
        return "";
    }
}
