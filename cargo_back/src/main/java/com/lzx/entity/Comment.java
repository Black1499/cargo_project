package com.lzx.entity;

import java.util.Date;

public class Comment {
    private Integer comId;

    private Integer comPostId;

    private String comMan;

    private Date comCommen;

    private Integer comAgreeCount;

    private String comContext;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getComPostId() {
        return comPostId;
    }

    public void setComPostId(Integer comPostId) {
        this.comPostId = comPostId;
    }

    public String getComMan() {
        return comMan;
    }

    public void setComMan(String comMan) {
        this.comMan = comMan == null ? null : comMan.trim();
    }

    public Date getComCommen() {
        return comCommen;
    }

    public void setComCommen(Date comCommen) {
        this.comCommen = comCommen;
    }

    public Integer getComAgreeCount() {
        return comAgreeCount;
    }

    public void setComAgreeCount(Integer comAgreeCount) {
        this.comAgreeCount = comAgreeCount;
    }

    public String getComContext() {
        return comContext;
    }

    public void setComContext(String comContext) {
        this.comContext = comContext == null ? null : comContext.trim();
    }

    public Comment() {
    }

    public Comment(Integer comPostId, String comMan, String comContext) {
        this.comPostId = comPostId;
        this.comMan = comMan;
        this.comContext = comContext;
    }
}