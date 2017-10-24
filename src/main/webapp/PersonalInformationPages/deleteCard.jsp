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
<title>Insert title here</title>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/right.css">
</head>
<body>
	<div class="big">
		<div class="main">
			<%@include file="PI-GUIDE.jsp"%>
			<div class="right">
				<!--当前页面位置信息加在这里 ↓-->
				<div class="guide">个人信息管理->解绑银行卡</div>
				<div class=" function">
					<!--当前页面内容加在这里 ↓-->
					<div class="deleteCard">
						<table>
							<tr>
								<th>银行卡号</th>
								<th>身份证号</th>
								<th>真实姓名</th>
								<th>手机号码</th>
								<th>操作</th>
							</tr>
							<c:forEach items="${list}" var="obj" varStatus="stuts">
								<s:if test="#stuts.odd == true">
									<tr>
								</s:if>
								<s:else>
									<tr class="even">
								</s:else>
								<td>${obj.bankcard }</td>
								<td>${obj.id_card }</td>
								<td>${obj.realName }</td>
								<td>${obj.phonenumber }</td>
								<td><a href="deleteBankcardAction?bankModel.id=${obj.id }">解绑</a></td>
								</tr>
							</c:forEach>
						</table>
					</div>
					<!--当前页面内容加在这里 ↑-->
				</div>
			</div>
		</div>
	</div>
</body>
</html>