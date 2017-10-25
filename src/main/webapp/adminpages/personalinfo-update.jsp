<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>

<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
						<span class="webinfospan">个人信息>个人信息修改</span>
					</div>

					<div class="memberadd-content">
						<form name="editAdminForm" method="post" action="editAdmin">
							<div>
								<span>请选择修改<span class="red">管理员</span>以下信息(<span
									style="color: red">*</span><span>不可修改)：</span>
								</span>
							</div>
							<div class="addbox">
								<span>姓名:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.name"
									value="${userModel.name}" disabled><span
									style="color: red">*</span>
							</div>
							<div class="addbox">
								<span>邮箱:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.email"
									value="${userModel.email}" disabled><span
									style="color: red">*</span>
							</div>
							<div class="addbox">
								<span>证件:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.IDcard"
									value="${userModel.IDcard}">
							</div>
							<div class="addbox">
								<span>电话:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.phonenumber"
									value="${userModel.phonenumber}">
							</div>
							<input class="addbutton" type="submit" name="submit" value="保存">
							<input class="resetbutton" type="button" name="return" value="返回"
								onclick="javascript:history.back(-1);">
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
	<div class="webfoot">
		<span>版权所有 © 2017 CodeMan.保留所有权</span>
	</div>
</body>

</html>