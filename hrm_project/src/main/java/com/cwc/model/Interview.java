package com.cwc.model;

import java.io.Serializable;

public class Interview implements Serializable {
    private Integer int_id;
    private String int_time;
    private String int_address;
    private String int_linkman;
    private Integer int_uid;
    private Integer int_state;
    private Integer int_rarId;

    public Integer getInt_id() {
        return int_id;
    }

    public void setInt_id(Integer int_id) {
        this.int_id = int_id;
    }

    public String getInt_time() {
        return int_time;
    }

    public void setInt_time(String int_time) {
        this.int_time = int_time;
    }

    public String getInt_address() {
        return int_address;
    }

    public void setInt_address(String int_address) {
        this.int_address = int_address;
    }

    public String getInt_linkman() {
        return int_linkman;
    }

    public void setInt_linkman(String int_linkman) {
        this.int_linkman = int_linkman;
    }

    public Integer getInt_uid() {
        return int_uid;
    }

    public void setInt_uid(Integer int_uid) {
        this.int_uid = int_uid;
    }

    public Integer getInt_state() {
        return int_state;
    }

    public void setInt_state(Integer int_state) {
        this.int_state = int_state;
    }

    public Integer getInt_rarId() {
        return int_rarId;
    }

    public void setInt_rarId(Integer int_rarId) {
        this.int_rarId = int_rarId;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "int_id=" + int_id +
                ", int_time='" + int_time + '\'' +
                ", int_address='" + int_address + '\'' +
                ", int_linkman='" + int_linkman + '\'' +
                ", int_uid=" + int_uid +
                ", int_state=" + int_state +
                ", int_rarId=" + int_rarId +
                '}';
    }
}
