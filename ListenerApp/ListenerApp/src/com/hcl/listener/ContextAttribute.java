package com.hcl.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ContextAttribute implements ServletContextAttributeListener {

   
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
        System.out.println("Attribute Added in ServletContext");
        System.out.println("Name of attribute: "+arg0.getName());
    }

	
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
         
    }

	
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
         
    }
	
}
