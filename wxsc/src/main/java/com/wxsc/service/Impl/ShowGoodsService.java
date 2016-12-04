package com.wxsc.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.wxsc.bean.GOODS_COMMENT;
import com.wxsc.bean.GOODS_INFO;
import com.wxsc.bean.GOODS_INTRODUCE;
import com.wxsc.dao.GOODS_COMMENTMapper;
import com.wxsc.dao.GOODS_INFOMapper;
import com.wxsc.dao.GOODS_INTRODUCEMapper;
import com.wxsc.service.ShowGoodsServiceI;
@Service("showGoodsService")
public class ShowGoodsService implements ShowGoodsServiceI {

	@Autowired
	 private GOODS_INFOMapper goods_infoMapper;
	@Autowired
	private GOODS_COMMENTMapper  goods_commentMapper;
	@Autowired
	private GOODS_INTRODUCEMapper goods_introduceMapper;
	@Override
	public List<GOODS_INFO> showAll(String goodsClass) {		
		 List<GOODS_INFO> list = goods_infoMapper.selectAllByClass(goodsClass);		 	
		  return list ;
	}


	@Override
	public String getGoodsClass() {
		// TODO Auto-generated method stub
		return null;
	}
/*	*拿到商品价格，单位等信息
*/	
	@Override
	public String getDescription(String goodsId){
		   Gson gson=new Gson();
		  //得到商品的基础信息
		 String  info=gson.toJson(goods_infoMapper.selectByPrimaryKey(goodsId));		
		 String gi=gson.toJson(goods_introduceMapper.getIntroduceById(goodsId));			 	
		 GOODS_INTRODUCE gd=goods_introduceMapper.getIntroduceById(goodsId);
	
		
		  //得到商品的评论		  	  
		  String  gc=gson.toJson(goods_commentMapper.getCommentById(goodsId));			
		  
		  //得到商品的介绍
		  
		  

		
	    String description="{\"good_info\":"+info 
	    		            +",\"introduce\":"+gi
	    		            +",\"comment\":"+gc+"}";
	
		return description;
		
	}

}
