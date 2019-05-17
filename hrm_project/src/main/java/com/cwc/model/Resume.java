package com.cwc.model;

import java.io.Serializable;

public class Resume implements Serializable {
    private Integer res_id;
    private String res_name;
    private String res_sex;
    private String res_birthday;
    private String res_nation;
    private String res_nativePlace;
    private String res_school;
    private String res_politics;
    private String res_major;
    private String res_education;
    private Integer res_zipCode;
    private Integer res_phone;
    private String res_email;
    private String res_address;
    private String res_evaluation;
    private Integer res_uid;

    public Integer getRes_id() {
        return res_id;
    }

    public void setRes_id(Integer res_id) {
        this.res_id = res_id;
    }

    public String getRes_name() {
        return res_name;
    }

    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }

    public String getRes_sex() {
        return res_sex;
    }

    public void setRes_sex(String res_sex) {
        this.res_sex = res_sex;
    }

    public String getRes_birthday() {
        return res_birthday;
    }

    public void setRes_birthday(String res_birthday) {
        this.res_birthday = res_birthday;
    }

    public String getRes_nation() {
        return res_nation;
    }

    public void setRes_nation(String res_nation) {
        this.res_nation = res_nation;
    }

    public String getRes_nativePlace() {
        return res_nativePlace;
    }

    public void setRes_nativePlace(String res_nativePlace) {
        this.res_nativePlace = res_nativePlace;
    }

    public String getRes_school() {
        return res_school;
    }

    public void setRes_school(String res_school) {
        this.res_school = res_school;
    }

    public String getRes_politics() {
        return res_politics;
    }

    public void setRes_politics(String res_politics) {
        this.res_politics = res_politics;
    }

    public String getRes_major() {
        return res_major;
    }

    public void setRes_major(String res_major) {
        this.res_major = res_major;
    }

    public String getRes_education() {
        return res_education;
    }

    public void setRes_education(String res_education) {
        this.res_education = res_education;
    }

    public Integer getRes_zipCode() {
        return res_zipCode;
    }

    public void setRes_zipCode(Integer res_zipCode) {
        this.res_zipCode = res_zipCode;
    }

    public Integer getRes_phone() {
        return res_phone;
    }

    public void setRes_phone(Integer res_phone) {
        this.res_phone = res_phone;
    }

    public String getRes_email() {
        return res_email;
    }

    public void setRes_email(String res_email) {
        this.res_email = res_email;
    }

    public String getRes_address() {
        return res_address;
    }

    public void setRes_address(String res_address) {
        this.res_address = res_address;
    }

    public String getRes_evaluation() {
        return res_evaluation;
    }

    public void setRes_evaluation(String res_evaluation) {
        this.res_evaluation = res_evaluation;
    }

    public Integer getRes_uid() {
        return res_uid;
    }

    public void setRes_uid(Integer res_uid) {
        this.res_uid = res_uid;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "res_id=" + res_id +
                ", res_name='" + res_name + '\'' +
                ", res_sex='" + res_sex + '\'' +
                ", res_birthday='" + res_birthday + '\'' +
                ", res_nation='" + res_nation + '\'' +
                ", res_nativePlace='" + res_nativePlace + '\'' +
                ", res_school='" + res_school + '\'' +
                ", res_politics='" + res_politics + '\'' +
                ", res_major='" + res_major + '\'' +
                ", res_education='" + res_education + '\'' +
                ", res_zipCode=" + res_zipCode +
                ", res_phone=" + res_phone +
                ", res_email='" + res_email + '\'' +
                ", res_address='" + res_address + '\'' +
                ", res_evaluation='" + res_evaluation + '\'' +
                ", res_uid='" + res_uid + '\'' +
                '}';
    }
}
