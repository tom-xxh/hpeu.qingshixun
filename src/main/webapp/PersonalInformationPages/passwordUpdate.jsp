<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户模块</title>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/mmm.css">
<script src="http://lib.sinaapp.com/js/jquery/2.0.3/jquery-2.0.3.min.js"></script>
</head>

<body>
	<div class="big">
		<div class="main">
			<%@include file="PI-GUIDE.jsp"%>
			<div class="right">
				<!--当前页面位置信息加在这里 ↓-->
				<div class="guide">个人信息管理->个人信息修改</div>
				<div class=" function">
					<!--当前页面内容加在这里 ↓-->
					<div class="edit">
						<form name="form1" method="post" action="PasswordUpdateSave"
							onSubmit="return mycheck()">
							<div class="grxx">
								<span>请输入原密码：</span> <input name="Password" type="password"
									class="text2" id="Password">
							</div>
							<div class="grxx">
								<span>请输入新密码：</span> <input name="Password2" type="password"
									class="text2" id="Password2">
							</div>

							<div class="grxx">
								<span>请重复新密码：</span> <input name="Password3" type="password"
									class="text2" id="Password3">
							</div>
							<div class="grxx">
								<input type="submit" name="button" id="button" value="修改密码">
							</div>
						</form>
					</div>
					<!--当前页面内容加在这里 ↑-->
				</div>
			</div>
		</div>
	</div>
	</div>
	<script language="JavaScript">
		function mycheck() {
			if (isNull(form1.Password.value)) {
				alert("请输入原密码！");
				return false;
			}
			if (isNull(form1.Password2.value)) {
				alert("请输入新密码！");
				return false;
			}
			if (isNull(form1.Password3.value)) {
				alert("请输入重复密码！");
				return false;
			}
			if (document.form1.Password2.value != document.form1.Password3.value) {
				alert("您两次输入的新密码不一致！请重新输入！");
				return false;
			}
		}
		function isNull(str) {
			if (str == "")
				return true;
			var regu = "^[ ]+$";
			var re = new RegExp(regu);
			return re.test(str);
		}
	</script>
</body>

</html>