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
    
    <title>My JSP 'showQian.jsp' starting page</title>
  </head>
  
  <body>
   <h2>按ID号查看信息</h2>
    	<table border="1">
    		<s:set name="qian" value="#q"></s:set>
    		<tr>
    			<td>用户ID</td>
    			<td>用户名</td>
    			<td>用户密码</td>
    			
    		</tr>
    		
    		<tr>
    			<td><s:property value="#qian.id"/></td>
    			<td><s:property value="#qian.money"/></td>
    			<td><s:property value="#qian.name"/></td>
    		</tr>
    		
    	</table>
    	<a href="qianAction_doFindAll.action"><button type="button">返回用户列表</button></a> 
  </body>
</html>
