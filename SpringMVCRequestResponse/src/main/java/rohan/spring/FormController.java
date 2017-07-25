package rohan.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@RequestMapping("/check")
	public ModelAndView checklogin(@RequestParam(name="name")String name , @RequestParam(name = "password")String password)
	{
		if(name.equals(password))
		{
			return new ModelAndView("welcome" , "name" , name);
		} 
		else
		{
			return new ModelAndView("error" , "message" , "Incorrect credentials" );
		}
	}
}
