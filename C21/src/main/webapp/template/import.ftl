<!DOCTYPE html>
<html>
  <head>
    <title>import.ftl</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
    <#import "macro.ftl" as m/>
    <@m.test key="ÎÒºÜºÃ"/>
  </body>
</html>
