<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息查看</title>
<link rel="stylesheet" type="text/css" href="css/right.css">
</head>
<body>
	<div class="mainPanel">
		<div class="main">
			<h4>个人信息查看</h4>
			<form id="register">
				<ul>
					<li class="grxx">
						<div class="grxx">
							&emsp;用户名: <input type="text" class="viewInfo" id="username"
								name="username" class="text" maxlength="20"
								onblur="checkUserName()" />
						</div>
					</li>
					<li>
						<div class="grxx">
							&emsp;密&emsp;码: <input type="text" class="viewInfo" id="password"
								name="password" class="text" maxlength="20"
								onblur="checkUserName()" />
						</div>
					</li>
					<li>
						<div class="grxx">
							&emsp;邮&emsp;箱: <input type="text" class="viewInfo" id="email"
								name="email" class="text" maxlength="20"
								onblur="checkUserName()" />
						</div>
					</li>
					<li>
						<div class="grxx">
							&emsp;身份证: <input type="text" class="viewInfo" id="idcard"
								name="idcard" class="text" maxlength="20"
								onblur="checkUserName()" />
						</div>
					</li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>