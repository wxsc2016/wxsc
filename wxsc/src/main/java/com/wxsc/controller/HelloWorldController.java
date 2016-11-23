package com.wxsc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.wxsc.service.ShowGoodsServiceI;
@Controller
public class HelloWorldController {  
	//@Autowired
	//private ShowGoodsServiceI showGoodsService;
	
       
        @RequestMapping(value="/testHtml")
        public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {       	
        	 //showGoodsService.showAll("12");
            //1、收集参数、验证参数  
            //2、绑定参数到命令对象  
            //3、将命令对象传入业务对象进行业务处理  
            //4、选择下一个页面  
            ModelAndView mv = new ModelAndView();  
            //添加模型数据 可以是任意的POJO对象  
            mv.addObject("message", "你好 World!");  
            //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
            mv.setViewName("g_content");  
          System.out.println("进入helloworld");
            return mv;  
        }

		 
    } 