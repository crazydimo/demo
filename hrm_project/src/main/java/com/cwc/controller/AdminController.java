package com.cwc.controller;

import com.cwc.model.*;
import com.cwc.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {
    @Resource
    private AdminService adminService;
    @Resource
    private RARService rarService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private RecruitService recruitService;
    @Resource
    private UserService userService;
    @Resource
    private InterviewService interviewService;
    @Resource
    private EmployeeService employeeService;
    @Resource
    private DepartmentService departmentService;

    @RequestMapping("adminLogin")
    public String adminLogin(Admin admin, HttpSession session)throws Exception{
        Admin admin1 = adminService.login(admin);
        List<RAR> rars = rarService.queryRARByState();
        List<Interview> interviews = interviewService.queryInterviewByState();
        List<Department> departments = departmentService.queryDepartment();
        if (admin1!=null){
            session.setAttribute("rarsAdmin",rars);
            session.setAttribute("admin",admin);
            session.setAttribute("interviewsAdmin",interviews);
            session.setAttribute("departmentsAdmin",departments);
            return "adminMain";
        }
        return "../../index";
    }
    @RequestMapping("adminResume")
    public String adminResume(Integer res_id,Integer rar_id, HttpSession session)throws Exception{
        //得到页面所需的对象
        Resume resume = new Resume();
        resume.setRes_id(res_id);
        Resume resume1 = resumeService.queryResumeById(resume);
        //将rar记录成为已查看
        RAR rar = new RAR();
        rar.setRar_id(rar_id);
        RAR rar1 = rarService.queryRARById(rar);
        rar1.setRar_state(2);
        rarService.updateRAR(rar1);

        //获取User对象
        User user = new User();
        user.setUser_id(resume1.getRes_uid());
        User user1 = userService.queryUserById(user);

        session.setAttribute("user",user1);
        session.setAttribute("rarAdmin",rar);
        session.setAttribute("resumeAdmin",resume1);
        return "adminResume";
    }

    @RequestMapping("hire")
    public String hire(Integer inte_id,HttpSession session)throws Exception{
        //得到简历id，和招聘id
        Interview interview = new Interview();
        interview.setInt_id(inte_id);
        Interview interview1 = interviewService.queryInterviewById(interview);
        interview1.setInt_state(4);
        RAR rar = new RAR();
        rar.setRar_id(interview1.getInt_rarId());
        RAR rar1 = rarService.queryRARById(rar);

        //得到简历内容
        Resume resume = new Resume();
        resume.setRes_uid(rar1.getRar_resId());
        Resume resume1 = resumeService.queryResumeByUid(resume);

        //得到职位内容
        Recruit recruit = new Recruit();
        recruit.setRec_id(rar1.getRar_recId());
        Recruit recruit1 = recruitService.queryRecruitById(recruit);

        //写入员工表
        Employee employee = new Employee();
        employee.setEmp_account(resume1.getRes_phone()+"hrm");
        employee.setEmp_pass("hrm");
        employee.setEmp_depId(recruit1.getRec_depId());
        employee.setEmp_posId(recruit1.getRec_posId());
        employee.setEmp_salary(recruit1.getRec_budget());
        employee.setEmp_state(2);
        employee.setEmp_name(resume1.getRes_name());
        employee.setEmp_birthday(resume1.getRes_birthday());
        employee.setEmp_sex(resume1.getRes_sex());
        employee.setEmp_phone(resume1.getRes_phone());
        employee.setEmp_email(resume1.getRes_email());
        employee.setEmp_address(resume1.getRes_address());
        employeeService.addEmployee(employee);

        return flushAdmin(session);
    }
    @RequestMapping("refuseAdmin")
    public String refuseAdmin(Integer inte_id,HttpSession session)throws Exception{
        Interview interview = new Interview();
        interview.setInt_id(inte_id);
        Interview interview1 = interviewService.queryInterviewById(interview);
        interview1.setInt_state(3);
        interviewService.updateInterview(interview1);
        return flushAdmin(session);
    }

    @RequestMapping("flushAdmin")
    public String flushAdmin(HttpSession session)throws Exception {
        List<RAR> rars = rarService.queryRARByState();
        List<Interview> interviews = interviewService.queryInterviewByState();
        session.setAttribute("rarsAdmin",rars);

        return "adminMain";
    }
}
