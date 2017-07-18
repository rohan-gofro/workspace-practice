import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class RunEmployee {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee objemp = (Employee)factory.getBean("empaddr");
		objemp = (Employee)factory.getBean("emp1");
		//Employee objemp1 = (Employee)factory.getBean("emp2");
		objemp.dispEmployeeData();
		//objemp1.dispEmployeeData();
		
	}

}
