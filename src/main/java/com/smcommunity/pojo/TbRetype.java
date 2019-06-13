package com.smcommunity.pojo;

public class TbRetype {
    private Integer id;

    private Integer uid;

    private String maxtype;

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

    public String getMaxtype() {
        return maxtype;
    }

    public void setMaxtype(String maxtype) {
        this.maxtype = maxtype == null ? null : maxtype.trim();
    }
}