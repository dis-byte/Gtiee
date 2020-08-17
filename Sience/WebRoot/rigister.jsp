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
    <title>注册</title>
<style> 
   body{
		background-color: #f2f4f7;	
	}	
	table{	
		margin: auto;/*内容居中*/
		margin-top:100px;
		text-align: center;
		height:29%;
		width:25%;
		background-color: #ffffff;
		border-radius: 4px;
		box-shadow: 0 0 5px;
	}
	a{
		text-decoration:none;
	}
</style>
  </head>
  <body>  
   <s:form action="userAction_rigister">
   <table>
  <tr>
    	<td>
    	<s:textfield name="user.name" label="用户名"></s:textfield>
    	</td>
    </tr>
    <tr>
    	<td>
    	<s:password name="user.password" label="密码"></s:password>
    	</td>
    </tr>
   <tr>
   	<td>
   		<s:submit value="注册" theme="simple"></s:submit>		
   	</td> 
   </tr>
   </table> 
   </s:form>
  </body>
</html>
