package com.hcl.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hcl.ex1.dao.EmployeeDAO;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jt = (JdbcTemplate)ac.getBean("jdbcTemplate");
		EmployeeDAO empDao = new EmployeeDAO(jt);
		if(empDao.addEmployee()) {
			System.out.println("Employee details added successfully!");
		}else {
			System.out.println("Error in adding employee details");
		}
		/*if(empDao.updateEmployee()) {
			System.out.println("Employee details updated successfully!");
		}else {
			System.out.println("Error in updating employee details");
		}
		if(empDao.deleteEmployee()) {
			System.out.println("Employee details deleted successfully!");
		}else {
			System.out.println("Error in deleting employee details");
		}*/
	}
}
