package com.hcl.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ContextListener implements ServletContextListener {

    
	public void contextInitialized(ServletContextEvent evt)  { 
        System.out.println("Servlet Context Initialized...");
        ServletContext ctx=evt.getServletContext();
        String username=ctx.getInitParameter("username");
        String pass=ctx.getInitParameter("password");
        
        DBProperty dbp=new DBProperty(username,pass);
        ctx.setAttribute("dbconfig", dbp);
        
   }
    
    public void contextDestroyed(ServletContextEvent evt)  { 
    	System.out.println("Servlet Context Destroyed...");
    }

	
    
	
}
