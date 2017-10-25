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
					<div class="first" id="first">
						<div class="first-menu" id="first-menu1"
							onclick="window.location.href='adminpages/memberquery.jsp'">查询会员</div>
						<div class="first-menu" id="first-menu2"
							onclick="window.location.href='adminpages/memberadd.jsp'">添加会员</div>
						<div class="first-menu" id="first-menu5"
							onclick="window.location.href='countUser'">在线人数</div>
					</div>
				</div>
				<div class="right">
					<div class="positioninfo" id="positioninfo">
						<span class="webinfospan">会员管理>会员查询</span>
					</div>
					<div class="memberquery-content">
						<form action="queryUser" method="post">
							<div class="seachbox">
								<span>输入会员 <select name="queryRow">
										<option value="name">姓名</option>
										<option value="id">ID</option>
										<option value="IDcard">身份证号</option>
								</select></span>&nbsp;&nbsp;&nbsp;<input type="text" name="queryKey"> <input
									type="submit" name="submit" value="查询" class="seachbutton" />
							</div>
						</form>
						<div class="ruselt">
							<table class="ruseltable">
								<thead>
									<tr>
										<td>ID</td>
										<td>姓名</td>
										<td>身份证号</td>
										<td>电话</td>
										<td>邮箱</td>
										<td>操作</td>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="temp" varStatus="vs">
										<tr>
											<td class="tableinfobox">${temp.id}</td>
											<td class="tableinfobox">${temp.name}</td>
											<td class="tableinfobox">${temp.IDcard}</td>
											<td class="tableinfobox">${temp.phonenumber}</td>
											<td class="tableinfobox">${temp.email}</td>
											<td class="tableinfobox"><button class="update"
													onclick="window.location.href='editUser?userModel.id=${temp.id}'">修改</button>
												<button class="deletebutton"
													onclick="window.location.href='delete?userModel.id=${temp.id}'">删除</button></td>
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