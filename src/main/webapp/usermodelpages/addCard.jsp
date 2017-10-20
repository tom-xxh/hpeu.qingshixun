<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息查看</title>
<link rel="stylesheet" type="text/css" href="../css/right.css">
</head>
<body>
	<div class="mainPanel">
		<div class="main">
			<h4>添加银行卡</h4>
			<form id="addBankcard" action="addBankcardAction">
				<ul>
					<li class="grxx">
						<div class="grxx">
							&emsp;真实姓名: <input type="text" class="input" id="username"
								name="bankModel.username" class="text" maxlength="20"
								onblur="checkUserName()" />
						</div>
					</li>
					<li>
						<div class="grxx">
							&emsp;身份证号: <input type="text" class="input" id="idcard"
								name="bankModel.idcard" class="text" maxlength="20" onblur="checkUserName()" />
						</div>
					</li>
					<li>
						<div class="grxx">
							银行卡卡号: <input type="text" class="input" id="bankcard"
								name="bankModel.bankcard" class="text" maxlength="20"
								onblur="checkUserName()" />
						</div>
					</li>
					<li>
						<div class="grxx">
							&emsp;手机号码: <input type="text" class="input" id="phonenumber"
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
</body>
</html>