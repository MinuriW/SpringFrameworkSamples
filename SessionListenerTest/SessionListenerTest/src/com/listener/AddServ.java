package com.listener;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AddServ")
public class AddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 java.io.PrintWriter out=response.getWriter();
	 int iqty=Integer.parseInt(request.getParameter("qty"));
	 
	 HttpSession session=request.getSession();
	 
	 int qty=(Integer)session.getAttribute("qty");
	 qty+=iqty;
	 session.setAttribute("qty", qty);
	 out.println("New Quantity:"+qty);
	 out.println("<br><a href='checkout'>Checkout</a><br>");
	 out.println("<br><a href='index.jsp'>Home</a><br>");
	 out.close();
	
	}

	
}
