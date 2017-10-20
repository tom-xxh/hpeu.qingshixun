<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/jquery.luara.0.0.1.min.js"></script>
<title>Index</title>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/loginAndRegister.css" />
<link rel="stylesheet" href="css/luara.left.css" />
</head>

<body>
	<div class="top">
		<div class="right">
			<a href="index.jsp">首页</a>&nbsp;&nbsp; <a href="usermodelpages/personalInformation.jsp">投资</a>&nbsp;&nbsp;
			<a href="#">理财</a>&nbsp;&nbsp; <a id="L">登录</a>&nbsp;&nbsp;
			<a id="R">注册</a>
		</div>
		<div id="wrapper">
			<div id="login" class="animate form">
			<form action="login" method="post">
                        <h1>
                                <img src="images/logo3.png">
                            </h1>
                        <p>
                            <label for="username" class="uname" data-icon="u">用户名</label>
                            <input id="username" name="userModel.name" required="required" type="text" placeholder="请输入用户名" />
                        </p>
                        <p>
                            <label for="password" class="youpasswd" data-icon="p"> 密码 </label>
                            <input id="password" name="userModel.password" required="required" type="password" placeholder="请输入密码" />
                        </p>
                        <p class="keeplogin">
                            <input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" />
                            <label for="loginkeeping">记住密码</label>
                        </p>
                       <p class="login button">
						<input type="submit" value="登录" class="submit" />
					</p>
					<p class="change-link">
						没有账号 ? <a href="#" class="to-register">注册</a>
					</p>                    </form>
                </div>
             <div id="register" class="animate form">
                    <form  action="add" method="post">
                        <h1>
                         <img src="images/logo3.png"> 
                        </h1>
                        <p>
                            <label for="usernamesignup" class="uname" data-icon="u">用户名</label>
                            <input id="usernamesignup" name="userModel.name" required="required" type="text" placeholder="请输入用户名" />
                            <span id="spannameOne" class="error_msgone">您输入的用户名已存,在请重新输入</span>
                            <span id="spanname" class="error_msg">X</span>
                        </p>
                        <p>
                            <label for="emailsignup" class="youmail" data-icon="e"> 邮箱地址</label>
                            <input id="emailsignup" name="userModel.email" required="required" type="email" placeholder="请输入邮箱地址" />
                             <span id="spanemailOne" class="error_msg2one">您输入的邮箱有误,在请重新输入</span>
                            <span id="spanemail" class="error_msg2">X</span>
                        </p>
                        <p>
                            <label for="passwordsignup"  class="youpasswd" data-icon="p">密码 </label>
                            <input id="passwordsignup" name="userModel.password" required="required" type="password" placeholder="请输入密码" />
                        </p>
                        <p>
                            <label for="passwordsignup-confirm" class="youpasswd" data-icon="p">重复密码 </label>
                            <input id="passwordsignup-confirm" name="passwordsignup-confirm" required="required" type="password" placeholder="请输入密码" />
                            <span id="passwordSpanOne" class="error_msg3oen">您输入的密码有误,在请重新输入</span>
                            <span id="passwordSpan" class="error_msg3">X</span>
                        </p>
                       <p class="signin button">
						<input type="submit" value="注册" />
					</p>                                            </form>
                        <p class="change-link">
						已有账号 ? <a href="#" class="to-login"> 直接登录 </a>
					</p>                
				</div>           
		</div>
	</div>
	<div class="log">
		<img src="images/logo.png" />
	</div>
	<div class="nav">
		<div class="example">
			<ul>
				<li><img src="images/1.jpg" alt="1" /></li>
				<li><img src="images/2.jpg" alt="2" /></li>
				<li><img src="images/3.jpg" alt="3" /></li>
				<li><img src="images/4.jpg" alt="4" /></li>
			</ul>
			<ol>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
			</ol>
		</div>
		<!--Luara图片切换骨架end-->
		<script>
			$(document).ready(function() {
				$('#L').on('click', function() {
					if ($("#login").css("display") == "none") {
						$('#login').css("display", 'block');
						$('#register').css("display", 'none');
					}
				});
				$('#R').on('click', function() {
					if ($("#register").css("display") == "none") {
						$('#register').css("display", 'block');
						$('#login').css("display", 'none');
					}
				});
				$('.to-login').on('click', function() {
					if ($("#login").css("display") == "none") {
						$('#login').css("display", 'block');
						$('#register').css("display", 'none');
					}
				});
				$('.to-register').on('click', function() {
					if ($("#register").css("display") == "none") {
						$('#register').css("display", 'block');
						$('#login').css("display", 'none');
					}
				});
				$('.close').on('click', function() {
					$('#register').css("display", 'none');
					$('#login').css("display", 'none');
				});
				<!--调用Luara示例-->
				$(".example").luara({
					width : "1250",
					height : "400",
					interval : 4500,
					selected : "seleted",
					deriction : "left"
				});
				
				<!--注册账户示例-->
				  $('#usernamesignup').on("blur",function(){
		                if ($('#usernamesignup').val().length<6) {
		                     $('#spannameOne').css('visibility', 'visible');
		                $('#spanname').css('visibility', 'visible');
		                    }else{
		                 $('#spannameOne').css('visibility', 'hidden');
		                 $('#spanname').css('visibility', 'hidden');
		                 }
		         })
				<!--注册邮箱示例-->
		            $('#emailsignup').on("blur",function(){
		                if ($('#emailsignup').val().indexOf('@')==-1) {
		                    $('#spanemailOne').css('visibility', 'visible');
		                    $('#spanemail').css('visibility', 'visible');
		                 }else{
		                    $('#spanemailOne').css('visibility', 'hidden');
		                 $('#spanemail').css('visibility', 'hidden');
		                 }
		             })
		             
		             <!--注册密码示例-->
		            $('#passwordsignup-confirm').on("blur",function(){
		                if($('#passwordsignup-confirm').val()==$('#passwordsignup').val()){
		                    $('#passwordSpanOne').css('visibility', 'hidden');
		                          $('#passwordSpan').css('visibility', 'hidden');
		                }else{
		                       $('#passwordSpanOne').css('visibility', 'visible');
		                             $('#passwordSpan').css('visibility', 'visible');
		                 }
		             })
				
			})
		</script>
	</div>
	<div class="hxd_data">
		<div class="auto_mid">
			<div>
				<h2>成功完成总额</h2>
				<p class="num_one">
					14,611,037,346.00<span>元</span>
				</p>
			</div>
			<div>
				<h2>累计帮助用户获取收益</h2>
				<p class="num_two">
					542,151,701.00<span>元</span>
				</p>
			</div>
			<div>
				<h2>通过理财精灵获取收益的忠实用户</h2>
				<p class="num_three">
					2,221,958<span>人</span>
				</p>
			</div>
		</div>
	</div>
	<div class="semreg-info">
		<h2>什么是理财精灵？</h2>
		<p>
			这是一款界面小巧但功能却十分强大的软件,它能够方便地纪录您每一次的收入支出、物品的采购和债务的管理,并可以根据您所输入的数据生成图表显示和详细的数据统计,同时它还提供了强大的、通讯薄、网络书签、计时提醒等功能.在日常生活中,我们经常会感觉钱不知道花到了什么地方,通过它您可以方便地查看每一条历史纪录,并且可以通过月度查询来了解某一个月的收入支出情况,在每条纪录的收入、支出下,还能够设置细分类,更加方便了数据的纪录和查询.另外程序还会设定固定项目,用于每年或每月的自动添加.主要功能:1.收支录入2.历史查询3.月度查询4.图表显示5.通讯薄6.物品管理7.债务管理8.计时提醒9.网络书签10.自动添加固定项目.
		</p>
	</div>
	<div class="semreg-jiedai" style="background-color: #f4f4f4">
		<div class="semreg-jiedai-content">
			<h2>为什么选择理财精灵？</h2>
			<dl class="semreg-jiedai-5">
				<dt class="semreg-icon semreg-icon-5">
					<img src="images/p1.png">
				</dt>
				<dd>
					<span>资本支持</span>
					<p>B轮2.5亿元人民币融资</p>
				</dd>
			</dl>
			<dl class="semreg-jiedai-1">
				<dt class="semreg-icon semreg-icon-1">
					<img src="images/p2.png">
				</dt>
				<dd>
					<span>好收益</span>
					<p>历史年化收益10%-14%</p>
				</dd>
			</dl>
			<dl class="semreg-jiedai-2">
				<dt class="semreg-icon semreg-icon-2">
					<img src="images/p3.png">
				</dt>
				<dd>
					<span>银行存管</span>
					<p>新网银行安全存管</p>
				</dd>
			</dl>
			<dl class="semreg-jiedai-3">
				<dt class="semreg-icon semreg-icon-3">
					<img src="images/p4.png">
				</dt>
				<dd>
					<span>行业权威</span>
					<p>互金协会首批会员</p>
				</dd>
			</dl>
			<dl class="semreg-jiedai-4">
				<dt class="semreg-icon semreg-icon-4">
					<img src="images/p5.png">
				</dt>
				<dd>
					<span>风投背景</span>
					<p>上市公司强势入股</p>
				</dd>
			</dl>
		</div>
	</div>
	<div id="footer">
		<div class="footer_inner">
			<ul>
				<li><a href="#" class="botimg01" target="_blank"></a></li>
				<li><a href="#" class="botimg02" target="_blank"></a></li>
				<li><a href="#" class="botimg03" target="_blank"></a></li>
				<li><a href="#" class="botimg04" target="_blank"></a></li>
				<li><a href="#" class="botimg05" target="_blank"></a></li>
			</ul>
			<p>
				京ICP备14023220号 | 京ICP证140453号 | 京公网安备11010502024326 <br>
				和信电子商务有限公司 &copy 2013 和信贷 All Rights Reserved
			</p>
		</div>
	</div>
</body>
</html>