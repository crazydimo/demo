package com.cwc.model;

import java.io.Serializable;

public class Attendance implements Serializable {
    private Integer att_id;
    private String att_startTime;
    private String att_endTime;
    private Integer att_state;
    private Integer att_eid;

    public Integer getAtt_id() {
        return att_id;
    }

    public void setAtt_id(Integer att_id) {
        this.att_id = att_id;
    }

    public String getAtt_startTime() {
        return att_startTime;
    }

    public void setAtt_startTime(String att_startTime) {
        this.att_startTime = att_startTime;
    }

    public String getAtt_endTime() {
        return att_endTime;
    }

    public void setAtt_endTime(String att_endTime) {
        this.att_endTime = att_endTime;
    }

    public Integer getAtt_state() {
        return att_state;
    }

    public void setAtt_state(Integer att_state) {
        this.att_state = att_state;
    }

    public Integer getAtt_eid() {
        return att_eid;
    }

    public void setAtt_eid(Integer att_eid) {
        this.att_eid = att_eid;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "att_id=" + att_id +
                ", att_startTime='" + att_startTime + '\'' +
                ", att_endTime='" + att_endTime + '\'' +
                ", att_state=" + att_state +
                ", att_eid=" + att_eid +
                '}';
    }
}
