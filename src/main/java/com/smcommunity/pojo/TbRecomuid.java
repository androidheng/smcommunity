package com.smcommunity.pojo;

public class TbRecomuid {
    private Integer id;

    private Integer uid;

    private String maxtname;

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

    public String getMaxtname() {
        return maxtname;
    }

    public void setMaxtname(String maxtname) {
        this.maxtname = maxtname == null ? null : maxtname.trim();
    }
}