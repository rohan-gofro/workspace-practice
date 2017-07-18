import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ContextConfiguration(locations = { "classpath:spring/testApplicationContext.xml", "classpath:spring/datasource-beans.xml" })
public class RunStudent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student obj = (Student) context.getBean("studentbean");
		obj.dispdata();

	}
}
