package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Employee;
import com.dao.EmployeeDAO;


@WebServlet("/SearchServ")
public class SearchServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html><body><center><h1>Employee Management System</h1>");
		EmployeeDAO dao=new EmployeeDAO();
		int eno = Integer.parseInt(request.getParameter("eno"));
		List<Employee> list=dao.searchEmployee(eno);
		
		if(list.size()==0)
		{
			out.println("<font color='red'><h2>No user found!</h2></font>");
		}
		else
		{
			out.println("<table border='1' cellpadding='5' cellspacing='5'><tr><th>Employee No</th><th>Name</th><th>Salary</th><th>City</th></tr>");
			
			for(Employee e:list)
			{
				System.out.println(e.getEname());
				out.println("<tr><td>"+e.getEno()+"</td><td>"+e.getEname()+"</td><td>"+e.getSalary()+"</td><td>"+e.getCity()+"</td></tr>");
			}
			out.println("</table>");
		}
		
		out.println("</center></body></html>");
		out.close();
	}
}
