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
    
    <title>My JSP 'chengguoMain.jsp' starting page</title>
  </head>  
  <body>
  <center>
   <h1>成果管理</h1>   
    	<form action="chengguoAction_doFindName" method="post">
		<input type="text" name="name" placeholder="请输入name">
		<button type="submit" ><i>&#xe615;搜索</i></button>
		
			
  </form>
  
    	<table border="1" width="50%">
    		 <tr>
    			<td>成果ID</td>
    			<td>成果名</td>
    			<td>操作</td>
    			<td>操作</td>
    		</tr> 
    		<s:iterator value="#all" id="chengguo">
    		<tr>
    			<td><a href="chengguoAction_doFind.action?id=<s:property value='#chengguo.id'/>"><s:property value="#chengguo.id"/></a></td>
    			<td><s:property value="#chengguo.name"/></td>	
    			<td><a href="chengguoAction_doDelete.action?id=<s:property value='#chengguo.id'/>"><button type="button">删除</button></a></td>
    			<td><a href="chengguoAction_initUpdate.action?id=<s:property value='#chengguo.id'/>"><button type="button">更新</button></a></td>
    		</tr>
    		</s:iterator>
    	</table>
    	<br>
    	<br>
    	<a href="addChengguo.jsp"><button type="button">添加成果</button></a>  
    	&nbsp;&nbsp;
    	<a href="main.jsp"><button type="button">返回主页</button></a>
</center>
  </body>
</html>
