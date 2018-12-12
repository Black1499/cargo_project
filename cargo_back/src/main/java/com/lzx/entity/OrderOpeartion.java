package com.lzx.entity;

import java.util.Date;

public class OrderOpeartion {
    private Integer opeId;

    private Integer opeOrderId;

    private String opeType;

    private Date opeTime;

    private String opeReason;

    private String opeState;

    private Date opeFinish;

    public Integer getOpeId() {
        return opeId;
    }

    public void setOpeId(Integer opeId) {
        this.opeId = opeId;
    }

    public Integer getOpeOrderId() {
        return opeOrderId;
    }

    public void setOpeOrderId(Integer opeOrderId) {
        this.opeOrderId = opeOrderId;
    }

    public String getOpeType() {
        return opeType;
    }

    public void setOpeType(String opeType) {
        this.opeType = opeType == null ? null : opeType.trim();
    }

    public Date getOpeTime() {
        return opeTime;
    }

    public void setOpeTime(Date opeTime) {
        this.opeTime = opeTime;
    }

    public String getOpeReason() {
        return opeReason;
    }

    public void setOpeReason(String opeReason) {
        this.opeReason = opeReason == null ? null : opeReason.trim();
    }

    public String getOpeState() {
        return opeState;
    }

    public void setOpeState(String opeState) {
        this.opeState = opeState == null ? null : opeState.trim();
    }

    public Date getOpeFinish() {
        return opeFinish;
    }

    public void setOpeFinish(Date opeFinish) {
        this.opeFinish = opeFinish;
    }

    public OrderOpeartion() {
    }

    public OrderOpeartion(Integer opeOrderId, String opeType, String opeReason) {
        this.opeOrderId = opeOrderId;
        this.opeType = opeType;
        this.opeReason = opeReason;
    }

    public OrderOpeartion(Integer opeId, String opeState) {
        this.opeId = opeId;
        this.opeState = opeState;
    }
}