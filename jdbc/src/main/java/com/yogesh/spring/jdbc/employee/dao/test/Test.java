package com.yogesh.spring.jdbc.employee.dao.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yogesh.spring.jdbc.employee.dao.EmployeeDao;
import com.yogesh.spring.jdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/yogesh/spring/jdbc/employee/dao/test/config.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDaoImpl");
		Employee employee = new Employee();
		//employee.setId(3);
		//employee.setFirstName("hall");
		//employee.setSecondName("walker");
		//int result = employeeDao.create(employee);
		//int result = employeeDao.update(employee);
		//int result = employeeDao.delete(2);
		//Employee emp = employeeDao.read(1);
		List<Employee> read = employeeDao.read();
		System.out.println("result = "+read);
	}

}
