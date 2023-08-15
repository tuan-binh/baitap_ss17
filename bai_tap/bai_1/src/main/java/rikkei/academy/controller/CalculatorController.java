package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import rikkei.academy.model.Calculator;

@Controller
@RequestMapping("/")
public class CalculatorController {
	
	@GetMapping
	public String getHome() {
		return "home";
	}
	
	@PostMapping("/run")
	public ModelAndView run(Calculator calculator) {

		double result = calculator.run();
		System.out.println(result);
		return new ModelAndView("result","kq",result);
	}
}
