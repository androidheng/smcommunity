package com.smcommunity.pojo;

public class TbType {
    private Integer id;

    private String typename;

    private String etypename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getEtypename() {
        return etypename;
    }

    public void setEtypename(String etypename) {
        this.etypename = etypename == null ? null : etypename.trim();
    }
}