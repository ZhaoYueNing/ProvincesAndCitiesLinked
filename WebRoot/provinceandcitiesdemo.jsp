<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>省市联动</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="./js/getXmlHttp.js"></script>
	<script type="text/javascript">
		function updateProvinces(xml){
			console.log(xml);
			var province = document.getElementById("province");
			var ps = xml.getElementsByTagName("province");
			for(var i=0;i<ps.length;i++){
				var pname = ps[i].getElementsByTagName("name")[0].firstChild.nodeValue;
				province.innerHTML+="<option value="+pname+">"+pname+"</option>"
			}
		}
		function updateCities(xml){
			city.innerHTML="";
			if(xml==null){
				return;
			}
			var pv = province.value;
			var ps = xml.getElementsByTagName("province");
			for(var i=0;i<ps.length;i++){
				var pname = ps[i].getElementsByTagName("name")[0].firstChild.nodeValue;
				if(pname==pv){
					var cities = ps[i].getElementsByTagName("city");
					for(var j=0;j<cities.length;j++){
						var cname = cities[j].getElementsByTagName("name")[0].firstChild.nodeValue;
						city.innerHTML+="<option value="+cname+">"+cname+"</option>"
					}
					return ;
				}
				
			}
			city.innerHTML="<option>请选择城市</option>";
		}
	</script>
  </head>
  
  <body>
    省份:
    <select id="province" onchange="updateCities(xml)">
    	<option>请选择省份</option>
    </select> <br>
    城市:
    <select id="city">
    	<option>请选择城市</option>
    </select>
  </body>
  <script type="text/javascript">
  	var xmlhttp = getXmlHttpObject();
  	var xml = null;
  	var province = documen.getElementById("province"); 
  	var city = document.getElementById("city");
  	if(!xmlhttp){
  		console.log("buzhici"); 
  		alert("您的浏览器不支持XMLHTTP");
  	}else{
  		xmlhttp.onreadystatechange=function(){
  			console.log(xmlhttp.status+" "+xmlhttp.readyState);
	  		if(xmlhttp.status==200&&xmlhttp.readyState==4){
	  			console.log("chenggong");
	  			xml = xmlhttp.responseXML;
	  			console.log(xml);
	  			updateProvinces(xml);
	  		}
  		}
  		xmlhttp.open("GET", "/ProvincesAndCitiesLinked/getprovincesandcities.do",true);
  		xmlhttp.send(null);
  	}
  </script>
</html>
