<%@ page language="java" import="java.util.*"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>test</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
<style type="text/css">
body {
	padding: 20px;
}
</style>
</head>

<body>


	<h2>MyUser表<a href="user!amain">添加用户</a></h2>
	<table class="table table-striped table-bordered">
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>密码</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${requestScope.list}" var="m" varStatus="status">
		
		<tr>
			<td>
			${status.count}
			</td>
			<td>
			${m.username}
			</td>
			<td>
			${m.pwd}
			</td>
			<td>
				<a href="user!amain?id=${m.id}">修改</a>
				<a href="user!del?id=${m.id}">删除</a>
			</td>
		
		</tr>
		</c:forEach>
	</table>


</body>
</html>
