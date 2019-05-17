package com.cwc.model;

import java.io.Serializable;

public class Recruit implements Serializable {
    private Integer rec_id;
    private Integer rec_depId;
    private Integer rec_posId;
    private Integer rec_budget;
    private String rec_description;
    private String rec_welfare;
    private String rec_requirement;
    private String rec_time;
    private Integer rec_state;

    public Integer getRec_id() {
        return rec_id;
    }

    public void setRec_id(Integer rec_id) {
        this.rec_id = rec_id;
    }

    public Integer getRec_depId() {
        return rec_depId;
    }

    public void setRec_depId(Integer rec_depId) {
        this.rec_depId = rec_depId;
    }

    public Integer getRec_posId() {
        return rec_posId;
    }

    public void setRec_posId(Integer rec_posId) {
        this.rec_posId = rec_posId;
    }

    public Integer getRec_budget() {
        return rec_budget;
    }

    public void setRec_budget(Integer rec_budget) {
        this.rec_budget = rec_budget;
    }

    public String getRec_description() {
        return rec_description;
    }

    public void setRec_description(String rec_description) {
        this.rec_description = rec_description;
    }

    public String getRec_welfare() {
        return rec_welfare;
    }

    public void setRec_welfare(String rec_welfare) {
        this.rec_welfare = rec_welfare;
    }

    public String getRec_requirement() {
        return rec_requirement;
    }

    public void setRec_requirement(String rec_requirement) {
        this.rec_requirement = rec_requirement;
    }

    public String getRec_time() {
        return rec_time;
    }

    public void setRec_time(String rec_time) {
        this.rec_time = rec_time;
    }

    public Integer getRec_state() {
        return rec_state;
    }

    public void setRec_state(Integer rec_state) {
        this.rec_state = rec_state;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "rec_id=" + rec_id +
                ", rec_depId=" + rec_depId +
                ", rec_posId=" + rec_posId +
                ", rec_budget=" + rec_budget +
                ", rec_description='" + rec_description + '\'' +
                ", rec_welfare='" + rec_welfare + '\'' +
                ", rec_requirement='" + rec_requirement + '\'' +
                ", rec_time='" + rec_time + '\'' +
                ", rec_state=" + rec_state +
                '}';
    }
}
