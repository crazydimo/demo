package com.cwc.service.impl;

import com.cwc.dao.AttendanceDao;
import com.cwc.model.Attendance;
import com.cwc.service.AttendanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Resource
    private AttendanceDao attendanceDao;
    public boolean addAttendance(Attendance attendance) {
        if (attendance==null){
            return false;
        }
        return attendanceDao.addAttendance(attendance);
    }

    public boolean delAttendance(Attendance attendance) {
        if (attendance==null){
            return false;
        }
        return attendanceDao.delAttendance(attendance);
    }

    public boolean updateAttendance(Attendance attendance) {
        if (attendance==null){
            return false;
        }
        return attendanceDao.updateAttendance(attendance);
    }

    public Attendance queryAttendance() {
        return attendanceDao.queryAttendance();
    }
}
