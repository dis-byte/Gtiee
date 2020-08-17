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
    <title>My JSP 'teacherMain.jsp' starting page</title>
  </head> 
  <body>
  <h2>指导老师管理</h2>
   	<form action="teacherAction_doFindName" method="post">
		<input type="text" name="name" placeholder="请输入name">
		<button type="submit" ><i>&#xe615;搜索</i></button>
		
			
  </form>
  <br>
    <table  border="1" width="50%">
    		 <tr>
    			<td>教师ID</td>
    			<td>教师名</td>
    			<td>性别</td>
    			<td>职位</td>
    			<td>住址</td>
    			<td>电话</td>		
    			<td>简介</td>
    			<td>操作</td>
    			<td>操作</td>
    		</tr> 
    		<s:iterator value="#all" id="teacher">
    		<tr>
    			<td><a href="teacherAction_doFind.action?id=<s:property value='#teacher.id'/>"><s:property value="#teacher.id"/></a></td>
    			<td><s:property value="#teacher.name"/></td>
    			<td><s:property value="#teacher.gender"/></td>
    			<td><s:property value="#teacher.position"/></td>	
    			<td><s:property value="#teacher.address"/></td>
    			<td><s:property value="#teacher.tel"/></td>
    			<td><s:property value="#teacher.info"/></td>
    			<td><a href="teacherAction_doDelete.action?id=<s:property value='#teacher.id'/>"><button type="button">删除</button></a></td>
    			<td><a href="teacherAction_initUpdate.action?id=<s:property value='#teacher.id'/>"><button type="button">更新</button></a></td>
    		</tr>
    		</s:iterator>
    	</table>
    	<br>
    	<br>
    	<a href="addTeacher.jsp"><button type="button">添加教师信息</button></a>  
    	&nbsp;&nbsp;
    	<a href="main.jsp"><button type="button">返回主页</button></a>
  </body>
</html>
