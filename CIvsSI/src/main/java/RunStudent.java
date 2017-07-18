import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class RunStudent {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student obj;
		obj = (Student)factory.getBean("sbean");
		obj.dispData();	
	}
}
