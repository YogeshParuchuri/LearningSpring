package com.yogesh.spring.jdbc.employee.dao;

import java.util.List;

import com.yogesh.spring.jdbc.employee.dto.Employee;

public interface EmployeeDao {

	
	int create(Employee employee);
	int update (Employee employee);
	int delete (int id);
	Employee read(int id);
	
	List<Employee> read();
}