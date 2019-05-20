package com.cwc.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private Integer emp_id;
    private String emp_account;
    private String emp_pass;
    private Integer emp_depId;
    private Integer emp_posId;
    private Double emp_salary;
    private Integer emp_state;
    private String emp_name;
    private String emp_birthday;
    private String emp_sex;
    private Integer emp_phone;
    private String emp_email;
    private String emp_address;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_account() {
        return emp_account;
    }

    public void setEmp_account(String emp_account) {
        this.emp_account = emp_account;
    }

    public String getEmp_pass() {
        return emp_pass;
    }

    public void setEmp_pass(String emp_pass) {
        this.emp_pass = emp_pass;
    }

    public Integer getEmp_depId() {
        return emp_depId;
    }

    public void setEmp_depId(Integer emp_depId) {
        this.emp_depId = emp_depId;
    }

    public Integer getEmp_posId() {
        return emp_posId;
    }

    public void setEmp_posId(Integer emp_posId) {
        this.emp_posId = emp_posId;
    }

    public Double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(Double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public Integer getEmp_state() {
        return emp_state;
    }

    public void setEmp_state(Integer emp_state) {
        this.emp_state = emp_state;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_birthday() {
        return emp_birthday;
    }

    public void setEmp_birthday(String emp_birthday) {
        this.emp_birthday = emp_birthday;
    }

    public String getEmp_sex() {
        return emp_sex;
    }

    public void setEmp_sex(String emp_sex) {
        this.emp_sex = emp_sex;
    }

    public Integer getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(Integer emp_phone) {
        this.emp_phone = emp_phone;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_account='" + emp_account + '\'' +
                ", emp_pass='" + emp_pass + '\'' +
                ", emp_depId=" + emp_depId +
                ", emp_posId=" + emp_posId +
                ", emp_salary=" + emp_salary +
                ", emp_state=" + emp_state +
                ", emp_name='" + emp_name + '\'' +
                ", emp_birthday='" + emp_birthday + '\'' +
                ", emp_sex='" + emp_sex + '\'' +
                ", emp_phone=" + emp_phone +
                ", emp_email='" + emp_email + '\'' +
                ", emp_address='" + emp_address + '\'' +
                '}';
    }
}
