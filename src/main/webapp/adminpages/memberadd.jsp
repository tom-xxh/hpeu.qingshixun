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
					<div class="first" id="first">
						<div class="first-menu" id="first-menu1"
							onclick="window.location.href='adminpages/memberquery.jsp'">查询会员</div>
						<div class="first-menu" id="first-menu2"
							onclick="window.location.href='adminpages/memberadd.jsp'">添加会员</div>
						<div class="first-menu" id="first-menu5"
							onclick="window.location.href='adminpages/loginlog.jsp'">登录日志</div>
					</div>
				</div>
				<div class="right">
					<div class="positioninfo" id="positioninfo">
						<span class="webinfospan">会员管理>会员添加</span>
					</div>
					<div class="memberadd-content">
						<form name="addForm" action="addUser" method="post" id="fromAdd"
							onSubmit="return checkUser()">
							<div>
								<span>请输入<span class="red">新会员</span>以下信息：
								</span>
							</div>
							<div class="addbox">
								<span>会员姓名:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									id="usernamesignup" class="inputbox" name="userModel.name"
									id="uName">
							</div>
							<div class="addbox">
								<span>会员密码:</span>&nbsp;&nbsp;&nbsp; <input type="password"
									class="inputbox" name="userModel.password" id="uPassword">
							</div>
							<div class="addbox">
								<span>重复密码:</span>&nbsp;&nbsp;&nbsp; <input type="password"
									class="inputbox" name="repeatpassword" id="uRepeatPassword">
							</div>
							<div class="addbox">
								<span>会员证件:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.IDcard">
							</div>
							<div class="addbox">
								<span>会员邮箱:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									id="emailsignup" class="inputbox" name="userModel.email">
							</div>
							<div class="addbox">
								<span>会员电话:</span>&nbsp;&nbsp;&nbsp; <input type="text"
									class="inputbox" name="userModel.phonenumber">
							</div>
							<input type="submit" name="submit" value="添加" id="addInput"
								class="addbutton" /> <input type="reset" class="resetbutton"
								value="重置">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="webfoot">
		<span>版权所有 © 2017 CodeMan.保留所有权</span>
	</div>
	<script language="JavaScript">
	<!--邮箱验证-->
		$('#emailsignup').on("blur", function() {
			<!--Ajax-->
			var userEmail = $('#emailsignup').val();
			$.post("useremail", {
				"email" : userEmail
			}, function(data) {
				if (data == "1") {
					return false;
				} else if (data == "0") {
					alert("该邮箱已存在！");
					return false;
				}
			}, "json");
		})
		<!--用户名示例-->
		$('#usernamesignup').on("blur", function(str) {
			<!--Ajax-->
			var username = $('#usernamesignup').val();
			$.post("useraction", {
				"name" : username
			}, function(data) {
				if (data == "1") {
					return false;
				} else if (data == "0") {
					alert("该用户已存在！");
					return false;
				} else if (data == "2") {
					alert("用户名不得少于6位并且不能大于12位！");
					return false;
				}
			}, "json");

		})

		<!--注册账户示例-->
		$('#addInput').on(
				"click",
				function(str) {

					var addNmae = $('#usernamesignup').val();
					var addEmailsignup = $('#emailsignup').val();
					var addPassword = $('#passwordsignup-confirm').val();
					var obj = $(this);
					var msg = "您可以注册此用户确定注册吗？";
					if (addNmae.length < 6 || addEmailsignup.length < 3
							|| addPassword.length < 6) {
						alert("用户注册信息不全!");
						return false;
					} else if (confirm(msg) == true) {
						obj.parents($('#fromAdd')).submit(); //验证码正确提交表单
						return false;
					}

				})
	</script>

</body>

</html>