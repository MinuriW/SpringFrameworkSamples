
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

    public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
       
		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer c = (Customer)ac.getBean("Customer");
		Policy p = (Policy)ac.getBean("Policy");
		System.out.println(c);
        
	}

}
