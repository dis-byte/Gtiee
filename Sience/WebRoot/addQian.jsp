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
    
    <title>My JSP 'addQian.jsp' starting page</title>
  </head>
  
  <body>
    <h2>添加经费</h2>
  	<s:form action="qianAction_doAdd">
  		<s:textfield 	label="经费名字" 	name="qian.name"></s:textfield>
  		<s:password 	label="金额" 		name="qian.money"></s:password>
  		<s:submit value="添加"/>
  	</s:form>
  	<a href="qianAction_doFindAll.action"><button type="button">返回用户列表</button></a>
  </body>
</html>
