package com.wxsc.util;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.test.context.ContextConfiguration;

/**   
* @Title: SessionUtil.java 
* @Package com.teradata.util 
* @Description: session操作工具类
* @date 2016年7月8日 下午3:59:13 
* @version V1.0   
*/
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class ServletUtil extends HttpServlet
{
/**
 * 
 * 获得session
 * @return 
 * */
	
	public  void doGet(HttpServletRequest request,HttpServletResponse response)
	{
	
		
		
	}
	public  void doPost(HttpServletRequest request,HttpServletResponse response)
	{
	
		
		
	}  


		
		

	
	
	
	
	
	
/*	public static void setAttribute(String key,Object value){
		getSession(request,response)
		
	}
	*/
	
	
	
	
	/*
	*//**
	 * @param key 键
	 * @param value 存进session的值
	 *//*
	
	

	public static  void setAttribute(String key,Object value)
	{
		ServletActionContext.getRequest().getSession().setAttribute(key, value);;
	}
	*//**根据键获取session对应值
	 * @param key
	 *//*
	public static  Object getAttribute(String key)
	{
		return ServletActionContext.getRequest().getSession().getAttribute(key);
	}
	*//**
	 * @param key
	 * @return request中参数
	 *//*
	public static String getRequestParam(String key){
		return ServletActionContext.getRequest().getParameter(key);
	 }*/
}
