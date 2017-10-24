<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>理财模块-提现</title>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/mmm.css">
<link rel="stylesheet" type="text/css" href="css/financing_right.css">
</head>
<body>
	<div class="big">
		<div class="main">
			<%@include file="FI-GUIDE.jsp"%>
			<div class="right">
				<div class="guide">理财信息管理->提现</div>
				<div class="function">
					<form action="TransferOutAction" method="post">
						<label>请输入银行卡账号:</label> 
							<input type="text" id="account" name="transferModel.bankcard"><br><br>
						<label>&nbsp; &nbsp;请输入提现金额:</label> 
							<input type="text" id="money" name="transferModel.transfer_Money"><br><br>
						<button type="submit">提现</button>
					</form>
			</div>
		</div>
	</div>
</body>
</html>