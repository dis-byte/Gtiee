<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>My JSP 'showUser.jsp' starting page</title>
  </head>
  
  <body>
    	<h2>按ID号查看用户信息</h2>
    <table border="1">
    		<s:set name="user" value="#u"></s:set>
    		<tr>
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
    	<a href="userAction_doFindAll.action"><button type="button">返回用户列表</button></a> 
  </body>
</html>
