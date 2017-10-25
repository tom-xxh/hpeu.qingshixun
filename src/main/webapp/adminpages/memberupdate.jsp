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
				<li id="back"><a href="adminpages/prodect.jsp" id="check"><span>产品管理</span></a>
				</li>
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
				<div class="positioninfo" id="positioninfo"><span class="webinfospan">会员管理>修改会员</span></div>

				 <div class="memberadd-content">
                        <form>
                        <div><span>请选择修改<span class="red">会员</span>以下信息：</span></div>

                        <div class="addbox"><span>会员姓名:</span>&nbsp&nbsp&nbsp
                            <input type="text" class="inputbox" name="name">   </div>

                            <div class="addbox"><span>会员性别:</span>&nbsp&nbsp&nbsp
                               
                               <label><input name="gen" type="radio" value="nan" />男 </label> 
                                <label><input name="gen" type="radio" value="nv" id="woman" />女 </label> 
                                   </div>

                                    <div class="addbox"><span>会员等级:</span>&nbsp&nbsp&nbsp
                               
                              <select name="等级">
                               
								<option value="qt" selected="selected">青铜</option>
								<option value="hj" >黄金</option>
								<option value="bj" >铂金</option>
								<option value="zs" >钻石</option>
								<
                               </select>
                                   </div>


                                  <div class="addbox"><span>会员密码:</span>&nbsp&nbsp&nbsp
                                <input type="password" class="inputbox" name="password">

                                <div class="addbox"><span>重复密码:</span>&nbsp&nbsp&nbsp
                                    <input type="password" class="inputbox" name="repeatpassword">

                                <div class="addbox"><span>会员证件:</span>&nbsp&nbsp&nbsp
                                    <input type="text" class="inputbox" name="idcard">
                                    </div>
                                    <div class="addbox"><span>会员邮箱:</span>&nbsp&nbsp&nbsp
                                        <input type="text" class="inputbox" name="email">
                                       </div>
                                            <div class="addbox"><span>会员电话:</span>&nbsp&nbsp&nbsp
                                                <input type="text" class="inputbox" name="phonenumber">
                                             </div>
                                                <button class="addbutton">修改</button>
                                                <button class="resetbutton">取消</button>
                                            
                                        
                                  
                              
                         
                            </form>
                        </div>
                
			</div>
        </div>

		</div>
	</div>
	<script src="../js/li.js"></script>
	 <div class="webfoot"><span>版权所有 © 2017 CodeMan.保留所有权</span></div>
</body>

</html>