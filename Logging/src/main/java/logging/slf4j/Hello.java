package logging.slf4j;

import org.slf4j.LoggerFactory;

public class Hello {

	final static org.slf4j.Logger logger = LoggerFactory.getLogger(Hello.class);

	public static void main(String[] args) {
		
		logger.info("Entry point");
		System.out.println("Welcome");
		logger.info("Exit point");
		
	}

}
