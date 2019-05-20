package com.cwc.model;

import java.io.Serializable;

public class TAE implements Serializable {
    private Integer tae_id;
    private Integer tae_traId;
    private Integer tae_empId;

    public Integer getTae_id() {
        return tae_id;
    }

    public void setTae_id(Integer tae_id) {
        this.tae_id = tae_id;
    }

    public Integer getTae_traId() {
        return tae_traId;
    }

    public void setTae_traId(Integer tae_traId) {
        this.tae_traId = tae_traId;
    }

    public Integer getTae_empId() {
        return tae_empId;
    }

    public void setTae_empId(Integer tae_empId) {
        this.tae_empId = tae_empId;
    }

    @Override
    public String toString() {
        return "TAE{" +
                "tae_id=" + tae_id +
                ", tae_traId=" + tae_traId +
                ", tae_empId=" + tae_empId +
                '}';
    }
}
