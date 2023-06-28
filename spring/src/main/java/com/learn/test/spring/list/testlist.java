package com.learn.test.spring.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext crt = 
				new ClassPathXmlApplicationContext("com/learn/test/spring/list/listconfig.xml");

		hospital hsp = (hospital) crt.getBean("hos");
		System.out.println("hospital name - "+hsp.getName());
		System.out.println("hospital department:"+hsp.getDepartment().getClass());
	}

}
