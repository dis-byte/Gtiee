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
    <title>修改界面</title>
  </head>
   <body>
   <h1 align="left">修改项目信息</h1>
   <s:form action="shenbaoAction_doUpdate">
   	<s:textfield 	label="项目ID" 	name="shenbao.id" 			value="%{#update.id}"></s:textfield>
   	<s:textfield 	label="项目名" 	name="shenbao.name" 		value="%{#update.name}"></s:textfield>
   	<s:textfield 	label="项目经费" 	name="shenbao.money" 		value="%{#update.money}"></s:textfield>
   	<s:submit value="更新"/>
   </s:form>
   <a href="shenbaoAction_doFindAll.action"><button type="button">返回信息列表</button></a>
  </body>
</html>
