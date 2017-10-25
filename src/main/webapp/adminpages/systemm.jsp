<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
<html lang="zh">

<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>管理模块</title>
<link rel="stylesheet" type="text/css" href="css/admin.css">
<script src="http://lib.sinaapp.com/js/jquery/2.0.3/jquery-2.0.3.min.js"></script>
</head>

<body>
	<div class="big">
		<div class="main">
			<div class="top">
				<div class="img">
					<img src="images/logo-blue.png">
				</div>
				
				<div class="exit">
					<a href="index.jsp">退出</a>
				</div>
				<div class="help">
					<a href="#">帮助</a>
				</div>
			</div>
			<div class="top-down">
				<ul>
				<li id="back"><a href="adminpages/memberm.jsp" id="check"><span>会员管理</span></a></li>
				<li id="back"><a href="adminpages/prodect.jsp" id="check"><span>产品管理</span></a></li>
				<li id="back"><a href="adminpages/systemm.jsp" id="check"><span>系统维护</span></a></li>
				<li id="back"><a href="findAdmin" id="check"><span>个人信息</span></a></li>
				</ul>
			</div>
			<div class="content">
			<div class="left">
			

				 <div class="first" id="3rd">
					<div class="first-menu" id="3rd-menu1">系统配置</div>
					<div class="first-menu" id="3rd-menu2">系统恢复</div>
					<div class="first-menu" id="3rd-menu3">消息发布</div>
				</div>


               



			</div>
			<div class="right">
				
			</div>
			   </div>
		</div>
	</div>
	<script src="../js/li.js"></script>
	 <div class="webfoot"><span>版权所有 © 2017 CodeMan.保留所有权</span></div>
</body>

</html>