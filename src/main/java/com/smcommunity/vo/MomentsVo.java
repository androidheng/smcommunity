package com.smcommunity.vo;

import com.smcommunity.pojo.TbMoments;

public class MomentsVo extends TbMoments{
	 private String nickname;
	 private String headlogo;
	 private String goodsimage;
	 private String goodsname;
	 private String goodsdescribe;
	 private int type=0;
	 private int goodsid;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getHeadlogo() {
		return headlogo;
	}
	public void setHeadlogo(String headlogo) {
		this.headlogo = headlogo;
	}
	public String getGoodsimage() {
		return goodsimage;
	}
	public void setGoodsimage(String goodsimage) {
		this.goodsimage = goodsimage;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getGoodsdescribe() {
		return goodsdescribe;
	}
	public void setGoodsdescribe(String goodsdescribe) {
		this.goodsdescribe = goodsdescribe;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	  
}
