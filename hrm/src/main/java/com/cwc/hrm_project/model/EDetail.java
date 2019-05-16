package com.cwc.hrm_project.model;

import java.io.Serializable;

public class EDetail implements Serializable {
    private Integer ed_id;
    private String ed_name;
    private String ed_birthday;
    private String ed_sex;
    private Integer ed_phone;
    private String ed_email;
    private String ed_address;
    private Integer ed_eid;

    public Integer getEd_id() {
        return ed_id;
    }

    public void setEd_id(Integer ed_id) {
        this.ed_id = ed_id;
    }

    public String getEd_name() {
        return ed_name;
    }

    public void setEd_name(String ed_name) {
        this.ed_name = ed_name;
    }

    public String getEd_birthday() {
        return ed_birthday;
    }

    public void setEd_birthday(String ed_birthday) {
        this.ed_birthday = ed_birthday;
    }

    public String getEd_sex() {
        return ed_sex;
    }

    public void setEd_sex(String ed_sex) {
        this.ed_sex = ed_sex;
    }

    public Integer getEd_phone() {
        return ed_phone;
    }

    public void setEd_phone(Integer ed_phone) {
        this.ed_phone = ed_phone;
    }

    public String getEd_email() {
        return ed_email;
    }

    public void setEd_email(String ed_email) {
        this.ed_email = ed_email;
    }

    public String getEd_address() {
        return ed_address;
    }

    public void setEd_address(String ed_address) {
        this.ed_address = ed_address;
    }

    public Integer getEd_eid() {
        return ed_eid;
    }

    public void setEd_eid(Integer ed_eid) {
        this.ed_eid = ed_eid;
    }

    @Override
    public String toString() {
        return "EDetail{" +
                "ed_id=" + ed_id +
                ", ed_name='" + ed_name + '\'' +
                ", ed_birthday='" + ed_birthday + '\'' +
                ", ed_sex='" + ed_sex + '\'' +
                ", ed_phone=" + ed_phone +
                ", ed_email='" + ed_email + '\'' +
                ", ed_address='" + ed_address + '\'' +
                ", ed_eid=" + ed_eid +
                '}';
    }
}
