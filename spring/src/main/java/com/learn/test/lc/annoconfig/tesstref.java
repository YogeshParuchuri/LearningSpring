package com.learn.test.lc.annoconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tesstref {

	public static void main(String[] args) {
	
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/learn/test/lc/annoconfig/lcxmlconfig.xml");
		patient pat=(patient) ctx.getBean("patient");
		System.out.println(pat);
		ctx.registerShutdownHook();
		
		
	}

}
