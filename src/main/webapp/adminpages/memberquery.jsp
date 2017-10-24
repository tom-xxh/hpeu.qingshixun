<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="zh">

<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
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
					<a href="../index.jsp">退出</a>
				</div>
				<div class="help">
					<a href="#">帮助</a>
				</div>
			</div>
			<div class="top-down">
				<ul>
				<li id="back"><a href="adminpages/memberm.jsp" id="check"><span>会员管理</span></a></li>
				<li id="back"><a href="adminpages/prodect.jsp" id="check"><span>产品管理</span></a></li>
				<li id="back"><a href="adminpages/systemm.jsp" id="check"><span>系统维护</span></a></li>
				<li id="back"><a href="findAdmin" id="check"><span>个人信息</span></a></li>
				</ul>
			</div>
            <div class="content">
			<div class="left">
				<div class="first" id="first">
					<a href="adminpages/memberquery.jsp"><div class="first-menu" id="first-menu1">查询会员</div></a>
					<a href="adminpages/memberadd.jsp"><div class="first-menu" id="first-menu2">添加会员</div></a>
					
					
					<a href="adminpages/loginlog.jsp"><div class="first-menu" id="first-menu5">登录日志</div></a>
					
			
				</div>
				



			</div>
			<div class="right">
				<div class="positioninfo" id="positioninfo"><span class="webinfospan">会员管理>会员查询</span></div>
                    <div class="memberquery-content">
                    	<div class="seachbox"><span>输入会员姓名:</span>&nbsp&nbsp&nbsp<input type="text" name="seach"> <button class="seachbutton">查询</button></div>
                    	<div class="ruselt">
                    		<table class="ruseltable">
                    			<thead>
                    				<td>姓名</td>
                    				<td>注册ID</td>
                    				<td>性别</td>
                    				<td>等级</td>
                    				<td>身份证号</td>
                    				<td>电话</td>
                    				<td>邮箱</td>
                    				<td>注册时间</td>
                    				<td>操作</td>
                    			</thead>
                              <tbody>
                              	<td class="tableinfobox">殷槐伟</td>
                              	<td class="tableinfobox">10010</td>
                              	<td class="tableinfobox">男</td>
                              	<td class="tableinfobox">青铜</td>
                              	<td class="tableinfobox" >50010989779739492349</td>
                              	<td class="tableinfobox" >15523550707</td>
                              	<td class="tableinfobox" >72381728@qq.com</td>
                              	<td class="tableinfobox" >20170601</td>
                              	<td class="tableinfobox">
                              		
                              	<a href="adminpages/memberupdate.jsp"><button class="update">修改</button></a>
								<button class="deletebutton">删除</button>
                              	</td>

                              </tbody>

                    		</table>

                    	</div>
                         
                               
   
                    </div>
			</div>
        </div>

		</div>
	</div>
	<script src="../js/li.js"></script>
	
</body>

</html>