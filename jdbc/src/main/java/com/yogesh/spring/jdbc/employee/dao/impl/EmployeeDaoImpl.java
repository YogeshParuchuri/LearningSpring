package com.yogesh.spring.jdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.yogesh.spring.jdbc.employee.dao.EmployeeDao;
import com.yogesh.spring.jdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.yogesh.spring.jdbc.employee.dto.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int create = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getSecondName());
		return create;

	}

	@Override
	public int update(Employee employee) {
		String sql = "Update employee set firstName=?, lastName=? where id=? ";
		int update = jdbcTemplate.update(sql, employee.getFirstName(), employee.getSecondName(),employee.getId());
		return update;
	}
	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int dele = jdbcTemplate.update(sql,id );
		return dele;
		
	}
	@Override
	public Employee read(int id) {
		String sql = "Select *from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee empl=jdbcTemplate.queryForObject(sql,rowMapper,id );
		//qqueryForObject() is used to return only one reslt from the sql
		
		return empl;
	}
	@Override
	public List<Employee> read() {
		String sql = "Select * from Employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> query = jdbcTemplate.query(sql,rowMapper);
		return query;
	}



	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

}
