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
					<a href="../index.jsp">退出</a>
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
					<div class="first" id="4th">
						<div class="first-menu" id="3rd-menu2"
							onclick="window.location.href='infoAdmin';">个人信息修改</div>
						<div class="first-menu" id="3rd-menu2"
							onclick="window.location.href='adminpages/password-update.jsp';">个人密码修改</div>
					</div>
				</div>
				<div class="right">
					<div class="positioninfo" id="positioninfo">
						<span class="webinfospan">个人信息</span>
					</div>

					<table class="ruseltable">
						<thead>
							<tr>
								<td>注册ID</td>
								<td>姓名</td>
								<td>邮箱</td>
								<td>身份证号</td>
								<td>电话</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="tableinfobox">${userModel.id}</td>
								<td class="tableinfobox">${userModel.name}</td>
								<td class="tableinfobox">${userModel.email}</td>
								<td class="tableinfobox">${userModel.IDcard}</td>
								<td class="tableinfobox">${userModel.phonenumber}</td>
							</tr>
						</tbody>

					</table>

				</div>
			</div>
		</div>
	</div>
	<script src="../js/li.js"></script>

</body>

</html>