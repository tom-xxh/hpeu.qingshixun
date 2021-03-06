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

<html lang="zh">

<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理模块</title>
<link rel="stylesheet" type="text/css" href="css/admin.css">
<script src="http://lib.sinaapp.com/js/jquery/2.0.3/jquery-2.0.3.min.js"></script>
</head>
<body>
	<div class="big">
		<div class="main">
			<div class="top">
				<div class="img">
					<img src="images/logo-blue.png">
				</div>
				<div class="exit">
					<a href="index.jsp">退出</a>
				</div>
			</div>
			<div class="top-down">
				<ul>
					<li id="back"><a href="adminpages/memberm.jsp" id="check"><span>会员管理</span></a></li>
					<li id="back"><a href="searchProductAction" id="check"><span>产品管理</span></a></li>
					<li id="back"><a href="adminpages/systemm.jsp" id="check"><span>系统维护</span></a></li>
					<li id="back"><a href="findAdmin" id="check"><span>个人信息</span></a></li>
				</ul>
			</div>
			<div class="content">
				<div class="left">
					<div class="first" id="second">
						<a href="adminpages/prodect-add.jsp"><div class="first-menu"
								id="second-menu1">添加产品</div></a>
					</div>
				</div>
				<div class="right">
					<div class="positioninfo" id="positioninfo">
						<span class="webinfospan">产品管理</span>
					</div>

					<div class="memberquery-content">
						<div class="seachbox">
							<span>请输入产品名称:</span>&nbsp&nbsp&nbsp<input type="text"
								name="seach">
							<button class="seachbutton">查询</button>
						</div>
						<div class="ruselt">
							<table class="ruseltable">
								<thead>
									<tr>
										<td>产品编号</td>
										<td>产品名称</td>
										<td>产品类型</td>
										<td>单股价格(元)</td>
										<td>涨跌利率(%)</td>
										<td>操作</td>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="obj" varStatus="stuts">
										<s:if test="#stuts.odd == true">
											<tr>
										</s:if>
										<s:else>
											<tr class="even">
										</s:else>
										<td class="tableinfobox">${obj.productcard }</td>
										<td class="tableinfobox">${obj.productname }</td>
										<td class="tableinfobox">${obj.producttype }</td>
										<td class="tableinfobox">${obj.productprice }</td>
										<td class="tableinfobox">${obj.interestrate }</td>
										<td class="tableinfobox">
											<button class="update">
												<a href="searchProduct?productModel.id=${obj.id }">修改</a>
											</button>
											<button class="deletebutton">
												<a href="deleteProductAction?productModel.id=${obj.id }">删除</a>
											</button>
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
	</div>
	<div class="webfoot">
		<span>版权所有 © 2017 CodeMan.保留所有权</span>
	</div>
</body>

</html>