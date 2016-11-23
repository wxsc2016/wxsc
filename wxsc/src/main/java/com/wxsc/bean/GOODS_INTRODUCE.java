package com.wxsc.bean;

public class GOODS_INTRODUCE {
    private String goodsid;

    private String introduce;

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }
     /***
      * 得到商品的介绍部分*/
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}