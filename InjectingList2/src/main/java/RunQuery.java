import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class RunQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Query obj = (Query)factory.getBean("query");
		obj.dispQuery();

	}

}
