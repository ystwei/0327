<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
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
   	<form:form action="valid/verify" method="post" commandName="user">
   		<form:input path="username" />
   		<font color="red"> 
   			<form:errors path="username"></form:errors>
   			
   		</font>
   		<br/>
   		<form:input path="pwd" />
   		<font color="red"> 
   			<form:errors path="pwd"></form:errors>
   		</font>
   		<br/>
   		<input type="number" name="age">
   		<font color="red"> 
   			<form:errors path="age"></form:errors>
   		</font>
   	<br/>
   	<input type="submit" value="Submit" />
   	</form:form>
  </body>
</html>
