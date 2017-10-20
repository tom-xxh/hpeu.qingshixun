<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>理财模块-转出金额查询界面</title>
<link rel="stylesheet" type="text/css" href="../css/financing_right.css">
</head>

<body>
	<div class="right">
		<div class="right-serch">
			<form action="#" method="post">
				<label for="date">时间:</label> <input type="text" id="date"
					name="date"> —— <input type="text" id="date" name="date">
				<button type="submit">查询</button>
			</form>

			<div class="roll-in-table">
				<table border="1" cellpadding="0" cellspacing="0">
					<thead>
						<tr>
							<th class="th1"><input type="checkbox" name="checkboxItem"
								id="choice">日期</th>
							<th>转出金额</th>
							<th>详细信息</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="th1"><input type="checkbox" name="checkboxItem">2017/10/1
								9:20:30</td>
							<td>1000</td>
							<td>123账号转出1000元</td>
						</tr>
						<tr>
							<td class="th1"><input type="checkbox" name="checkboxItem">2017/10/2
								15:20:30</td>
							<td>2000</td>
							<td>234账号转出2000元</td>
						</tr>
						<tr>
							<td class="th1"><input type="checkbox" name="checkboxItem">2017/10/3
								20:20:30</td>
							<td>3000</td>
							<td>456账号转出3000元</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>