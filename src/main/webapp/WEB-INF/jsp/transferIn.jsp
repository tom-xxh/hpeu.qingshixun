<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
跳转成功
<table>
		<c:forEach items="${list}" var="obj">
			<tr>
				<td>${obj.id }</td>
				<td>${obj.age }</td>
				<td>${obj.name }</td>
				<td>
					<a href="delete?TransferInModel.id=${obj.id }">删除</a>
				</td>
				<td>
					<a href="update?TransferInModel.id=${obj.id }">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>