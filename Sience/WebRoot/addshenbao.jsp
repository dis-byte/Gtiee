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
    <title>添加项目</title>
  </head>  
  <body>
  <center>
    <h1>添加项目</h1>
  	<s:form action="shenbaoAction_doAdd">
  		<s:textfield 	label="项目名" 	name="shenbao.name"></s:textfield>
  		<s:textfield 	label="项目经费" 		name="shenbao.money"></s:textfield>
  		<s:submit value="添加"/>
  	</s:form>
  	<a href="shenbaoAction_doFindAll.action"><button type="button">返回项目列表</button></a>
  	</center>
  	
  </body>
</html>
