package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rikkei.academy.service.DictionaryService;

@Controller
@RequestMapping("/")
public class DictionaryController {
	
	@Autowired
	private DictionaryService dictionaryService;
	
	@GetMapping
	public String home() {
		return "home";
	}
	
	@PostMapping("/search")
	public ModelAndView getResultBySearch(@RequestParam("search") String text) {
		String result = dictionaryService.getValue(text.toLowerCase());
		System.out.println(result);
		return new ModelAndView("result","kq",result);
	}
}
