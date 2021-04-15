
import com.spring.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of owners you want to create");
		int noOfOwners = Integer.parseInt(br.readLine());
		
		List<Owner> owners = new ArrayList<>();
		for(int i = 0; i < noOfOwners; ++i) {
			Owner owner = (Owner) appCtxt.getBean("owner");
			System.out.println("Enter the Name and Password of the Owner");
			String name = br.readLine();
			String password = br.readLine();
			
			owner.setName(name);
			owner.setPassword(password);
			
			owners.add(owner);
		}
		
		System.out.println("Enter the number of events you want to create");
		int noOfEvents = Integer.parseInt(br.readLine());
		
		List<Event> events = new ArrayList<>();
		for(int i = 0; i < noOfEvents; ++i) {
			Event event = (Event) appCtxt.getBean("event");
			System.out.println("Enter the  Event name");
			String eventName = br.readLine();
			
			System.out.println("Select any option from the list and enter the number");
			for(int j = 1; j <= owners.size() ; ++j) {
				System.out.println(j + ")" + owners.get(j-1).getName());
			}
			System.out.println("Enter the choice");
			int choice = Integer.parseInt(br.readLine()) - 1;
			Owner owner = owners.get(choice);
			
			
			event.setEventName(eventName);
			event.setEventOrganiser(owner);
			
			events.add(event);
			
		}
		
		System.out.println("...Listing events...");
		for(int i = 1; i <= events.size() ; ++i) {
			Event event = events.get(i-1);
			System.out.println(i + ")" + event.getEventName() + " - " + event.getEventOrganiser().getName());
		}
		
	}

}
