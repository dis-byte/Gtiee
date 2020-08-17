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
    <title>My JSP 'addTeacher.jsp' starting page</title>
  </head>
  <body>
   <h2>添加教师</h2>
   <br>
   <s:form action="teacherAction_doAdd">
   		
   		<s:textfield label="姓名" name="teacher.name"></s:textfield>
   		<s:textfield label="性别" name="teacher.gender"></s:textfield>
   		<s:textfield label="职位" name="teacher.position"></s:textfield>  		
   		<s:textfield label="住址" name="teacher.address"></s:textfield>
   		<s:textfield label="电话" name="teacher.tel"></s:textfield>
   		<s:textarea name="teacher.info" cols="14" rows="5" label="简介"></s:textarea>
   		<s:submit value="添加"></s:submit>
   </s:form>
   <a href="teacherAction_doFindAll.action"><button type="button">返回列表</button></a>
</body>
</html>

