package com.wxsc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.wxsc.bean.GOODS_INFO;
import com.wxsc.service.ShowGoodsServiceI;

@Controller
@RequestMapping("/goods")
/***
 * 用户进入的界面
 * 
 * */
public class GoodsController {
	@Autowired
	private ShowGoodsServiceI showGoodsService;
	/**
	 * 得到了相应的类别，向前端发送具体的类别内容*/
	@RequestMapping(value="/GetType")
	public String  postResult(@RequestParam("typeID")String typeID ){
		
		List<GOODS_INFO> list=showGoodsService.showAll(typeID);
	System.out.println("-------正在打印typeID="+typeID+"类别的商品");
	  Gson gson=new Gson();
	  String result=gson.toJson(list);
	  System.out.println("--------json 结果"+result);
	  return result;
		
	}      
	/**
	 * 得到具体的id，向前端发送相应id的商品信息，如价格重量，商品的详细介绍，评论等*/
	@RequestMapping(value="/getDescription")
	public String postDetail(@RequestParam("goodsid") String goodsid){
		String good_dec=showGoodsService.getDescription(goodsid);
		System.out.println("-------正在打印goodsid="+goodsid+"类别的商品");
	
		  System.out.println("--------json 结果"+good_dec);
		  
		return good_dec;
	}
	
	
}