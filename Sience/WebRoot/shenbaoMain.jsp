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
    <title>申报</title>
</head> 
<body>
<center>
<h1 >申报项目</h1>
    <form action="shenbaoAction_doFindName" method="post">
		<input type="text" name="name" placeholder="请输入name">
		<button type="submit" ><i>&#xe615;搜索</i></button>
		
			
  </form>   
    	<table cellpadding="0" cellspacing="0" border="1" width="50%">
    		 <tr>
    			<td>项目ID</td>
    			<td>项目名</td>
    			<td>经费</td>
    			<td>操作</td>
    			<td>操作</td>
    		</tr> 
    		<s:iterator value="#all" id="shenbao">
    		<tr>
    			<td><a href="shenbaoAction_doFind.action?id=<s:property value='#shenbao.id'/>"><s:property value="#shenbao.id"/></a></td>
    			<td><s:property value="#shenbao.name"/></td>
    			<td><s:property value="#shenbao.money"/></td>
    			<td><a href="shenbaoAction_doDelete.action?id=<s:property value='#shenbao.id'/>"><button type="button">删除</button></a></td>
    			<td><a href="shenbaoAction_initUpdate.action?id=<s:property value='#shenbao.id'/>"><button type="button">更新</button></a></td>
    		</tr>
    		</s:iterator>
    	</table>
    	<br>
    	<br>
    	<a href="addshenbao.jsp"><button type="button">申报项目</button></a>  
    	&nbsp;&nbsp;
    	<a href="main.jsp"><button type="button">返回主页</button></a>
</center>
</body>
</html>
