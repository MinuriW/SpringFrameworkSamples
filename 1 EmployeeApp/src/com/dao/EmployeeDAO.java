package com.dao;
import java.util.*;
import java.sql.*;
public class EmployeeDAO {
	
	public List<Employee> getAllEmployees()
	{
		Connection con=ConnectionUtil.getConnection();
		ResultSet rs=null;
		Statement stmt=null;
		String query=null;
		List<Employee> list=null;
		try {
			stmt=con.createStatement();
			query="select * from employee";
			rs=stmt.executeQuery(query);
			list=new ArrayList<>();
			while(rs.next()) {
				list.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
			}//while
       	}//try
		catch(SQLException se) {se.printStackTrace();}
		return list;
	}//getALlEMployees
	

	public boolean addEmployee(Employee e)
	{
		Connection con=ConnectionUtil.getConnection();
		PreparedStatement pmt=null;
		String query=null;
		
		try {
			query="insert into employee values(?,?,?,?)";
			pmt=con.prepareStatement(query);
			pmt.setInt(1, e.getEno());
			pmt.setString(2, e.getEname());
			pmt.setInt(3, e.getSalary());
			pmt.setString(4, e.getCity());
			
			int n=pmt.executeUpdate();
		    return n>0?true:false;
		}
		catch(SQLException se) {se.printStackTrace();}
		
		return false;
	}//adEmployee
	
	
	public List<Employee> searchEmployee(int eno) {
		
		Connection con=ConnectionUtil.getConnection();
		PreparedStatement pmt=null;
		String query=null;
		ResultSet rs = null;
		List<Employee> list=null;
		
		try {
			query = "select * from employee where eno=?";
			pmt = con.prepareStatement(query);
			pmt.setInt(1, eno);
			rs = pmt.executeQuery();
			list=new ArrayList<>();
			
			while(rs.next()) {
				list.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public boolean updateEmployee(Employee e) {
		
		Connection con=ConnectionUtil.getConnection();
		PreparedStatement pmt=null;
		String query=null;
		
		try {
			query = "update employee set ename=?, salary=?, city=? where eno=?";
			pmt = con.prepareStatement(query);
			pmt.setString(1, e.getEname());
			pmt.setInt(2, e.getSalary());
			pmt.setString(3, e.getCity());
			pmt.setInt(4, e.getEno());
			
			int i = pmt.executeUpdate();
			
			if(i>0) {
				return true;
			} else {
				return false;
			}
			
		} catch(SQLException se) {
			se.printStackTrace();
		}
		
		return false;
	}
	
	
public boolean deleteEmployee(Employee e) {
		
		Connection con=ConnectionUtil.getConnection();
		PreparedStatement pmt=null;
		String query=null;
		
		try {
			query = "delete employee where eno=?";
			pmt = con.prepareStatement(query);
			pmt.setInt(1, e.getEno());
			
			int i = pmt.executeUpdate();
			
			if(i>0) {
				return true;
			} else {
				return false;
			}
			
		} catch(SQLException se) {
			se.printStackTrace();
		}
		
		return false;
	}
	
	
//	public 
	
	
}//class
















