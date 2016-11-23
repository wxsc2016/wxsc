package com.wxsc.bean;

public class GOODS_INFO {
    private String goodsid;

    private String goodsname;

    private Double goodsprice;

    private String goodsclass;
    private Double  goodsweight;

    public Double getGoodsweight() {
		return goodsweight;
	}

	public void setGoodsweight(Double goodsweight) {
		this.goodsweight = goodsweight;
	}

	public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodsclass() {
        return goodsclass;
    }

    public void setGoodsclass(String goodsclass) {
        this.goodsclass = goodsclass == null ? null : goodsclass.trim();
    }
}