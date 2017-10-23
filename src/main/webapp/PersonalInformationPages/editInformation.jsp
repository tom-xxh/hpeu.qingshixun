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
						<form>
							<ul>
								<li class="grxx">
									<div class="grxx">
										&emsp;用户名: <input type="text" class="input" id="username"
											name="username" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;密&emsp;码: <input type="text" class="input" id="password"
											name="password" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;邮&emsp;箱: <input type="text" class="input" id="email"
											name="email" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;身份证: <input type="text" class="input" id="idcard"
											name="idcard" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li><input class="anniu" type="submit" name="submit">
									<input class="anniu" type="reset" name="reset"></li>
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