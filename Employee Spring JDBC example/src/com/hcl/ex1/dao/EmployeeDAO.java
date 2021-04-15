package com.hcl.ex1.dao;
import org.springframework.jdbc.core.JdbcTemplate;
public class EmployeeDAO {
	JdbcTemplate jdbcTemplate;
	public EmployeeDAO() {
		
	}
	public EmployeeDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public boolean addEmployee() {
		String sql = "insert into employee values(?,?,?,?)";
		int result = jdbcTemplate.update(sql, 5,"Hansini",80000.00,"Kottawa");
		return result>0?true:false;
	}
	public boolean updateEmployee() {
		String sql = "update employee set ename=?,salary=?,city=? where eno=?";
		int result = jdbcTemplate.update(sql,"Kaveesha",72000.00,"Horana",3);
		return result>0?true:false;
	}
	public boolean deleteEmployee() {
		String sql = "Delete from employee where eno=?";
		int result = jdbcTemplate.update(sql,3);
		return result>0?true:false;
	}
	
}
