package scheduling.cron;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringScheduleDemo {
 public static void main(String[] args) {
 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
 }
}