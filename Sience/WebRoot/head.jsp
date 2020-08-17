<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'head.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	
    body{
    	background-color: #3889d4;	
    }
    h1	{
    	width:544px;
    	height:16px;
    	margin:auto;
    	margin-left:26px;
    	color:	#fff ;	
    	
    }
  
 .div{
 	width:100px;
 	height:16px;
 	float:  right;
 	color:#000000;
 }
 a{
 	text-decoration:none;
 	font-color:#E0E0E0 ;
 }
</style>
  </head>
  
  <body>

  <div class="div">
	    	<a href="login.jsp" target="_parent">【退出】</a>
		</div>
<div  style="width: 543px; height: 28px">
<p><h1 style="height: 45px; "> 成都农业科技职业学院科研管理平台</h1> </p>

</div>
		
  </body>
</html>
