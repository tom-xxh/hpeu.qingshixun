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
				<div class="guide">个人信息管理->个人信息修改(<span style="color: red">*</span>不可修改)</div>
				<div class=" function">
					<!--当前页面内容加在这里 ↓-->
					<div class="edit">
						<form action="do_edit" method="post" name="editForm">
							<div class="grxx">
								&emsp;用户ID: <input type="text" class="input" id="usernamesignup"
									name="userModel.id" class="text" maxlength="20"
									value="${userModel.id}" disabled/><span style="color: red">*</span>
							</div>
							<div class="grxx">
								&emsp;用户名: <input type="text" class="input" id="usernamesignup"
									name="userModel.name" class="text" maxlength="20"
									value="${userModel.name}" disabled/><span style="color: red">*</span>
							</div>
							<div class="grxx">
								&emsp;邮&emsp;箱: <input type="email" class="input"
									name="userModel.email" class="text" maxlength="20"
									value="${userModel.email}" id="emailsignup" disabled/><span
									style="color: red">*</span>
							</div>
							<div class="grxx">
								&emsp;电&emsp;话: <input type="text" class="input" id="email"
									name="userModel.phonenumber" class="text" maxlength="20"
									value="${userModel.phonenumber}" /><span
									style="color: white">*</span>
							</div>
							<div class="grxx">
								&emsp;身份证: <input type="text" class="input" id="idcard"
									name="userModel.IDcard" class="text" maxlength="20"
									value="${userModel.IDcard}" /><span
									style="color: white">*</span>
							</div>
							<div class="grxx">
									<input class="anniu" type="submit" name="submit" value="保存">
									<input class="anniu" type="button" name="return" value="返回"
										onclick="javascript:history.back(-1);">
								</div>
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