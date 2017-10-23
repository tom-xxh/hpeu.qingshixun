<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/right.css">
</head>
<body>
	<div class="big">
		<div class="main">
			<%@include file="PI-GUIDE.jsp"%>
			<div class="right">
				<!--当前页面位置信息加在这里 ↓-->
				<div class="guide">个人信息管理->解绑银行卡</div>
				<div class=" function">
					<!--当前页面内容加在这里 ↓-->
					<div class="addCard">
						<form id="register">
							<ul>
								<li class="grxx">
									<div class="grxx">
										&emsp;选择卡号: <select class="input">
											<!-- <input type="text" class="input" id="username" name="username" class="text" maxlength="20"   onblur="checkUserName()" /> -->
											<option>12345 1234567890123</option>
											<option>11111 1111111111111</option>
											<option>22222 2222222222222</option>
										</select>
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;身份证号: <input type="text" class="input" id="password"
											name="password" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li>
									<div class="grxx">
										银行卡卡号: <input type="text" class="input" id="email"
											name="email" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;手机号码: <input type="text" class="input" id="idcard"
											name="idcard" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li>
									<div class="grxx">
										<input type="submit" name="addCard" value="确定" class="anniu">
										<input class="anniu" type="reset" name="reset">
									</div>
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