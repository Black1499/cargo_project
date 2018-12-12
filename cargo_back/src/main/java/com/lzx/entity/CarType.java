package com.lzx.entity;

public class CarType {
    private Integer ctypeId;

    private Integer ctypeAxleNumber;

    private Integer ctypeTotalMass;

    private String ctypeDriverType;

    private String ctypeDescribe;

    public Integer getCtypeId() {
        return ctypeId;
    }

    public void setCtypeId(Integer ctypeId) {
        this.ctypeId = ctypeId;
    }

    public Integer getCtypeAxleNumber() {
        return ctypeAxleNumber;
    }

    public void setCtypeAxleNumber(Integer ctypeAxleNumber) {
        this.ctypeAxleNumber = ctypeAxleNumber;
    }

    public Integer getCtypeTotalMass() {
        return ctypeTotalMass;
    }

    public void setCtypeTotalMass(Integer ctypeTotalMass) {
        this.ctypeTotalMass = ctypeTotalMass;
    }

    public String getCtypeDriverType() {
        return ctypeDriverType;
    }

    public void setCtypeDriverType(String ctypeDriverType) {
        this.ctypeDriverType = ctypeDriverType == null ? null : ctypeDriverType.trim();
    }

    public String getCtypeDescribe() {
        return ctypeDescribe;
    }

    public void setCtypeDescribe(String ctypeDescribe) {
        this.ctypeDescribe = ctypeDescribe == null ? null : ctypeDescribe.trim();
    }

    public CarType(Integer ctypeId, Integer ctypeAxleNumber, Integer ctypeTotalMass, String ctypeDriverType, String ctypeDescribe) {
        this.ctypeId = ctypeId;
        this.ctypeAxleNumber = ctypeAxleNumber;
        this.ctypeTotalMass = ctypeTotalMass;
        this.ctypeDriverType = ctypeDriverType;
        this.ctypeDescribe = ctypeDescribe;
    }

    public CarType(Integer ctypeAxleNumber, Integer ctypeTotalMass, String ctypeDriverType, String ctypeDescribe) {
        this.ctypeAxleNumber = ctypeAxleNumber;
        this.ctypeTotalMass = ctypeTotalMass;
        this.ctypeDriverType = ctypeDriverType;
        this.ctypeDescribe = ctypeDescribe;
    }

    public CarType() {
    }
}