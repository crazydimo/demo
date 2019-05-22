package com.cwc.model;

import java.io.Serializable;

public class RAP implements Serializable {
    private Integer rap_id;
    private String rap_time;
    private String rap_reason;
    private Double rap_salary;
    private Integer rap_eid;

    public Integer getRap_id() {
        return rap_id;
    }

    public void setRap_id(Integer rap_id) {
        this.rap_id = rap_id;
    }

    public String getRap_time() {
        return rap_time;
    }

    public void setRap_time(String rap_time) {
        this.rap_time = rap_time;
    }

    public String getRap_reason() {
        return rap_reason;
    }

    public void setRap_reason(String rap_reason) {
        this.rap_reason = rap_reason;
    }

    public Double getRap_salary() {
        return rap_salary;
    }

    public void setRap_salary(Double rap_salary) {
        this.rap_salary = rap_salary;
    }

    public Integer getRap_eid() {
        return rap_eid;
    }

    public void setRap_eid(Integer rap_eid) {
        this.rap_eid = rap_eid;
    }

    @Override
    public String toString() {
        return "RAP{" +
                "rap_id=" + rap_id +
                ", rap_time='" + rap_time + '\'' +
                ", rap_reason='" + rap_reason + '\'' +
                ", rap_salary=" + rap_salary +
                ", rap_eid=" + rap_eid +
                '}';
    }
}
