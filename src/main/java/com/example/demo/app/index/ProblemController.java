package com.example.demo.app.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.app.index.Repository.ProblemRepository;

@Controller
public class ProblemController {

	@Autowired
	private ProblemRepository repository;
	
	@RequestMapping(value = "/problem",method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		List<Problem> list_java = repository.findType("JAVA");
		List<Problem> list_php = repository.findType("PHP");
		List<Problem> list_sql = repository.findType("SQL");
		
		mav.addObject("data_java",list_java);
		mav.addObject("data_php",list_php);
		mav.addObject("data_sql",list_sql);
		
		mav.setViewName("index");
		
		
		return mav;
	}
}
