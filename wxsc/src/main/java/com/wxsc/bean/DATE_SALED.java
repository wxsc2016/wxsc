package com.wxsc.bean;

public class DATE_SALED {
    private String goodsid;

    private String saleddate;

    private Integer saledquantity;

    private Double saledprice;

    public String getGoodsid() {
        return goodsid;
    }

    
    
    @Override
	public String toString() {
		return "DATE_SALED [goodsid=" + goodsid + ", saleddate=" + saleddate + ", saledquantity=" + saledquantity
				+ ", saledprice=" + saledprice + "]";
	}



	public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getSaleddate() {
        return saleddate;
    }

    public void setSaleddate(String saleddate) {
        this.saleddate = saleddate == null ? null : saleddate.trim();
    }

    public Integer getSaledquantity() {
        return saledquantity;
    }

    public void setSaledquantity(Integer saledquantity) {
        this.saledquantity = saledquantity;
    }

    public Double getSaledprice() {
        return saledprice;
    }

    public void setSaledprice(Double saledprice) {
        this.saledprice = saledprice;
    }
}