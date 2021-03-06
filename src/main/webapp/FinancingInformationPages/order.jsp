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
<title>理财模块-订单管理</title>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/mmm.css">
<link rel="stylesheet" type="text/css" href="css/financing_right.css">
<link rel="stylesheet" type="text/css" href="css/right.css">
</head>
<body>
	<div class="big">
		<div class="main">
			<%@include file="FI-GUIDE.jsp"%>
			<div class="right">
				<!--当前页面位置信息加在这里 ↓-->
				<div class="guide">理财信息管理->订单管理</div>
				<div class="order">
					<!--当前页面内容加在这里 ↓-->
					<table>
						<tr>
							<th>产品编号</th>
							<th>产品名称</th>
							<th>购买数量</th>
							<th>花费金额</th>
							<th>购买日期</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${list}" var="obj" varStatus="stuts">
							<s:if test="#stuts.odd == true">
								<tr>
							</s:if>
							<s:else>
								<tr class="even">
							</s:else>
							<td>${obj.productcard }</td>
							<td>${obj.productname }</td>
							<td>${obj.productnumber }</td>
							<td>${obj.totalmoney }</td>
							<td>${obj.createDate }</td>
							<td><a href="deleteOrderAction?orderModel.id=${obj.id }">取消订单</a>&nbsp;/&nbsp;
							<a href="saveEarningsAction?orderModel.id=${obj.id }">提交订单</a></td>
							</tr>
						</c:forEach>
					</table>
					<!--当前页面内容加在这里 ↑-->
				</div>
			</div>
		</div>
	</div>
</body>
</html>