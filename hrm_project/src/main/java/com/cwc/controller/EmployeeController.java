package com.cwc.controller;

import com.cwc.model.Attendance;
import com.cwc.model.Employee;
import com.cwc.model.RAP;
import com.cwc.service.AttendanceService;
import com.cwc.service.EmployeeService;
import com.cwc.service.RAPService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    @Resource
    private AttendanceService attendanceService;
    @Resource
    private RAPService rapService;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping("showEmployee")
    public String showEmployee(Integer eid)throws Exception{
        Employee employee = new Employee();
        employee.setEmp_id(eid);
        Employee employee1 = employeeService.queryEmployeeByEid(employee);
        return "";
    }

    @RequestMapping("loginEmployee")
    public String loginEmployee(Employee employee, HttpSession session)throws Exception{
        Employee employee1 = employeeService.login(employee);
        if (employee1!=null){
            session.setAttribute("employee",employee1);
            return "employeeMain";
        }
        return "../../index";
    }
    @RequestMapping("updateEmployee")
    public String updateEmployee(Employee employee, HttpSession session)throws Exception{
        employeeService.updateEmployee(employee);
        return "";
    }
    @RequestMapping("queryEmployee")
    public List<Employee> queryEmployee(Integer pos_id,HttpSession session)throws Exception{
        Employee employee = new Employee();
        employee.setEmp_posId(pos_id);
        List<Employee> employees = employeeService.queryEmployeeByPosId(employee);
        session.setAttribute("employeesAdmin",employees);
        return employees;
    }

    //上班打卡
    @RequestMapping("clockIn")
    public void clockIn(HttpSession session, HttpServletResponse response) throws Exception{
        Employee employee = (Employee) session.getAttribute("employee");
        Attendance attendance = new Attendance();
        attendance.setAtt_startTime(sd.format(new Date()));
        attendance.setAtt_eid(employee.getEmp_id());
        Attendance attendance1 = attendanceService.queryAttendanceByStartTimeAndEid(attendance);
        RAP rap = new RAP();
        if (attendance1!=null){
            response.getWriter().print("<script language='javascript'>alert('你已经打过上班卡了');window.location.href='toEmployee';</script>");
        }else{
            Attendance attendance2 = new Attendance();
            Date startTime = new Date();
            attendance2.setAtt_startTime(sdf.format(startTime));
            attendance2.setAtt_eid(employee.getEmp_id());
            if (startTime.getHours()<=9){
                attendance2.setAtt_state(1);
            }else if (startTime.getHours()<=11){
                rap.setRap_time(sdf.format(new Date()));
                rap.setRap_salary(-50.0);
                rap.setRap_reason("迟到");
                rap.setRap_eid(employee.getEmp_id());
                attendance2.setAtt_state(3);
            }else{
                rap.setRap_time(sdf.format(new Date()));
                rap.setRap_salary(-300.0);
                rap.setRap_reason("旷工");
                rap.setRap_eid(employee.getEmp_id());
                attendance2.setAtt_state(4);
            }
            rapService.addRAP(rap);
            attendanceService.addAttendance(attendance2);
            response.getWriter().print("<script language='javascript'>alert('打卡成功');window.location.href='toEmployee';</script>");
        }
    }
    //下班打卡
    @RequestMapping("clockOut")
    public void clockOut(HttpSession session, HttpServletResponse response) throws Exception{
        Employee employee = (Employee) session.getAttribute("employee");
        Attendance attendance = new Attendance();
        attendance.setAtt_startTime(sd.format(new Date()));
        attendance.setAtt_eid(employee.getEmp_id());
        Attendance attendance1 = attendanceService.queryAttendanceByStartTimeAndEid(attendance);
        RAP rap = new RAP();
        if (attendance1==null){
            response.getWriter().print("<script language='javascript'>alert('你还没有上班打卡');window.location.href='toEmployee';</script>");
        }else if (attendance1.getAtt_endTime()!=null){
            response.getWriter().print("<script language='javascript'>alert('你已经打下班卡了');window.location.href='toEmployee';</script>");
        }else{
            Date endTime = new Date();
            attendance1.setAtt_endTime(sdf.format(endTime));
            attendance1.setAtt_eid(employee.getEmp_id());

            if (attendance1.getAtt_state()!=4 && endTime.getHours()-18>=1){
                rap.setRap_time(sdf.format(new Date()));
                rap.setRap_salary((endTime.getHours()-18)*30.0);
                rap.setRap_reason("加了"+(endTime.getHours()-18)+"小时班");
                rap.setRap_eid(employee.getEmp_id());
                attendance1.setAtt_state(2);
            }else if (attendance1.getAtt_state()==1 && endTime.getHours()>=18){
                attendance1.setAtt_state(1);//正常下班
            }else if (attendance1.getAtt_state()!=4 && endTime.getHours()>16){
                rap.setRap_time(sdf.format(new Date()));
                rap.setRap_salary(-50.0);
                rap.setRap_reason("早退");
                rap.setRap_eid(employee.getEmp_id());
                attendance1.setAtt_state(3);//早退
            }else if (attendance1.getAtt_state()!=4){
                rap.setRap_time(sdf.format(new Date()));
                rap.setRap_salary(-300.0);
                rap.setRap_reason("旷工");
                rap.setRap_eid(employee.getEmp_id());
                attendance1.setAtt_state(4);
            }
            attendanceService.updateAttendance(attendance1);
            response.getWriter().print("<script language='javascript'>alert('打卡成功');window.location.href='toEmployee';</script>");
        }
    }
    @RequestMapping("toEmployee")
    public String toEmployee(HttpSession session)throws Exception{
        return "employeeMain";
    }
}
