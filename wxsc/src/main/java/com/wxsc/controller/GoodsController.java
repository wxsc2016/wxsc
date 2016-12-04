package com.wxsc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.wxsc.bean.GOODS_INFO;
import com.wxsc.service.ShowGoodsServiceI;

@Controller
//@RequestMapping("/goods")
/***
 * 用户进入的界面
 * 
 * */
public class GoodsController {
	@Autowired
	private ShowGoodsServiceI showGoodsService;
	/**
	 * 得到了相应的类别，向前端发送具体的类别内容*/
	@RequestMapping(value="/GetType")//项目名称下，进入此方法的路径，可携带参数@RequestParam()
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
	public @ResponseBody String postDetail(@RequestParam("goodsid") String goodsid){
		//@ResponseBody可直接返回json，以便页面接收
		String good_dec=showGoodsService.getDescription(goodsid);
		System.out.println("-------正在打印goodsid="+goodsid+"此商品所有信息");	
		System.out.println(good_dec);
		  
		return good_dec;
	}
	
	
}