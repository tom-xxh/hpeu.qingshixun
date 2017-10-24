<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/mmm.css">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<div class="top">
	<div class="img">
		<img src="images/logo3.png">
	</div>
	<div class="exit">
		<a href="index.jsp">退出</a>
	</div>
	<div class="help">
		<a href="#">帮助</a>
	</div>
</div>
<div class="top-down">
	<div class="top-guide">
		<ul>
			<li id="back"><a
				href="info" id="check"><span>个人信息管理</span></a></li>
			<li><a href="FinancingInformationPages/earnings.jsp" id="check"><span>理财信息管理</span></a></li>
		</ul>
	</div>
</div>
<div class="content">
	<div class="left">
		<div class="first" id="first">
			<div class="first-menu" id="first-menu1"
				onclick="window.location.href='info';">个人信息查看
			</div>
			<div class="first-menu" id="first-menu3"
				onclick="window.location.href='PersonalInformationPages/passwordUpdate.jsp';">修改密码</div>
			<div class="first-menu" id="first-menu2"
				onclick="window.location.href='PersonalInformationPages/addCard.jsp';">银行卡添加</div>
			<div class="first-menu" id="first-menu4"
				onclick="window.location.href='findBankcardAction';">银行卡解绑</div>
		</div>
	</div>

