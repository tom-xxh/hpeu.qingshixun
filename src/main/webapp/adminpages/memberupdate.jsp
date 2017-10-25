<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh">

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
					<li id="back"><a href="adminpages/prodect.jsp" id="check"><span>产品管理</span></a>
					</li>
					<li id="back"><a href="adminpages/systemm.jsp" id="check"><span>系统维护</span></a></li>
					<li id="back"><a href="findAdmin" id="check"><span>个人信息</span></a></li>
				</ul>
			</div>
			<div class="content">
				<div class="left">
					<div class="first" id="first">
						<div class="first-menu" id="first-menu1"
							onclick="window.location.href='adminpages/memberquery.jsp'">查询会员</div>
						<div class="first-menu" id="first-menu2"
							onclick="window.location.href='adminpages/memberadd.jsp'">添加会员</div>
						<div class="first-menu" id="first-menu5"
							onclick="window.location.href='countUser'">在线人数</div>
					</div>
				</div>
				<div class="right">
					<div class="positioninfo" id="positioninfo">
						<span class="webinfospan">会员管理>修改会员</span>
					</div>
					<div class="memberadd-content">
						<form action="saveUser" method="post"
							onSubmit="return checkUser()">
							<div>
								<span>请选择修改<span class="red">会员</span>以下信息(<span
									style="color: red">*</span><span>不可修改)：</span></span>
							</div>
							<div class="addbox">
								<span>会员姓名:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.name"
									value="${userModel.name}" id="aName" disabled><span
									style="color: red">*</span>
							</div>							
							<div class="addbox">
								<span>会员证件:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.IDcard"
									value="${userModel.IDcard}">
							</div>
							<div class="addbox">
								<span>会员邮箱:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.email"
									value="${userModel.email}" disabled><span
									style="color: red">*</span>
							</div>
							<div class="addbox">
								<span>会员电话:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.phonenumber"
									value="${userModel.phonenumber}">
							</div>
							<div class="addbox">
								<span style="color: red">状态：-1.冻结 0.活跃 1.管理员 </span>
							</div>
							<div class="addbox">
								<span>会员状态:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.state"
									value="${userModel.state}" id="aState">
							</div>
							<input class="addbutton" type="submit" name="submit" value="保存">
							<input class="resetbutton" type="button" name="return" value="返回"
								onclick="window.location.href='adminpages/memberquery.jsp;'">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="webfoot">
		<span>版权所有 © 2017 CodeMan.保留所有权</span>
	</div>
	<script type="text/javascript">
		function checkUser() {
			var aName = document.getElementById("aName").value;
			var aPassword = document.getElementById("aPassword").value;
			var aState = document.getElementById("aState").value;
			if (aName == "") {
				alert("请输入会员姓名！");
				return false;
			}
			if (aPassword == "") {
				alert("请输入会员密码！");
				return false;
			}
			if (aState == "") {
				alert("请输入会员状态！");
				return false;
			}

			alert("会员信息修改成功！");
			return true;
		}
	</script>
</body>

</html>