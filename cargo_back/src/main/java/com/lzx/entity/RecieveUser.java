package com.lzx.entity;

import java.util.Date;

public class RecieveUser {
    private Integer recId;

    private Integer recCarTypeId;

    private String recNumber;

    private String recPassword;

    private Date recCreated;

    private String recState;

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
        this.recNumber = recNumber;
    }

    public String getRecPassword() {
        return recPassword;
    }

    public void setRecPassword(String recPassword) {
        this.recPassword = recPassword;
    }

    public Date getRecCreated() {
        return recCreated;
    }

    public void setRecCreated(Date recCreated) {
        this.recCreated = recCreated;
    }

    public String getRecState() {
        return recState;
    }

    public void setRecState(String recState) {
        this.recState = recState;
    }

    public String getRecPhoto() {
        return recPhoto;
    }

    public void setRecPhoto(String recPhoto) {
        this.recPhoto = recPhoto;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public String getRecSex() {
        return recSex;
    }

    public void setRecSex(String recSex) {
        this.recSex = recSex;
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
        this.recPalce = recPalce;
    }

    public String getRecIdNumber() {
        return recIdNumber;
    }

    public void setRecIdNumber(String recIdNumber) {
        this.recIdNumber = recIdNumber;
    }

    public String getRecDriverNumber() {
        return recDriverNumber;
    }

    public void setRecDriverNumber(String recDriverNumber) {
        this.recDriverNumber = recDriverNumber;
    }

    public String getRecCarNumer() {
        return recCarNumer;
    }

    public void setRecCarNumer(String recCarNumer) {
        this.recCarNumer = recCarNumer;
    }

    public String getRecVehicleType() {
        return recVehicleType;
    }

    public void setRecVehicleType(String recVehicleType) {
        this.recVehicleType = recVehicleType;
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

    public RecieveUser() {
    }

    public RecieveUser(String recNumber, String recPassword) {
        this.recNumber = recNumber;
        this.recPassword = recPassword;
    }

    public RecieveUser(Integer recCarTypeId, String recNumber, String recName, String recSex, Date recBirthday, String recPalce, String recIdNumber, String recDriverNumber, String recCarNumer, String recVehicleType, Date recStartTime, Date recEffectiveTime) {
        this.recCarTypeId = recCarTypeId;
        this.recNumber = recNumber;
        this.recName = recName;
        this.recSex = recSex;
        this.recBirthday = recBirthday;
        this.recPalce = recPalce;
        this.recIdNumber = recIdNumber;
        this.recDriverNumber = recDriverNumber;
        this.recCarNumer = recCarNumer;
        this.recVehicleType = recVehicleType;
        this.recStartTime = recStartTime;
        this.recEffectiveTime = recEffectiveTime;
    }
}