<!DOCTYPE html>
<html>
  <head>
    <title>list.ftl</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
  
  	<#assign count=3/>
  	
  	
  	<#list 1..count as i >
  	
  		${i}
  		<#if (i=2)>
	  		<#break>
	  
	 	</#if>
  	</#list>
  	<br/>
  	<#assign season=["´º","ÏÄ","Çï"]/>
  
  	<#list season as s>
  	 	${s_index}:${s}
  	 	<#if s_has_next>
  	 		,
  	 	
  	 	</#if>
  	 </#list>
    <#list users as user>
    	${user.name}---${user.age}
    
    </#list>
  </body>
</html>
