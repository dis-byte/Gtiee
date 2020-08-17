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

  		 <table>
    		<s:set name="chengguo" value="#ch"></s:set>
    		<tr>
    			<td>用户ID</td>
    			<td>成果名</td>
    			
    		</tr>
    		<tr>
    			<td><s:property value="#chengguo.id"/></td>
    			<td><s:property value="#chengguo.name"/></td>
    		</tr>  		
    	</table>
    	<a href="chengguoAction_doFindAll.action"><button type="button">返回列表</button></a>
  </body>
</html>
