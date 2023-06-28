package com.yogesh.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yogesh/spring/jdbc/config.xml");
			JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
			String sql ="insert into employee values(?,?,?)";
			int result = jdbcTemplate.update(sql, 1,"Yogesh","Paruchuri");
			System.out.println(result);
	}

}
