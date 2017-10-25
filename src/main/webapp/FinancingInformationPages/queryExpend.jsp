<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
						<label for="date">按产品名称:</label> <input type="text"
							id="productname" name="productname">
						<button type="submit">查询</button>
						<br>
					</form>

					<div class="roll-in-table">
						<table border="1" cellpadding="0" cellspacing="0">
							<thead>
								<tr>
									<th>产品名称</th>
									<th>花费金额</th>
									<th>当前利率</th>
									<th>购买日期</th>
									<th>预估收益</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${list}" var="obj" varStatus="stuts">
								<s:if test="#stuts.odd == true">
									<tr>
								</s:if>
								<s:else>
									<tr class="even">
								</s:else>
								<td>${obj.productname }</td>
								<td>${obj.totalmoney }</td>
								<td>${obj.interestrate }</td>
								<td>${obj.createDate }</td>
								<td>${obj.earnings }</td>
								<td><a href="deleteEarningsAction?earningsModel.id=${obj.id }">删除记录</a></td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>