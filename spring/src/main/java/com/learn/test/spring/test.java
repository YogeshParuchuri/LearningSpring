package com.learn.test.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext(" config.xml");
		employee emp=(employee) ctx.getBean("emp");
		System.out.println("employee name : "+emp.getName());
		 

	}

}
