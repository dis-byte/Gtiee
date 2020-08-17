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
    <title>My JSP 'showChengguo.jsp' starting page</title>
  </head>  
  <body>
   <h1>按ID号查看成果</h1>
    <table border="1">
    		<s:set name="chengguo" value="#c"></s:set>
    		<tr>
    			<td>ID</td>
    			<td>成果名</td>
    			
    		</tr>
    		<tr>
    			<td><s:property value="#chengguo.id"/></td>
    			<td><s:property value="#chengguo.name"/></td>
    		</tr>  		
    	</table>
    	<a href="chengguoAction_doFindAll.action"><button type="button">返回列表</button></a>
  </body>
</html>
