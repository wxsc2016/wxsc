function test1(){
console.log("js方法进入成功");
var goodsid=document.getElementById("goodsid").innerHTML;
 //url="./test?goodsid="+goodsid;
 url="localhost:8080/wxsc/test?goodsid="+goodsid;

console.log("url="+url);
 $.ajax({
	 url :url,
	 type:"get",
	// data: 
	 dataType:"String",
	 success:function(data){
		 console.log("seccess中data已获取");
		// console.log(${pageContext.request.contextPath});
		 $("#view").html(data)
	 },
 error:function(data){ console.log("data获取失败");}
 });
	
	
	
}

/*
function test1(){
    	var x=document.getElementById("goodsid");
    	alert(x.innerHTML);
    }*/