
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ContactDetail;
import com.spring.Hall;

public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hall h = (Hall)ac.getBean("hall");
		h.displayEventList();;

	}

}
