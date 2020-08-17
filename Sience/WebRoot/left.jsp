<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
    *{
        padding: 0;
        margin: 0;
    }
    html,body{
        height: 100%;
    }
    .wrap{
        width: 260px;
        height: 100%;
        background-color: #363a45;
    }
    .header{
        width: 100%;
        height: 65px;
        background-color: #44495a;
        font-size: 24px;
        color: #fff;
        text-align: center;
        line-height: 65px;
    }
    .nav{
        width:250px;
        margin: 10px 5px 0;
    }
    .list{
        margin-bottom: 5px;
    }
    .list h2{
        position: relative;
        padding: 15px 0;
        background-color: #3889d4;
        text-align: center;
        font-size: 16px;
        color: #fff;
        transition: .5s;
    }
    .list h2.on{
        background-color: #393c4a;
    }
    .list i{
        position: absolute;
        right: 10px;
        top: 16px;
        border: 8px solid transparent;
        border-left-color: #fff;/*triangle*/
        transform:rotate(0deg);
        transform-origin: 1px 8px;
        transition: .5s;
    }
    .list i.on{
        transform:rotate(90deg);
    }
    .hide{
        overflow: hidden;
        height: 0;
        transition: .5s;
    }
    .hide h5{
        padding: 10px 0;
        background-color: #282c3a;
        text-align: center;
        color:#fff;
        border-bottom:#42495d;
    }
</style>
  </head>
  
  <body>
   <div class="wrap">
        <div class="header">管理平台</div>
        <div class="nav">
            <ul>
                <li class="list">
                    <h2><i></i>用户管理</h2>
                    <div class="hide">
                        <a href="userAction_doFindAll.action" target="view_frame"><h5>用户管理</h5></a>   
                    </div>
                </li>
                <li class="list">
                    <h2><i></i>课题管理</h2>
                    <div class="hide">
                        <a href="shenbaoAction_doFindAll.action" target="view_frame"><h5>申报</h5></a>
                        
                    </div>
                </li>
                <li class="list">
                    <h2><i></i>成果管理</h2>
                    <div class="hide">
                        <a href="chengguoAction_doFindAll.action" target="view_frame"><h5>基本信息</h5></a>
                        
                    </div>
                </li>
                <li class="list">
                    <h2><i></i>指导教师信息管理</h2>
                    <div class="hide">
                        <a href="teacherAction_doFindAll.action" target="view_frame"><h5>教师管理</h5></a>
                         
                    </div>
                </li>
                <li class="list">
                	<h2><i></i>指科研经费</h2>
                    <div class="hide">
                        <a href="qianAction_showComment.action" target="view_frame"><h5>经费审批</h5></a>
                         
                    </div>
                </li>
            </ul>
        </div>
    </div>
    <script>
        (function () {
            var oList = document.querySelectorAll('.list h2'),
                oHide = document.querySelectorAll('.hide'),
                oIcon = document.querySelectorAll('.list i'),
                lastIndex = 0;
            for(var i=0;i<oList.length;i++){
                oList[i].index = i;//自定义属性
                oList[i].isClick = false;
                oList[i].initHeight = oHide[i].clientHeight;
                oHide[i].style.height = '0';
                oList[i].onclick = function () {
                    if(this.isClick){
                        oHide[this.index].style.height = '0';
                        oIcon[this.index].className = '';
                        oList[this.index].className = '';
                        oList[this.index].isClick = false;
                    }
                    else{
                        oHide[lastIndex].style.height = '0';
                        oIcon[lastIndex].className = '';
                        oList[lastIndex].className = '';
                        oHide[this.index].style.height = '220px';
                        oIcon[this.index].className = 'on';
                        oList[this.index].className = 'on';
                        oList[lastIndex].isClick = false;
                        oList[this.index].isClick = true;
                        lastIndex = this.index;
                    }
                }
            }
        })();
    </script>
  </body>
</html>
