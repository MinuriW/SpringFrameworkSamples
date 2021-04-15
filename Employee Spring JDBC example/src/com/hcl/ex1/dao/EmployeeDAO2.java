package com.hcl.ex1.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class EmployeeDAO2 implements RowMapper<Employee>{
	@Override
	public Employee mapRow(ResultSet rs, int rowNo) throws SQLException {
		Employee e = new Employee();
		e.setNo(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setSalary(rs.getDouble(3));
		e.setCity(rs.getString(4));
		return e;
	}	
}
