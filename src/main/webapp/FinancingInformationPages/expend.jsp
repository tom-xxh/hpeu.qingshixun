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
<title>理财模块-转出金额</title>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/mmm.css">
<link rel="stylesheet" type="text/css" href="css/financing_right.css">
</head>
<body>
	<div class="big">
		<div class="main">
			<%@include file="FI-GUIDE.jsp"%>
			<div class="right">
				<!--当前页面位置信息加在这里 ↓-->
				<div class="guide">理财信息管理->提现</div>
				<div class=" function">
					<!--当前页面内容加在这里 ↓-->
					<div class="right-serch">
						<form action="#" method="post">
							<label>请输入银行卡账号:</label> 
								<input type="text" id="account" name="account"> <br>
							<label>请输入提现金额:</label> 
								<input type="text" id="money" name="money">
							<button type="submit">提现</button>
						</form>
						<div class="roll-in-table">
							<table border="1" cellpadding="0" cellspacing="0">
								<thead>
									<tr>
										<th class="th1"><input type="checkbox"
											name="checkboxItem" id="choice">日期</th>
										<th>转出金额</th>
										<th>详细信息</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="th1"><input type="checkbox"
											name="checkboxItem">2017/10/1 9:20:30</td>
										<td>1000</td>
										<td>123账号转出1000元</td>
									</tr>
									<tr>
										<td class="th1"><input type="checkbox"
											name="checkboxItem">2017/10/2 15:20:30</td>
										<td>2000</td>
										<td>234账号转出2000元</td>
									</tr>
									<tr>
										<td class="th1"><input type="checkbox"
											name="checkboxItem">2017/10/3 20:20:30</td>
										<td>3000</td>
										<td>456账号转出3000元</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!--当前页面内容加在这里 ↑-->
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>