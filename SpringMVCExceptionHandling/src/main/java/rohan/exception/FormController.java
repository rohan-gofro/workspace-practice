package rohan.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping(value = "/writestudent" , method = RequestMethod.GET)
	public String getStudent(ModelMap map)
	{
		return "student";
	}
	
	@RequestMapping("/getstudent")
	public String displayStudent(@ModelAttribute Student student , ModelMap model)
	{
		if(student.getName().length() < 5)
			throw new SpringException("name too short");
		else
			model.addAttribute("name" , student.getName());
		
		if(student.getAge() < 18)
			throw new SpringException("Age cannot be less than 18");
		else
			model.addAttribute("age" , student.getAge());
		
		model.addAttribute("address" , student.getAddress());
			
		return "display";
	}
	
	
}
