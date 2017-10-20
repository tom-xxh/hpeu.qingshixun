<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>理财模块</title>
<link rel="stylesheet" type="text/css" href="../css/person.css">
<script src="http://lib.sinaapp.com/js/jquery/2.0.3/jquery-2.0.3.min.js"></script>
</head>

<body>
	<div class="big">
		<div class="main">
			<div class="top">
				<div class="img">
					<img src="../images/logo3.png">
				</div>
				<!-- <div class="title">理财精灵</div> -->
				<div class="exit">
					<a href="../index.jsp">退出</a>
				</div>
				<div class="help">
					<a href="#">帮助</a>
				</div>
			</div>
			<div class="top-down">
				<li><a href="../usermodelpages/personalInformation.jsp"
					id="check">个人信息管理</a></li>
				<li id="back"><a href="#" id="check">理财产品管理</a></li>
			</div>
			<div class="left">
				<div class="first" id="first">
					<div class="first-menu" id="first-menu1">转入金额</div>
					<div class="first-menu-down" id="first-menu1-down">
						<li><a href="right-1.jsp" target="myIframe">转入</a></li>
						<li><a href="right-2.jsp" target="myIframe">查询</a></li>
					</div>
					<div class="first-menu" id="first-menu2">转出金额</div>
					<div class="first-menu-down" id="first-menu2-down">
						<li><a href="right-3.jsp" target="myIframe">转出</a></li>
						<li><a href="right-4.jsp" target="myIframe">查询</a></li>
					</div>
					<div class="first-menu" id="first-menu3">收益管理</div>
					<div class="first-menu-down" id="first-menu3-down">
						<li><a href="right-5.jsp" target="myIframe">查询</a></li>
					</div>
					<div class="first-menu" id="first-menu4">统计报表</div>
					<div class="first-menu-down" id="first-menu4-down">
						<li><a href="right-6.jsp" target="myIframe">统计报表</a></li>
					</div>
					<div class="first-menu" id="first-menu5">理财产品管理</div>
					<div class="first-menu-down" id="first-menu5-down">
						<li><a href="right-7.jsp" target="myIframe">理财产品</a></li>
						<li><a href="right-8.jsp" target="myIframe">理财产品添加</a></li>
						<li><a href="right-9.jsp" target="myIframe">理财产品删除</a></li>
					</div>
				</div>
			</div>
			<div class="right">
				<iframe class="myIframe" name="myIframe"> </iframe>
			</div>
		</div>
	</div>
	<script src="../js/li.js"></script>
	<script type="text/javascript">
		$("#first-menu1").click(function() {
			$('#first-menu1-down').toggle();
		});
		$("#first-menu2").click(function() {
			$('#first-menu2-down').toggle();
		});
		$("#first-menu3").click(function() {
			$('#first-menu3-down').toggle();
		});
		$("#first-menu4").click(function() {
			$('#first-menu4-down').toggle();
		});
		$("#first-menu5").click(function() {
			$('#first-menu5-down').toggle();
		});

		// 新增加
		$('#first').on('click', '.first-menu', function() {
			$('.first-menu').removeClass('new');
			$('#first li').removeClass('new');
			$(this).each(function(index) {
				$(this).addClass('new');
				$(this).siblings().removeClass('new');
			});
		});
		$('#first').on('click', 'li', function() {
			$('.first-menu').removeClass('new');
			$('#first li').removeClass('new');
			$(this).each(function(index) {
				$(this).addClass('new');
				$(this).siblings().removeClass('new');
				$(this).parent().prev().addClass('new');
			});
		});
	</script>
</body>
</html>