package rohan;

import java.net.URLClassLoader;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("started");
		//Thread.sleep(10000);
		URLClassLoader classLoader = (URLClassLoader) App.class.getClassLoader();
		System.out.println(Arrays.toString(classLoader.getURLs()));

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ScheduleWithCron obj = (ScheduleWithCron) context.getBean("schedule");
		obj.doSomething();

	}
}
