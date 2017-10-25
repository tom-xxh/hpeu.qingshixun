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
			</div>
			<div class="top-down">
				<ul>
					<li id="back"><a href="adminpages/memberm.jsp" id="check"><span>会员管理</span></a></li>
					<li id="back"><a href="searchProductAction" id="check"><span>产品管理</span></a></li>
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
						<span class="webinfospan">个人信息>个人密码修改</span>
					</div>
					<div class="memberadd-content">
						<form name="puaForm" method="post" action="PasswordUpdateAdmin"
							onSubmit="return checkPwd()">
							<div class="addbox">
								<span>旧密码:</span>&emsp;&emsp; <input type="password"
									class="inputbox" name="Password" id="Password">
							</div>
							<div class="addbox">
								<span>新密码:</span>&emsp;&emsp; <input type="password"
									class="inputbox" name="Password2" id="Password2">
							</div>
							<div class="addbox">
								<span>确认新密码:</span> <input type="password" class="inputbox"
									name="Password3" id="Password3">
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

	<script language="JavaScript">
		function checkPwd() {
			if (isNull(puaForm.Password.value)) {
				alert("请输入原密码！");
				return false;
			}
			if (isNull(puaForm.Password2.value)) {
				alert("请输入新密码！");
				return false;
			}
			if (isNull(puaForm.Password3.value)) {
				alert("请重复新密码！");
				return false;
			}
			if (document.puaForm.Password2.value != document.puaForm.Password3.value) {
				alert("您两次输入的新密码不一致！请重新输入！");
				return false;
			}
		}
		function isNull(str) {
			if (str == "")
				return true;
		}
	</script>
	 <div class="webfoot"><span>版权所有 © 2017 CodeMan.保留所有权</span></div>
</body>

</html>