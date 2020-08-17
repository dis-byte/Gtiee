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
    <title>My JSP 'updateChengguo.jsp' starting page</title>
  </head>
  <body>
   <h1 align="left">修改信息</h1>
   <s:form action="chengguoAction_doUpdate">
   	<s:textfield 	label="成果ID" 	name="chengguo.id" 			value="%{#update.id}"></s:textfield>
   	<s:textfield 	label="成果名" 	name="chengguo.name" 		value="%{#update.name}"></s:textfield>
   	<s:submit value="更新"/>
   </s:form>
   <a href="chengguoAction_doFindAll.action"><button type="button">返回信息列表</button></a>
  </body>
</html>
