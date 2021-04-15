import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.People;
import com.spring.Person;

public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("beans.xml");
		People people =  (People) appCtxt.getBean("people");
		
		for(Person p : people.getPeople()) {
			System.out.println(p.getName());
		}

	}

}
