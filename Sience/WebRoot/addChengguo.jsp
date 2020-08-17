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
    
    <title>My JSP 'addChengguo.jsp' starting page</title>
  </head>
  
  <body>
     <center>
    <h1>添加成果</h1>
  	<s:form action="chengguoAction_doAdd">
  		<s:textfield 	label="成果名" 	name="chengguo.name"></s:textfield> 		
  		<s:submit value="添加"/>
  	</s:form>
  	<a href="chengguoAction_doFindAll.action"><button type="button">返回列表</button></a>
  	</center>
  </body>
</html>
