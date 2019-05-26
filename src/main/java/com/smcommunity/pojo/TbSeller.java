package com.smcommunity.pojo;

public class TbSeller {
    private Integer id;

    private String username;

    private String password;

    private String serllername;

    private String sellertype;

    private String sellerddress;

    private String sellerphone;

    private String sellerlogo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSerllername() {
        return serllername;
    }

    public void setSerllername(String serllername) {
        this.serllername = serllername == null ? null : serllername.trim();
    }

    public String getSellertype() {
        return sellertype;
    }

    public void setSellertype(String sellertype) {
        this.sellertype = sellertype == null ? null : sellertype.trim();
    }

    public String getSellerddress() {
        return sellerddress;
    }

    public void setSellerddress(String sellerddress) {
        this.sellerddress = sellerddress == null ? null : sellerddress.trim();
    }

    public String getSellerphone() {
        return sellerphone;
    }

    public void setSellerphone(String sellerphone) {
        this.sellerphone = sellerphone == null ? null : sellerphone.trim();
    }

    public String getSellerlogo() {
        return sellerlogo;
    }

    public void setSellerlogo(String sellerlogo) {
        this.sellerlogo = sellerlogo == null ? null : sellerlogo.trim();
    }
}