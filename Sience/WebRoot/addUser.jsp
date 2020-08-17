<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <title>My JSP 'regist.jsp' starting page</title> 
  </head>
  <body>
  	<h2>添加用户</h2>
  	<s:form action="userAction_doAdd">
  		<s:textfield 	label="用户名" 	name="user.name"></s:textfield>
  		<s:password 	label="密码" 		name="user.password"></s:password>
  		<s:submit value="添加"/>
  	</s:form>
  	<a href="userAction_doFindAll.action"><button type="button">返回用户列表</button></a>
  </body>
</html>
