package com.cwc.model;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer admin_id;
    private String admin_name;
    private String admin_pass;

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_pass() {
        return admin_pass;
    }

    public void setAdmin_pass(String admin_pass) {
        this.admin_pass = admin_pass;
    }

    @Override
    public String toString() {
        return "AdminDao{" +
                "admin_id=" + admin_id +
                ", admin_name='" + admin_name + '\'' +
                ", admin_pass='" + admin_pass + '\'' +
                '}';
    }
}
