package com.wxsc.bean;

import java.util.Date;

public class STORE_WARE {
    private String goodsid;

    private Date ordertimestamp;

    private Date arriTimestamp;

    private Integer totalnum;

    private Double totalcost;
    
    
    
    

	@Override
	public String toString() {
		return "STORE_WARE [goodsid=" + goodsid + ", ordertimestamp=" + ordertimestamp + ", arriTimestamp="
				+ arriTimestamp + ", totalnum=" + totalnum + ", totalcost=" + totalcost + "]";
	}

	public String getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public Date getOrdertimestamp() {
		return ordertimestamp;
	}

	public void setOrdertimestamp(Date ordertimestamp) {
		this.ordertimestamp = ordertimestamp;
	}

	public Date getArriTimestamp() {
		return arriTimestamp;
	}

	public void setArriTimestamp(Date arriTimestamp) {
		this.arriTimestamp = arriTimestamp;
	}

	public Integer getTotalnum() {
		return totalnum;
	}

	public void setTotalnum(Integer totalnum) {
		this.totalnum = totalnum;
	}

	public Double getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(Double totalcost) {
		this.totalcost = totalcost;
	}



   
}