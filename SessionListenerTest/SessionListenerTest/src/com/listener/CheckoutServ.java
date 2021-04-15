package com.listener;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/checkout")
public class CheckoutServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	java.io.PrintWriter out=response.getWriter();
	HttpSession session=request.getSession();
	int qty=(Integer)session.getAttribute("qty");
	int total=(Integer)session.getAttribute("total");
	
	out.println("<html><body>Qty:"+qty+"<br>Total:"+total);
	out.println("<br><a href='logout'>Logout</a><br>");
	out.println("<br><a href='index.jsp'>Home</a><br>");
	out.println("</body></html>");
	
	out.close();
		
	}

	
	

}