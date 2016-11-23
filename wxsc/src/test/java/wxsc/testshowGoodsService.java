package wxsc;

import java.util.Date;
import java.util.List;
import java.util.UUID;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.wxsc.bean.GOODS_INFO;
import com.wxsc.bean.GOODS_INTRODUCE;
import com.wxsc.service.ShowGoodsServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class testshowGoodsService{

    //注入userService
    @Autowired
    private ShowGoodsServiceI userService;
    
    @Test
    public void testAddUser(){
    /*	GOODS_INFO info = new GOODS_INFO();
    	info.setGoodsid("12356");
    	info.setGoodsclass("12");
    	info.setGoodsname("154365");
    	info.setGoodsprice(12.21);
    	//userService.showComment("12");
    	List<GOODS_INFO> list=userService.showAll("蔬菜");
      	System.out.println("正在打印结果");
    	Gson gson=new Gson();
    	String result=gson.toJson(list);
    	System.out.println("json 结果"+result);
    	//获取商品介绍   	
    	String intro=gson.toJson(userService.showIntroduce("12"));
    	System.out.println("intro-json 结果"+intro);
    	//h获取商品评论
    	String comment=gson.toJson(userService.showComment("12"));
    	System.out.println("comment-json 结果"+comment);

    	*/
    	String goodsid="12";
    	userService.getDescription(goodsid);
    	
        
    }
    
    @Test
    public void testGetUserById(){
   
    }
}