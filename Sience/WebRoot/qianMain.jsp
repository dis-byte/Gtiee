<%@ page language="java" import="java.util.*,cdnkxy.com.bean.PageBean" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <base href="<%=basePath%>">
    
    <title>My JSP 'qianMain.jsp' starting page</title>
  </head>
  
  <body>
      <h2>经费列表</h2>
      <form action="qianAction_doFindName" method="post">
		<input type="text" name="name" placeholder="请输入name">
		<button type="submit" ><i>&#xe615;搜索</i></button>
		
			
  </form>
  <table border="1" width="50%">
  	<tr>
  		<td>经费ID</td>
  		<td>经费名</td>
  		<td>金额</td>
  		<td>操作</td>
    	<td>操作</td>
  	</tr>
  	<s:iterator value="#request.qian" id="qian">
    <tr>
    	<td><a href="qianAction_doFind.action?id=<s:property value='#qian.id'/>"><s:property value="#qian.id"/></a></td>
    	<td><s:property value="#qian.name"/></td>
    	<td><s:property value="#qian.money"/></td>
    	<td><a href="qianAction_doDelete.action?id=<s:property value='#qian.id'/>"><button type="button">删除</button></a></td>
    	<td><a href="qianAction_initUpdate.action?id=<s:property value='#qian.id'/>"><button type="button">更新</button></a></td>
    </tr>
    </s:iterator>
  </table>  
  <br>
    <br>
    <a href="addQian.jsp"><button type="button">添加新用户</button></a>
    &nbsp;&nbsp;
    <a href="main.jsp"><button type="button">返回主页</button></a>
<br>
<br>
             
<div class="pagination" style="text-align: center;">
    <ul><%  PageBean pagebean = (PageBean)request.getAttribute("page");
            int totalPage = pagebean.getTotalPage();    //总页数
            int currentPage = pagebean.getCurrentPage();    //当前页
            //如果是第一页
            if(pagebean.isFirstPage()){
                for(int i=0; i<totalPage; i++){                             
        %>
        <li><a href="qianAction_showComment.action?currentPage=<%=i+1 %>"><%=i+1 %></a></li>                       
        <%}%>
        <li><a href="qianAction_showComment.action?currentPage=<%=currentPage+1%>">&raquo;</a></li>
        <%}
            //如果是最后一页
            if(pagebean.isLastPage()){
        %>
        <li><a href="qianAction_showComment.action?currentPage=<%=currentPage-1%>">&laquo;</a></li>        
        <% 
            for(int i=0; i<totalPage; i++){                             
        %>
        <li><a href="qianAction_showComment.action?currentPage=<%=i+1 %>"><%=i+1 %></a></li>                       
        <% }}
            //如果不是
            if(!pagebean.isLastPage() && !pagebean.isFirstPage()){
        %>
        <li><a href="qianAction_showComment.action?currentPage=<%=currentPage-1%>">&laquo;</a></li>
        <%  
            for(int i=0; i<totalPage; i++){     
        %>
        <li><a href="qianAction_showComment.action?currentPage=<%=i+1 %>"><%=i+1 %></a></li>                       
        <%}%>
        <li><a href="qianAction_showComment.action?currentPage=<%=currentPage+1%>">&raquo;</a></li>
        <%}%>
    </ul>                       
</div>

  </body>
</html>
