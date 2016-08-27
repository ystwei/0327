<!DOCTYPE html>
<html>
  <head>
    <title>noparse.ftl</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
    <#assign season=["´º","ÏÄ"]/>
    <#noparse>
	    <#list season as s>
	    	${s}
	    
	    </#list>
    </#noparse>
  </body>
</html>
