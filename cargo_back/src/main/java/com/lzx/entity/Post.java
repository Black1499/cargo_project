package com.lzx.entity;

import java.util.Date;

public class Post {
    private Integer postId;

    private String postPhoto;

    private String postMan;

    private Date postTime;

    private Integer postCommentCount;

    private String postContext;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostPhoto() {
        return postPhoto;
    }

    public void setPostPhoto(String postPhoto) {
        this.postPhoto = postPhoto == null ? null : postPhoto.trim();
    }

    public String getPostMan() {
        return postMan;
    }

    public void setPostMan(String postMan) {
        this.postMan = postMan == null ? null : postMan.trim();
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public Integer getPostCommentCount() {
        return postCommentCount;
    }

    public void setPostCommentCount(Integer postCommentCount) {
        this.postCommentCount = postCommentCount;
    }

    public String getPostContext() {
        return postContext;
    }

    public void setPostContext(String postContext) {
        this.postContext = postContext == null ? null : postContext.trim();
    }

    public Post() {
    }

    public Post(String postPhoto, String postMan, Date postTime, String postContext) {
        this.postPhoto = postPhoto;
        this.postMan = postMan;
        this.postTime = postTime;
        this.postContext = postContext;
    }
}