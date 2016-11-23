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
 * �û�����Ľ���
 * 
 * */
public class GoodsController {
	@Autowired
	private ShowGoodsServiceI showGoodsService;
	/**
	 * �õ�����Ӧ�������ǰ�˷��;�����������*/
	@RequestMapping(value="/GetType")
	public String  postResult(@RequestParam("typeID")String typeID ){
		
		List<GOODS_INFO> list=showGoodsService.showAll(typeID);
	System.out.println("-------���ڴ�ӡtypeID="+typeID+"������Ʒ");
	  Gson gson=new Gson();
	  String result=gson.toJson(list);
	  System.out.println("--------json ���"+result);
	  return result;
		
	}      
	/**
	 * �õ������id����ǰ�˷�����Ӧid����Ʒ��Ϣ����۸���������Ʒ����ϸ���ܣ����۵�*/
	@RequestMapping(value="/getDescription")
	public String postDetail(@RequestParam("goodsid") String goodsid){
		String good_dec=showGoodsService.getDescription(goodsid);
		System.out.println("-------���ڴ�ӡgoodsid="+goodsid+"������Ʒ");
	
		  System.out.println("--------json ���"+good_dec);
		  
		return good_dec;
	}
	
	
}