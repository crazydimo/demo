package com.cwc.service;

import com.cwc.model.Attendance;

public interface AttendanceService {
    boolean addAttendance(Attendance attendance);
    boolean delAttendance(Attendance attendance);
    boolean updateAttendance(Attendance attendance);
    Attendance queryAttendanceByStartTimeAndEid(Attendance attendance);
    Attendance queryAttendance();
}
