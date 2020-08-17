<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'update.jsp' starting page</title>    
  </head>
  <body>
   <h2>修改用户信息</h2>
   <s:form action="userAction_doUpdate">
   	<s:textfield 	label="用户ID" 	name="user.id" 			value="%{#update.id}"></s:textfield>
   	<s:textfield 	label="用户名" 	name="user.name" 	value="%{#update.name}"></s:textfield>
   	<s:password 	label="用户密码" 	name="user.password" 	value="%{#update.password}"></s:password>
   	<s:submit value="更新"/>
   </s:form>
   <a href="userAction_doFindAll.action"><button type="button">返回用户列表</button></a>
  </body>
</html>
