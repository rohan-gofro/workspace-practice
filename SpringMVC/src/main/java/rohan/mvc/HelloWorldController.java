package rohan.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld()
	{
		String message = "Welcome to MVC";
		return new ModelAndView("HelloWorld" , "message" , message);
	}

}
