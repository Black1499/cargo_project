package com.lzx.entity;

import java.util.Date;

public class Admin {
    private Integer admId;

    private String admPhone;

    private String admPassword;

    private String admName;

    private String admIdNumber;

    private String admSex;

    private Date admBirthday;

    private Date admWorkTime;

    private Date admLeftTime;

    private String admPhoto;

    public Integer getAdmId() {
        return admId;
    }

    public void setAdmId(Integer admId) {
        this.admId = admId;
    }

    public String getAdmPhone() {
        return admPhone;
    }

    public void setAdmPhone(String admPhone) {
        this.admPhone = admPhone == null ? null : admPhone.trim();
    }

    public String getAdmPassword() {
        return admPassword;
    }

    public void setAdmPassword(String admPassword) {
        this.admPassword = admPassword == null ? null : admPassword.trim();
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName == null ? null : admName.trim();
    }

    public String getAdmIdNumber() {
        return admIdNumber;
    }

    public void setAdmIdNumber(String admIdNumber) {
        this.admIdNumber = admIdNumber == null ? null : admIdNumber.trim();
    }

    public String getAdmSex() {
        return admSex;
    }

    public void setAdmSex(String admSex) {
        this.admSex = admSex == null ? null : admSex.trim();
    }

    public Date getAdmBirthday() {
        return admBirthday;
    }

    public void setAdmBirthday(Date admBirthday) {
        this.admBirthday = admBirthday;
    }

    public Date getAdmWorkTime() {
        return admWorkTime;
    }

    public void setAdmWorkTime(Date admWorkTime) {
        this.admWorkTime = admWorkTime;
    }

    public Date getAdmLeftTime() {
        return admLeftTime;
    }

    public void setAdmLeftTime(Date admLeftTime) {
        this.admLeftTime = admLeftTime;
    }

    public String getAdmPhoto() {
        return admPhoto;
    }

    public void setAdmPhoto(String admPhoto) {
        this.admPhoto = admPhoto == null ? null : admPhoto.trim();
    }

    public Admin() {
    }

    public Admin(Integer admId, String admPhone, String admPassword, String admName, String admIdNumber, String admSex, Date admBirthday, Date admWorkTime, Date admLeftTime, String admPhoto) {
        this.admId = admId;
        this.admPhone = admPhone;
        this.admPassword = admPassword;
        this.admName = admName;
        this.admIdNumber = admIdNumber;
        this.admSex = admSex;
        this.admBirthday = admBirthday;
        this.admWorkTime = admWorkTime;
        this.admLeftTime = admLeftTime;
        this.admPhoto = admPhoto;
    }

    public Admin(String admPhone, String admPassword, String admName, String admIdNumber, String admSex, Date admBirthday, Date admWorkTime, String admPhoto) {
        this.admPhone = admPhone;
        this.admPassword = admPassword;
        this.admName = admName;
        this.admIdNumber = admIdNumber;
        this.admSex = admSex;
        this.admBirthday = admBirthday;
        this.admWorkTime = admWorkTime;
        this.admPhoto = admPhoto;
    }
}