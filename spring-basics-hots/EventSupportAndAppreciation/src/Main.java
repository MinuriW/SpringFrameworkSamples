import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.*;

public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		Event e1 = (Event) appCtxt.getBean("e1");
		Event e2 = (Event) appCtxt.getBean("e2");
		Event e3 = (Event) appCtxt.getBean("e3");
		
		EventList eventList = new EventList();
		eventList.insert(e1);
		eventList.insert(e2);
		eventList.insert(e3);
		
		eventList.supportAndAppreciation();
	}

}
