function description(){
console.log("js方法进入成功");
var goodsid=document.getElementById("goodsid2").innerHTML;
// url="./getDescription?goodsid="+goodsid;
 url="http://localhost:8080/wxsc/getDescription?goodsid="+goodsid;
console.log("url="+url);
 $.ajax({
	 url :url,
	 type:"get",
	 dataType:"json",
	 success:function(data){
		 console.log("后台返回的data已获取");
		 console.log(data);		
		 var result=eval(data);
		 $.each(result, function (index, item) {  
             //循环获取数据    
             var name = result[index].goodsname;  
             var goods_price = result[index].goodsprice;  
             var goods_class = result[index].goodsclass;  
             $("#myresult").html($("#myresult").html() + "<br>" + name + " - " + goods_price + " - " + goods_class + "<br/>");  
         }); 
		 
	 },
 error:function(data){ console.log("data获取失败");}
 });
	
	
	
}

/*
function test1(){
    	var x=document.getElementById("goodsid");
    	alert(x.innerHTML);
    }*/