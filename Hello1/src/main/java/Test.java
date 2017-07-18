import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;  

public class Test {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student student = (Student)factory.getBean("studentbean");
		student.displayData();
		
	}

}
