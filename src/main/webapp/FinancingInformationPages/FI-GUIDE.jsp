<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/mmm.css">

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
				href="PersonalInformationPages/checkInformation.jsp" id="check"><span>个人信息管理</span></a></li>
			<li><a href="FinancingInformationPages/earnings.jsp" id="check"><span>理财信息管理</span></a></li>
		</ul>
	</div>
</div>
<div class="content">
	<div class="left">
		<div class="first" id="first">
			<div class="first-menu" id="first-menu1"
				onclick="window.location.href='FinancingInformationPages/earnings.jsp';">收益管理</div>
			<div class="first-menu" id="first-menu2"
				onclick="window.location.href='FinancingInformationPages/income.jsp';">转入金额</div>
			<div class="first-menu" id="first-menu3"
				onclick="window.location.href='FinancingInformationPages/expend.jsp';">转出金额</div>
			<div class="first-menu" id="first-menu4"
				onclick="window.location.href='FinancingInformationPages/queryIncome.jsp';">转入金额查询</div>
			<div class="first-menu" id="first-menu5"
				onclick="window.location.href='FinancingInformationPages/queryExpend.jsp';">转出金额查询</div>
			<!-- 			<div class="first-menu" id="first-menu6">资金流水</div> -->
			<div class="first-menu" id="first-menu7"
				onclick="window.location.href='FinancingInformationPages/statisticalStatement.jsp';">统计报表</div>
			<div class="first-menu" id="first-menu8"
				onclick="window.location.href='FinancingInformationPages/products.jsp';">理财产品管理</div>
		</div>
	</div>