

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import com.spring.EventList;

public class Main {

    public static void main(String[] args) throws IOException {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		EventList el=new EventList();
		Event e1 = (Event) ac.getBean("event1");
		el.insert(e1);
		Event e2 = (Event) ac.getBean("event2");
		el.insert(e2);
		Event e3 = (Event) ac.getBean("event3");
		el.insert(e3);

		System.out.println("Enter the eventName you want to search :");
		String eventName = br.readLine();
		Event event = el.search(eventName);
		
		if(event!=null) {
			event.display();
		}
		else {
			System.out.println("No matching events");
		}
	}

}
