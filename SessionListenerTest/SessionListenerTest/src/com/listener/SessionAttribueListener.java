package com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


@WebListener
public class SessionAttribueListener implements HttpSessionAttributeListener {

    
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         
    }

	
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
        
    }

    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
        HttpSession session =arg0.getSession();
        int qty=(Integer)session.getAttribute("qty");
        int total=qty*500;
        session.removeAttribute("total");
        if(total>=2000)
        	total=total-(int)(total*.10);
        session.setAttribute("total", total);
        System.out.println("Total Amount:"+total);
        
        
        	
    	
    }
	
}






