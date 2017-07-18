import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class RunQuestions {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Questions ques = (Questions)factory.getBean("ques");
		ques.Dispdata();
		
	}
	
}
