import com.spring.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		TicketBooking booking = (TicketBooking) appCtxt.getBean("TicketBooking");
		
		System.out.format("The total cost for %d persons is Rs.%.1f", booking.getNumberOfPersons(), booking.faregenerator());

	}

}
