import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Category c1 =  (Category)ac.getBean("category1");
		Category c2 =  (Category)ac.getBean("category2");
		Category c3 =  (Category)ac.getBean("category3");		
		System.out.println("Total Cost of category is : "+c1.getTotal());
		System.out.println("Total Cost of category is : "+c2.getTotal());
		System.out.println("Total Cost of category is : "+c3.getTotal());
	}
}
