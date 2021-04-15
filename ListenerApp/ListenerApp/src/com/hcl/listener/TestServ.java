package com.hcl.listener;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServ")
public class TestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public TestServ() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     ServletContext ctx=getServletConfig().getServletContext();
	     DBProperty db=(DBProperty)ctx.getAttribute("dbconfig");
	     
	     java.io.PrintWriter out=response.getWriter();
	     out.println("Username:"+db.getUsername());
	     out.println("<br>Passwword :"+db.getPassword());
	     
	     
	}

	
}
