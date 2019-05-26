package com.smcommunity.pojo;

public class TbFee {
    private Integer id;

    private String phone;

    private String cname;

    private String area;

    private Boolean money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Boolean getMoney() {
        return money;
    }

    public void setMoney(Boolean money) {
        this.money = money;
    }
}