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
				<div class="function">
					<form action="saveOrderAction?productModel.id=${ProductModel.id }" method="post">
						<input type="hidden" value="${ProductModel.id }" />
						产品编号：${ProductModel.productcard }<br><br>
						产品名称：${ProductModel.productname }<br><br>
						产品类型：${ProductModel.producttype }<br><br>
						产品单价：${ProductModel.productprice }<br><br>
						跌涨率&nbsp;&nbsp;&nbsp;：${ProductModel.interestrate }<br><br>
						请输入购买数量：<input type="text" name="productnumber" id="num" placeholder="请输入购买数量！"><br><br>
						<button type="submit" onclick="return sure()">确定</button>
					</form>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	function sure(){
		var num=document.getElementById("num").value;
		if(isNaN(num)||num<=0||!(/^\d+$/.test(num))){
			alert("请输入正确的数值,只允许输入整数!");
			return false;
		}
	}
</script>
</html>