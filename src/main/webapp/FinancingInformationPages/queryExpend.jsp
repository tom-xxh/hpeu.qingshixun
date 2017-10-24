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
<title>理财模块-收益管理</title>
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
				<div class="guide">理财信息管理->收益管理</div>
					<div class="right-serch">
						<form action="#" method="post">
							<label for="date">按时间段查询:</label><br>
								&nbsp; &nbsp; <input type="text" id="date" name="date"> —— <input type="text" id="date" name="date">
							<button type="submit">查询</button><br>
							
							<label for="date">按银行卡账号查询:</label><br> 
								&nbsp; &nbsp; <input type="text" id="account" name="account">
							<button type="submit">查询</button><br>
							
							<label for="date">按时间段以及银行卡账号查询:<br>
							&nbsp; &nbsp; 时间段:<input type="text" id="date" name="date"> —— <input type="text" id="date" name="date"><br>
							&nbsp; &nbsp; 银行卡账号： <input type="text" id="account" name="account"></label>
							<button type="submit">查询</button>
							<br>
						</form>

						<div class="roll-in-table">
							<table border="1" cellpadding="0" cellspacing="0">
								<thead>
									<tr>
										<th>日期</th>
										<th>账号</th>
										<th>转入金额</th>
										<th>转出金额</th>
										<th>收益</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>2017/10/1</td>
										<td>123</td>
										<td>1000</td>
										<td>2000</td>
										<td>-1000</td>
									</tr>
									<tr>
										<td>2017/10/2</td>
										<td>234</td>
										<td>2000</td>
										<td>1000</td>
										<td>1000</td>
									</tr>
									<tr>
										<td>2017/10/3</td>
										<td>456</td>
										<td>3000</td>
										<td>3000</td>
										<td>0</td>
									</tr>
								</tbody>
							</table>
						</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>