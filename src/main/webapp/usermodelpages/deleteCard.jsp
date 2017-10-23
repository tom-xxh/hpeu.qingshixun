<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<h4>解绑银行卡</h4>
			<form id="deleteCard" action="deleteBankcardAction" method="post">
				<ul>
					<li class="grxx">
						<div class="grxx">
							选择银行卡卡号: <select class="input" name="bankid">
								<!-- <input type="text" class="input" id="username" name="username" class="text" maxlength="20"   onblur="checkUserName()" /> -->
								<c:forEach items="${list}" var="obj">
									<option>${obj.bankcard }</option>
								</c:forEach>
							</select>
						</div>
					</li>
					<li>
						<div class="grxx">
							&emsp;&emsp;&emsp;身份证号: <input type="text" class="input"
								id="password" name="bankModel.idcard" class="text"
								maxlength="20" onblur="checkUserName()" />
						</div>
					</li>
					<li>
						<div class="grxx">
							&emsp;&emsp;&emsp;真实姓名: <input type="text" class="input"
								id="email" name="bankModel.username" class="text" maxlength="20"
								onblur="checkUserName()" />
						</div>
					</li>
					<li>
						<div class="grxx">
							&emsp;&emsp;&emsp;手机号码: <input type="text" class="input"
								id="idcard" name="bankModel.phonenumber" class="text"
								maxlength="20" onblur="checkUserName()" />
						</div>
					</li>
					<li>
						<div class="grxx">
							<input type="submit" name="deleteCard" value="确定" class="anniu">
							<input class="anniu" type="reset" name="reset">
						</div>
					</li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>