package com.wxsc.service;

import java.util.List;

import com.wxsc.bean.GOODS_COMMENT;
import com.wxsc.bean.GOODS_INFO;
import com.wxsc.bean.GOODS_INTRODUCE;

public interface ShowGoodsServiceI {
	/**
	 * 取出某一类的所有的商品
	 */
	public List<GOODS_INFO> showAll(String goodsClass);

	/**
	 * 取出商品的分类
	 */
	public String getGoodsClass();
	/**得道商品的图片等详细信息*/
	public String getDescription(String goodsid);

}
