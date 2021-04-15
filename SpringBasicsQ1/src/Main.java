import com.spring.TicketBooking;

import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		

        ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
        TicketBooking t = (TicketBooking)a.getBean("TicketBooking");
        
        System.out.format("The total cost for 3 is Rs. ", t.faregenerator());
        
        }
	}
