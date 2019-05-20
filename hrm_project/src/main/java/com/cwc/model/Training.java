package com.cwc.model;

import java.io.Serializable;

public class Training implements Serializable {
    private Integer tra_id;
    private String tra_title;
    private String tra_content;
    private String tra_startTime;
    private String tra_endTime;
    private String tra_address;
    private Integer tra_state;

    public Integer getTra_id() {
        return tra_id;
    }

    public void setTra_id(Integer tra_id) {
        this.tra_id = tra_id;
    }

    public String getTra_title() {
        return tra_title;
    }

    public void setTra_title(String tra_title) {
        this.tra_title = tra_title;
    }

    public String getTra_content() {
        return tra_content;
    }

    public void setTra_content(String tra_content) {
        this.tra_content = tra_content;
    }

    public String getTra_startTime() {
        return tra_startTime;
    }

    public void setTra_startTime(String tra_startTime) {
        this.tra_startTime = tra_startTime;
    }

    public String getTra_endTime() {
        return tra_endTime;
    }

    public void setTra_endTime(String tra_endTime) {
        this.tra_endTime = tra_endTime;
    }

    public String getTra_address() {
        return tra_address;
    }

    public void setTra_address(String tra_address) {
        this.tra_address = tra_address;
    }

    public Integer getTra_state() {
        return tra_state;
    }

    public void setTra_state(Integer tra_state) {
        this.tra_state = tra_state;
    }

    @Override
    public String toString() {
        return "Training{" +
                "tra_id=" + tra_id +
                ", tra_title='" + tra_title + '\'' +
                ", tra_content='" + tra_content + '\'' +
                ", tra_startTime='" + tra_startTime + '\'' +
                ", tra_endTime='" + tra_endTime + '\'' +
                ", tra_address='" + tra_address + '\'' +
                ", tra_state=" + tra_state +
                '}';
    }
}
