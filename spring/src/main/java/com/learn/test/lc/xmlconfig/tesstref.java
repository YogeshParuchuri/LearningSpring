package com.learn.test.lc.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.test.spring.employee;

public class tesstref {

	public static void main(String[] args) {
	
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/learn/test/lc/xmlconfig/lcxmlconfig.xml");
		patient pat=(patient) ctx.getBean("patient");
		System.out.println(pat);
		ctx.registerShutdownHook();
	}

}
