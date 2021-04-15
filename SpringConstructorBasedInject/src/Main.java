import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Category c1 =  (Category)ac.getBean("cat1");
		Category c2 =  (Category)ac.getBean("cat2");
		Category c3 =  (Category)ac.getBean("cat3");
		
		System.out.println("Total Cost of category 1 is : "+c1.totalCost());
		System.out.println("Total Cost of category 2 is : "+c2.totalCost());
		System.out.println("Total Cost of category 3 is : "+c3.totalCost());

	}

}
