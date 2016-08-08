<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'amain.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    	<h1><c:if test="${param.id==null}">增加-</c:if>    	
    	<c:if test="${param.id!=null}">修改-</c:if>主窗体</h1>
    	
    	<form action="user!add" method="post">
    		用户名：<input type="text" name="user.username" value="${user.username}"/>
    		密码：<input type="text" name="user.pwd" value="${user.pwd}"/>
    		<input type="hidden" value="${requestScope.id}" name="user.id">
    		<input type="submit" value="提交">
    	
    	
    	</form>
  </body>
</html>
