
<html>
  <head>
   
  </head>
  
  <body>
   	
   	<#macro test key>
   		������${key}
   	
   	</#macro>
   	
   	<@test key="���"/>
   	
   	<@test key="�㻵"/>
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
   	
   	<@test2 ok="�Һ�˧">�Һ�˧</@test2>
   
   	
   	
   	
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
   			����
   		
   		</#if>
   		   		
   	</@test3>
   	
   	<#macro test4 ok>
   		${ok}
   		<#return>
   		�Ѿ������ˣ�
   	</#macro>
   	<@test4 ok="���"/>
   	
  </body>
</html>
