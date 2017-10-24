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
<title>用户模块-绑定银行卡</title>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/right.css">
</head>
<body>
	<div class="big">
		<div class="main">
			<%@include file="PI-GUIDE.jsp"%>
			<div class="right">
				<!--当前页面位置信息加在这里 ↓-->
				<div class="guide">个人信息管理-绑定银行卡</div>
				<div class=" function">
					<!--当前页面内容加在这里 ↓-->
					<div class="addCard">
						<form id="addCard" action="addBankcardAction" method="post">
							<ul>
								<li class="grxx">
									<div class="grxx">
										&emsp;真实姓名: <input type="text" class="input" id="username"
											name="bankModel.realName" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;身份证号: <input type="text" class="input" id="password"
											name="bankModel.id_card" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li>
									<div class="grxx">
										银行卡卡号: <input type="text" class="input" id="email"
											name="bankModel.bankcard" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li>
									<div class="grxx">
										&emsp;手机号码: <input type="text" class="input" id="idcard"
											name="bankModel.phonenumber" class="text" maxlength="20"
											onblur="checkUserName()" />
									</div>
								</li>
								<li>
									<div class="grxx">
										<input type="submit" name="addCard" value="同意协议并确定"> <a
											href="#">《银行卡绑定协议》</a>
									</div>
								</li>
							</ul>
						</form>
					</div>
				</div>
				<!--当前页面内容加在这里 ↑-->
			</div>
		</div>
	</div>
	</div>
</body>
</html>