package com.lzx.entity;

public class Country {
    private Integer countryId;

    private String countryName;

    private Integer countryPid;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    public Integer getCountryPid() {
        return countryPid;
    }

    public void setCountryPid(Integer countryPid) {
        this.countryPid = countryPid;
    }
}