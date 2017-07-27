package controller.classes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@RequestMapping(value = "/addstudent", method = RequestMethod.GET)
	public ModelAndView requestMapForm() {
		return new ModelAndView("studentform");
	}

	@RequestMapping(value = "/getstudent", method = RequestMethod.POST)
	public String showData(@ModelAttribute Student student, ModelMap model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("address", student.getAddress());
		return "getstudent";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String requestMap() {
		return "redirect:addstudent";
	}
}
