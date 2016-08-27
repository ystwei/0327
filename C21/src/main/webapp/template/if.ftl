<!DOCTYPE html>
<html>
  <head>
    <title>if.ftl</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=GBK">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
  
  	
    <#assign score=30/>
    <#assign score="${score}"?number/>
    <#if (score>=60)>
    	合格
    <#elseif (score>40)>
    	差
    <#else>
    	次品
    </#if>
  </body>
</html>
