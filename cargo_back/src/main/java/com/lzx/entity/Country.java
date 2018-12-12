package com.lzx.entity;

public class Country {
    private Integer courtryId;

    private String courtryName;

    private Integer courtryPid;

    public Integer getCourtryId() {
        return courtryId;
    }

    public void setCourtryId(Integer courtryId) {
        this.courtryId = courtryId;
    }

    public String getCourtryName() {
        return courtryName;
    }

    public void setCourtryName(String courtryName) {
        this.courtryName = courtryName == null ? null : courtryName.trim();
    }

    public Integer getCourtryPid() {
        return courtryPid;
    }

    public void setCourtryPid(Integer courtryPid) {
        this.courtryPid = courtryPid;
    }
}