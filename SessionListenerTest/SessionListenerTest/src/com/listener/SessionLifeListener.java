package com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class SessionLifeListener implements HttpSessionListener {

   private static int uCount;
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	uCount++;
    	System.out.println("Session Created");
    	System.out.println("No of active users:"+uCount);
    	HttpSession session=arg0.getSession();
    	session.setAttribute("qty",	0);
    	session.setAttribute("total", 0);
       
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("Session Destroyed"); 
    	uCount--;
    	System.out.println("No of active users:"+uCount);
    }
	
}
