
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
        
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory bean = new XmlBeanFactory(resource);
		
		System.out.println("Package Details:");
		System.out.println();
		
		StandardPackage p1 = (StandardPackage) bean.getBean("package1");
		p1.calculateCost();
		System.out.println("Package-1");
		p1.display();
		System.out.println();
		
		
		StandardPackage p2 = (StandardPackage) bean.getBean("package2");
		p2.calculateCost();
		System.out.println("Package-2");
		p2.display();
		System.out.println();
		
		StandardPackage p3 = (StandardPackage) bean.getBean("package3");
		p3.calculateCost();
		System.out.println("Package-3");
		p3.display();
		System.out.println();
		
		
	}

}