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
				<li id="back"><a href="adminpages/personalinfo.jsp" id="check"><span>个人信息</span></a></li>
				</ul>
			</div>
			<div class="content">
			<div class="left">
				
                   <div class="first" id="second">
					<a href="adminpages/prodect-add.jsp"><div class="first-menu" id="second-menu1">添加产品</div></a>
					
				</div>





			</div>
			<div class="right">
				<div class="positioninfo" id="positioninfo"><span class="webinfospan">产品管理>修改产品</span></div>
			
			  <form>
			  	 <div class="prodect-add-content">
                        <div><span>请选择修改<span class="red">产品</span>以下信息：</span></div>
                        <div class="addbox"><span>产品名称:</span>
                            <input type="text" name="productname">
                             </div>

                            <div class="addbox"><span>产品利率:</span>
                                <input type="text" name="productrate">
                            </div>
                            <div class="addbox"><span>产品特征:</span>
                            <input type="text" name="productfeatures">
                            </div>
                            <div class="addbox"><span>详细描述:</span>
                            <input type="text" name="productdescription" class="productdescription">
                            </div>
                       <a href="product-update.jsp"><button class="addbutton">修改</button></a>
                        <button class="resetbutton">取消</button>
                    </div>
                     
			  </form>
			   </div>
		
	</div>
	<script src="../js/li.js"></script>
	
</body>

</html>