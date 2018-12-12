package com.lzx.entity;

import java.util.Date;

public class Log {
    private Integer logId;

    private Integer logAdminId;

    private Date logTime;

    private String logOpearte;

    private Admin admin;


    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getLogAdminId() {
        return logAdminId;
    }

    public void setLogAdminId(Integer logAdminId) {
        this.logAdminId = logAdminId;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getLogOpearte() {
        return logOpearte;
    }

    public void setLogOpearte(String logOpearte) {
        this.logOpearte = logOpearte == null ? null : logOpearte.trim();
    }

    public Log(Integer logAdminId, String logOpearte) {
        this.logAdminId = logAdminId;
        this.logOpearte = logOpearte;
    }

    public Log() {
    }
}