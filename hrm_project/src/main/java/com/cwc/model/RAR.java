package com.cwc.model;

import java.io.Serializable;

public class RAR implements Serializable {
    private Integer rar_id;
    private Integer rar_recId;
    private Integer rar_resId;
    private Integer rar_state;

    public Integer getRar_id() {
        return rar_id;
    }

    public void setRar_id(Integer rar_id) {
        this.rar_id = rar_id;
    }

    public Integer getRar_recId() {
        return rar_recId;
    }

    public void setRar_recId(Integer rar_recId) {
        this.rar_recId = rar_recId;
    }

    public Integer getRar_resId() {
        return rar_resId;
    }

    public void setRar_resId(Integer rar_resId) {
        this.rar_resId = rar_resId;
    }

    public Integer getRar_state() {
        return rar_state;
    }

    public void setRar_state(Integer rar_state) {
        this.rar_state = rar_state;
    }

    @Override
    public String toString() {
        return "RAR{" +
                "rar_id=" + rar_id +
                ", rar_recId=" + rar_recId +
                ", rar_resId=" + rar_resId +
                ", rar_state=" + rar_state +
                '}';
    }
}
