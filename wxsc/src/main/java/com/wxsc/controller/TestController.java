package com.wxsc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.wxsc.bean.GOODS_INFO;
import com.wxsc.service.ShowGoodsServiceI;

@Controller
@RequestMapping("/test/*")
public class TestController {
	@Autowired
	private ShowGoodsServiceI showGoodsService;
    //,method={RequestMethod.GET,RequestMethod.POST}
	@RequestMapping(value="/testmynew")
	public String initmytest()
	{return "test";}//容器会去路径下寻找test.html文件
	
/**	路径为localhost：8080/wxsc/test/testjson?goods_id=
*/	
	@RequestMapping(value="/testjson")
    public @ResponseBody  String test(@RequestParam("goodsid")
                         String classid ) {
   	
   	List<GOODS_INFO> list=showGoodsService.showAll(classid);   	
   Gson gson=new Gson();
   String result=gson.toJson(list);
   
   	System.out.println("json 结果"+result);
   	return result;
   	// return list;
    }
}