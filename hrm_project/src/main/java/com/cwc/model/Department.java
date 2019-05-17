package com.cwc.model;

import java.io.Serializable;

public class Department implements Serializable {
    private Integer dep_id;
    private String dep_name;
    private String dep_time;

    public Integer getDep_id() {
        return dep_id;
    }

    public void setDep_id(Integer dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getDep_time() {
        return dep_time;
    }

    public void setDep_time(String dep_time) {
        this.dep_time = dep_time;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dep_id=" + dep_id +
                ", dep_name='" + dep_name + '\'' +
                ", dep_time='" + dep_time + '\'' +
                '}';
    }
}
