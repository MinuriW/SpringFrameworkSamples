

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.Event;

public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Event e1 = (Event) appCtxt.getBean("event1");
		Event e2 = (Event) appCtxt.getBean("event2");
		Event e3 = (Event) appCtxt.getBean("event3");
		
		e1.display();
		e2.display();
		e3.display();
		
	}

}
