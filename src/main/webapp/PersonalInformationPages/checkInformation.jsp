<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户模块-个人信息查看</title>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="mmm.css">
</head>

<body>
	<div class="big">
		<div class="main">
			<%@include file="PI-GUIDE.jsp"%>
			<div class="right">
				<!--当前页面位置信息加在这里 ↓-->
				<div class="guide">个人信息管理->个人信息查看</div>
				<div class=" function">
					<!--当前页面内容加在这里 ↓-->
					<div class="check">
						<table cellspacing="0">
							<thead>
								<tr>
									<td>ID</td>
									<td>姓名</td>
									<td>邮箱</td>
									<td>电话</td>
									<td>身份证</td>
									<td>操作</td>
								</tr>
							</thead>
							<tbody>
								 	<td>${userModel.id}</td>
									<td>${userModel.name}</td>
									<td>${userModel.email}</td>
									<td>${userModel.phonenumber}</td>
									<td>${userModel.IDcard}</td>
									<td><a href="to_edit">修改</a></td>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>