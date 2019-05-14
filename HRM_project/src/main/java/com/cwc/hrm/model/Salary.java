package com.cwc.hrm.model;

import java.io.Serializable;

public class Salary implements Serializable {
    private Integer sal_id;
    private Integer sal_time;
    private Double sal_actual;
    private Integer sal_eid;

    public Integer getSal_id() {
        return sal_id;
    }

    public void setSal_id(Integer sal_id) {
        this.sal_id = sal_id;
    }

    public Integer getSal_time() {
        return sal_time;
    }

    public void setSal_time(Integer sal_time) {
        this.sal_time = sal_time;
    }

    public Double getSal_actual() {
        return sal_actual;
    }

    public void setSal_actual(Double sal_actual) {
        this.sal_actual = sal_actual;
    }

    public Integer getSal_eid() {
        return sal_eid;
    }

    public void setSal_eid(Integer sal_eid) {
        this.sal_eid = sal_eid;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "sal_id=" + sal_id +
                ", sal_time=" + sal_time +
                ", sal_actual=" + sal_actual +
                ", sal_eid=" + sal_eid +
                '}';
    }
}
