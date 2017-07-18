import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("studentbeans.xml");
		
		Student stu = (Student)context.getBean("stubean");
		
		stu.displayDetails();
		
	}
	

}
