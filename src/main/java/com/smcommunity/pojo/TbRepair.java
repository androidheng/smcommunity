package com.smcommunity.pojo;

public class TbRepair {
    private Integer id;

    private String name;

    private String lou;

    private String home;

    private String content;

    private String contact;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLou() {
        return lou;
    }

    public void setLou(String lou) {
        this.lou = lou == null ? null : lou.trim();
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home == null ? null : home.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}