<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
	

	<%
		response.sendRedirect("user!show");
	
	%>


</body>
</html>
