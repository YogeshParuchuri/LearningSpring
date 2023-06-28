package com.learn.test.reftype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.test.spring.employee;

public class tesstref {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/learn/test/reftype/refconfig.xml");
		student stu=(student) ctx.getBean("student");
		System.out.println(stu);

	}

}
