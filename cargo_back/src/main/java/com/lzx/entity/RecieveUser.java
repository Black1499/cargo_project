package com.lzx.entity;

import java.util.Date;

public class RecieveUser {
    private Integer recId;

    private Integer recCarTypeId;

    private String recNumber;

    private String recPassword;

    private String recPhoto;

    private String recName;

    private String recSex;

    private Date recBirthday;

    private String recPalce;

    private String recIdNumber;

    private String recDriverNumber;

    private String recCarNumer;

    private String recVehicleType;

    private Date recStartTime;

    private Date recEffectiveTime;

    private Integer recOrderCompletionNumber;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getRecCarTypeId() {
        return recCarTypeId;
    }

    public void setRecCarTypeId(Integer recCarTypeId) {
        this.recCarTypeId = recCarTypeId;
    }

    public String getRecNumber() {
        return recNumber;
    }

    public void setRecNumber(String recNumber) {
        this.recNumber = recNumber == null ? null : recNumber.trim();
    }

    public String getRecPassword() {
        return recPassword;
    }

    public void setRecPassword(String recPassword) {
        this.recPassword = recPassword == null ? null : recPassword.trim();
    }

    public String getRecPhoto() {
        return recPhoto;
    }

    public void setRecPhoto(String recPhoto) {
        this.recPhoto = recPhoto == null ? null : recPhoto.trim();
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName == null ? null : recName.trim();
    }

    public String getRecSex() {
        return recSex;
    }

    public void setRecSex(String recSex) {
        this.recSex = recSex == null ? null : recSex.trim();
    }

    public Date getRecBirthday() {
        return recBirthday;
    }

    public void setRecBirthday(Date recBirthday) {
        this.recBirthday = recBirthday;
    }

    public String getRecPalce() {
        return recPalce;
    }

    public void setRecPalce(String recPalce) {
        this.recPalce = recPalce == null ? null : recPalce.trim();
    }

    public String getRecIdNumber() {
        return recIdNumber;
    }

    public void setRecIdNumber(String recIdNumber) {
        this.recIdNumber = recIdNumber == null ? null : recIdNumber.trim();
    }

    public String getRecDriverNumber() {
        return recDriverNumber;
    }

    public void setRecDriverNumber(String recDriverNumber) {
        this.recDriverNumber = recDriverNumber == null ? null : recDriverNumber.trim();
    }

    public String getRecCarNumer() {
        return recCarNumer;
    }

    public void setRecCarNumer(String recCarNumer) {
        this.recCarNumer = recCarNumer == null ? null : recCarNumer.trim();
    }

    public String getRecVehicleType() {
        return recVehicleType;
    }

    public void setRecVehicleType(String recVehicleType) {
        this.recVehicleType = recVehicleType == null ? null : recVehicleType.trim();
    }

    public Date getRecStartTime() {
        return recStartTime;
    }

    public void setRecStartTime(Date recStartTime) {
        this.recStartTime = recStartTime;
    }

    public Date getRecEffectiveTime() {
        return recEffectiveTime;
    }

    public void setRecEffectiveTime(Date recEffectiveTime) {
        this.recEffectiveTime = recEffectiveTime;
    }

    public Integer getRecOrderCompletionNumber() {
        return recOrderCompletionNumber;
    }

    public void setRecOrderCompletionNumber(Integer recOrderCompletionNumber) {
        this.recOrderCompletionNumber = recOrderCompletionNumber;
    }
}