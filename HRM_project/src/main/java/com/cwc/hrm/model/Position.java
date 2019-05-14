package com.cwc.hrm.model;

import java.io.Serializable;

public class Position implements Serializable {
    private Integer pos_id;
    private String pos_name;
    private String pos_time;
    private String pos_depId;

    public Integer getPos_id() {
        return pos_id;
    }

    public void setPos_id(Integer pos_id) {
        this.pos_id = pos_id;
    }

    public String getPos_name() {
        return pos_name;
    }

    public void setPos_name(String pos_name) {
        this.pos_name = pos_name;
    }

    public String getPos_time() {
        return pos_time;
    }

    public void setPos_time(String pos_time) {
        this.pos_time = pos_time;
    }

    public String getPos_depId() {
        return pos_depId;
    }

    public void setPos_depId(String pos_depId) {
        this.pos_depId = pos_depId;
    }

    @Override
    public String toString() {
        return "Position{" +
                "pos_id=" + pos_id +
                ", pos_name='" + pos_name + '\'' +
                ", pos_time='" + pos_time + '\'' +
                ", pos_depId='" + pos_depId + '\'' +
                '}';
    }
}
