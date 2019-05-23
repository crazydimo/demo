package com.cwc.dao;

import com.cwc.model.Attendance;

public interface AttendanceDao {
    boolean addAttendance(Attendance attendance);
    boolean delAttendance(Attendance attendance);
    boolean updateAttendance(Attendance attendance);
    Attendance queryAttendanceByStartTimeAndEid(Attendance attendance);
    Attendance queryAttendance();
}
