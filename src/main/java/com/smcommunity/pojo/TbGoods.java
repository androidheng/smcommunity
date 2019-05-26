package com.smcommunity.pojo;

public class TbGoods {
    private Integer id;

    private String goodsname;

    private String goodsdescribe;

    private Integer sellerid;

    private Integer goodstype;

    private Integer display;

    private String goodsimage;

    private Integer tid;

    private String tname;

    private String wid;

    private Integer isall;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsdescribe() {
        return goodsdescribe;
    }

    public void setGoodsdescribe(String goodsdescribe) {
        this.goodsdescribe = goodsdescribe == null ? null : goodsdescribe.trim();
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public Integer getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Integer goodstype) {
        this.goodstype = goodstype;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public String getGoodsimage() {
        return goodsimage;
    }

    public void setGoodsimage(String goodsimage) {
        this.goodsimage = goodsimage == null ? null : goodsimage.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public Integer getIsall() {
        return isall;
    }

    public void setIsall(Integer isall) {
        this.isall = isall;
    }
}