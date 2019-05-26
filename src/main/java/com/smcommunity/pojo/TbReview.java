package com.smcommunity.pojo;

public class TbReview {
    private Integer id;

    private Integer uid;

    private String reviewcontent;

    private String reviewtime;

    private Integer cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getReviewcontent() {
        return reviewcontent;
    }

    public void setReviewcontent(String reviewcontent) {
        this.reviewcontent = reviewcontent == null ? null : reviewcontent.trim();
    }

    public String getReviewtime() {
        return reviewtime;
    }

    public void setReviewtime(String reviewtime) {
        this.reviewtime = reviewtime == null ? null : reviewtime.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}