<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'searcingResult.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>

  		<table border="1">
    		<s:set name="user" value="#ua"></s:set>
    		<tr >
    			<td>用户ID</td>
    			<td>用户名</td>
    			<td>用户密码</td>
    		</tr>
    		<tr>
    			<td><s:property value="#user.id"/></td>
    			<td><s:property value="#user.name"/></td>
    			<td><s:property value="#user.password"/></td>
    		</tr>   		
    	</table>
  </body>
</html>
