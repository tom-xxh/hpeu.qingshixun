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
<title>理财模块-账单详情</title>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/mmm.css">
<link rel="stylesheet" type="text/css" href="css/financing_right.css">
</head>
<body>
	<div class="big">
		<div class="main">
			<%@include file="FI-GUIDE.jsp"%>
			<div class="right">
				<div class="guide">理财信息管理->账单详情</div>
					<div class="right-serch">
						<div class="roll-in-table">
							<table border="1" cellpadding="0" cellspacing="0">
								<thead>
									<tr>
										<th>日期</th>
										<th>转入/转出</th>
										<th>金额</th>
										<th>银行卡账户</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list }" var="temp" varStatus="vs">
								 		<tr
								 		  
									 		   <c:if test="${vs.index%2==0 }">
									 				style="background-color: #FFFFFF"
									 		   </c:if>
									 		   <c:if test="${vs.index%2==1 }">
									 				style="background-color: #EFF0EF"
									 		   </c:if>
								 		  
								 		>
								 			<td>${temp.date}</td>
								 			<td>${temp.status}</td>
							 				<td>${temp.transfer_Money}</td>
							 				<td>${temp.bankcard}</td>
							 				<td>
							 					<a href="DeleteTransferInfos?transferModel.transferId=${temp.transferId }">删除</a>
							 				</td>
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