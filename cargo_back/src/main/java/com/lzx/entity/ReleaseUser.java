package com.lzx.entity;

import java.util.Date;

public class ReleaseUser {
    private Integer relId;

    private String relNumber;

    private String relPassword;

    private Date relCreated;

    private String relState;

    private String relPhoto;

    private String relName;

    private String relSex;

    private Date relBirthday;

    private String relPalce;

    private String relIdNumber;

    private Integer relOrderCompletionNumber;

    private Integer relOrderCancelNumber;

    public Integer getRelId() {
        return relId;
    }

    public void setRelId(Integer relId) {
        this.relId = relId;
    }

    public String getRelNumber() {
        return relNumber;
    }

    public void setRelNumber(String relNumber) {
        this.relNumber = relNumber == null ? null : relNumber.trim();
    }

    public String getRelPassword() {
        return relPassword;
    }

    public void setRelPassword(String relPassword) {
        this.relPassword = relPassword == null ? null : relPassword.trim();
    }

    public Date getRelCreated() {
        return relCreated;
    }

    public void setRelCreated(Date relCreated) {
        this.relCreated = relCreated;
    }

    public String getRelState() {
        return relState;
    }

    public void setRelState(String relState) {
        this.relState = relState == null ? null : relState.trim();
    }

    public String getRelPhoto() {
        return relPhoto;
    }

    public void setRelPhoto(String relPhoto) {
        this.relPhoto = relPhoto == null ? null : relPhoto.trim();
    }

    public String getRelName() {
        return relName;
    }

    public void setRelName(String relName) {
        this.relName = relName == null ? null : relName.trim();
    }

    public String getRelSex() {
        return relSex;
    }

    public void setRelSex(String relSex) {
        this.relSex = relSex == null ? null : relSex.trim();
    }

    public Date getRelBirthday() {
        return relBirthday;
    }

    public void setRelBirthday(Date relBirthday) {
        this.relBirthday = relBirthday;
    }

    public String getRelPalce() {
        return relPalce;
    }

    public void setRelPalce(String relPalce) {
        this.relPalce = relPalce == null ? null : relPalce.trim();
    }

    public String getRelIdNumber() {
        return relIdNumber;
    }

    public void setRelIdNumber(String relIdNumber) {
        this.relIdNumber = relIdNumber == null ? null : relIdNumber.trim();
    }

    public Integer getRelOrderCompletionNumber() {
        return relOrderCompletionNumber;
    }

    public void setRelOrderCompletionNumber(Integer relOrderCompletionNumber) {
        this.relOrderCompletionNumber = relOrderCompletionNumber;
    }

    public Integer getRelOrderCancelNumber() {
        return relOrderCancelNumber;
    }

    public void setRelOrderCancelNumber(Integer relOrderCancelNumber) {
        this.relOrderCancelNumber = relOrderCancelNumber;
    }

    public ReleaseUser() {
    }

    public ReleaseUser(String relNumber, String relPassword) {
        this.relNumber = relNumber;
        this.relPassword = relPassword;
    }

    public ReleaseUser(String relNumber, String relName, String relSex, Date relBirthday, String relPalce, String relIdNumber) {
        this.relNumber = relNumber;
        this.relName = relName;
        this.relSex = relSex;
        this.relBirthday = relBirthday;
        this.relPalce = relPalce;
        this.relIdNumber = relIdNumber;
    }
}