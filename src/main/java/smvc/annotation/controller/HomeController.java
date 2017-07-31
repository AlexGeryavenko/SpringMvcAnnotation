package smvc.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/first")
	public ModelAndView first() {
		ModelAndView mav = new ModelAndView("first");
		mav.addObject("welcomeMessage", "First message. Test.");
		
		return mav;
	}
	
	@RequestMapping("/second")
	public ModelAndView second() {
		ModelAndView mav = new ModelAndView("second");
		mav.addObject("welcomeMessage", "Second message. Test.");
		
		return mav;
	}

}
