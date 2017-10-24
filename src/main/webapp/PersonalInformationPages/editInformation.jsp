<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户模块</title>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/mmm.css">
<script src="http://lib.sinaapp.com/js/jquery/2.0.3/jquery-2.0.3.min.js"></script>
</head>

<body>
	<div class="big">
		<div class="main">
			<%@include file="PI-GUIDE.jsp"%>
			<div class="right">
				<!--当前页面位置信息加在这里 ↓-->
				<div class="guide">个人信息管理->个人信息修改</div>
				<div class=" function">
					<!--当前页面内容加在这里 ↓-->
					<div class="edit">
						<form action="do_edit" method="post" name="editForm">
							<ul>
								<li class="grxx">
									<div class="grxx">
										&emsp;用户名: <input type="text" class="input" id="username"
											name="userModel.name" class="text" maxlength="20"
											value="${userModel.name}" />
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;密&emsp;码: <input type="text" class="input" id="password"
											name="userModel.password" class="text" maxlength="20"
											value="${userModel.password}" />
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;邮&emsp;箱: <input type="email" class="input" id="email"
											name="userModel.email" class="text" maxlength="20"
											value="${userModel.email}" />
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;电&emsp;话: <input type="text" class="input" id="email"
											name="userModel.phonenumber" class="text" maxlength="20"
											value="${userModel.phonenumber}" />
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;身份证: <input type="text" class="input" id="idcard"
											name="userModel.IDcard" class="text" maxlength="20"
											value="${userModel.IDcard}" />
									</div>
								</li>
								<li><input class="anniu" type="submit" name="submit"
									value="保存"> <input class="anniu" type="button"
									name="return" value="返回" onclick="javascript:history.back(-1);">
								</li>
							</ul>
						</form>
					</div>
					<!--当前页面内容加在这里 ↑-->
				</div>
			</div>
		</div>
	</div>
	</div>
</body>

</html>