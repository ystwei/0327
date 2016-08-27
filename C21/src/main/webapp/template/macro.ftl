
<html>
  <head>
   
  </head>
  
  <body>
   	
   	<#macro test key>
   		哈尔滨${key}
   	
   	</#macro>
   	
   	<@test key="你好"/>
   	
   	<@test key="你坏"/>
   	<br/>
   	<#macro test1  stupid silly foolish=5*5+2>
   		
   		${foolish}<br/>
   		${stupid}<br/>
   		${silly}<br/>
   		
   	</#macro>
   	
   	
   	<@test1 stupid="jack" silly="rose"/>
   	
   	
   	
   	
   	<#macro test2 ok>
   		1.<#nested>${ok}
   		2.<#nested>
   		<h1>3.<#nested></h1>
   	</#macro>
   	
   	<@test2 ok="我很帅">我很帅</@test2>
   
   	
   	
   	
   	<#macro test2>
   		1.<#nested 1,2,3,4><br/>
   		1.<#nested 2,3,4,5>
   	</#macro>
   	
   	
   	<@test2 ;x,y,z,t>
   		${y+x} ${x} ${z}${t}
   	</@test2>
   	<br/>
   	
   	<#macro test3 count>
   		<#list 1..count as x>
   			<#nested  x,x-1,x==count />
   		</#list>
   		
   	</#macro>  	
   	<@test3 count=4  ;a,b,c>
   		${a},${b}
   		<#if c>
   			结束
   		
   		</#if>
   		   		
   	</@test3>
   	
   	<#macro test4 ok>
   		${ok}
   		<#return>
   		已经结束了！
   	</#macro>
   	<@test4 ok="你好"/>
   	
  </body>
</html>
