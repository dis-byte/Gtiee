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
    <title>My JSP 'updateTeacher.jsp' starting page</title>
  </head>
  <body>
    <h2>修改信息</h2>
    <br>
    <s:form action="teacherAction_doUpdate">
    	<s:textfield lable="id"  name="teacher.id" value="%{#update.id}"></s:textfield>
    	<s:textfield label="姓名" name="teacher.name" value="%{#update.name}"></s:textfield>
   		<s:textfield label="性别" name="teacher.gender" value="%{#update.gender}"></s:textfield>
   		<s:textfield label="职位" name="teacher.position" value="%{#update.position}"></s:textfield>   		
   		<s:textfield label="住址" name="teacher.address" value="%{#update.address}"></s:textfield>
   		<s:textfield label="电话" name="teacher.tel" value="%{#update.tel}"></s:textfield>
   		<s:textarea label="简介" cols="14" rows="5" name="teacher.info" value="%{#update.info}"></s:textarea>  
   		<s:submit value="更新"/>  
    </s:form>
    <a href="teacherAction_doFindAll.action"><button type="button">返回列表</button></a>
  </body>
</html>
