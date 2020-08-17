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
    <title>My JSP 'userMain.jsp' starting page</title>
  </head> 
  <body>
  <center>
  <h2>用户列表</h2>
 
  	<form action="userAction_doFindName" method="post">
		<input type="text" name="name" placeholder="请输入name">
		<button type="submit" ><i>&#xe615;搜索</i></button>
		
			
  </form>
  

  <table border="1" width="50%">
  	<tr>
  		<td>用户ID</td>
  		<td>用户名</td>
  		<td>密码</td>
  		<td>操作</td>
    	<td>操作</td>
  	</tr>
  	<s:iterator value="#all" id="user">
    <tr>
    	<td><a href="userAction_doFind.action?id=<s:property value='#user.id'/>"><s:property value="#user.id"/></a></td>
    	<td><s:property value="#user.name"/></td>
    	<td><s:property value="#user.password"/></td>
    	<td><a href="userAction_doDelete.action?id=<s:property value='#user.id'/>"><button type="button">删除</button></a></td>
    	<td><a href="userAction_initUpdate.action?id=<s:property value='#user.id'/>"><button type="button">更新</button></a></td>
    </tr>
    </s:iterator>
  </table>  
  <br>
    <br>
    <a href="addUser.jsp"><button type="button">添加新用户</button></a>
    &nbsp;&nbsp;
    <a href="main.jsp"><button type="button">返回主页</button></a>
  </center>
    <s:debug></s:debug>
  </body>
</html>
