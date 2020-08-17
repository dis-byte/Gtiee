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
    
    <title>My JSP 'updateQian.jsp' starting page</title>
  </head>
  
  <body>
    <h2>修改信息</h2>
   <s:form action="qianAction_doUpdate">
   	<s:textfield 	label="经费ID" 	name="qian.id" 			value="%{#update.id}"></s:textfield>
   	<s:textfield 	label="经费名" 	name="qian.name" 	value="%{#update.name}"></s:textfield>
   	<s:password 	label="金额" 	name="qian.money" 	value="%{#update.money}"></s:password>
   	<s:submit value="更新"/>
   </s:form>
   <a href="qianAction_doFindAll.action"><button type="button">返回用户列表</button></a>
  </body>
</html>
