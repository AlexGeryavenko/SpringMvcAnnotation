package smvc.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView helloPage() {
		ModelAndView mav = new ModelAndView("HelloPage");
		mav.addObject("welcomeMessage", "Welcome message from -> handleRequestInternal(). Test.");
		
		return mav;
	}

}
