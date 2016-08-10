package com.weikun.A;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		JavaTrad t=(JavaTrad)ctx.getBean("trad");
//		t.jiangke();
		
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory f=new XmlBeanFactory(res);
		JavaTrad j=(JavaTrad)f.getBean("trad");

		j.jiangke();
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		JavaTrad t=(JavaTrad)ctx.getBean("trad");
		t.jiangke();
		
	}

}
