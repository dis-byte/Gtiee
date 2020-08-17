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
    <title>My JSP 'showTeacher.jsp' starting page</title>
  </head>
  <body>
    <h2>按照id查看信息</h2>
    <br>
    <table border="1">
    	<s:set name="teacher" value="#t"></s:set>
    	<tr>
    		<td>id</td>
    		<td>姓名</td>
    		<td>性别</td>
    		<td>职位</td>
    		<td>住址</td>
    		<td>电话</td>
    		<td>简介</td>
    	</tr>
    	<tr>
    		<td><s:property value="#teacher.id"/></td>
    		<td><s:property value="#teacher.name"/></td>
    		<td><s:property value="#teacher.gender"/></td>
    		<td><s:property value="#teacher.position"/></td>
    		<td><s:property value="#teacher.address"/></td>
    		<td><s:property value="#teacher.tel"/></td>
    		<td><s:property value="#teacher.info"/></td>
    	</tr>
    </table>
    <a href="teacherAction_doFindAll.action"><button type="button">返回列表</button></a>
  </body>
</html>
