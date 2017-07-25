package rohan.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {

	@RequestMapping("/welcome")
	public String WelcomeWorldMessage(ModelMap model)
	{
		String message = "Welcome to multiple action class. You choose welcome";
		model.addAttribute("message", message);
		String name = "Rohan";
		model.addAttribute("name" , name);
		return "welcome";
	}
	
	@RequestMapping("/hello")
	public ModelAndView HelloWorldMessage()
	{
		String message = "Welcome to multiple action class. You choose hello and not welcome";
		return new ModelAndView("welcome" , "message" , message);
	}
	
}
