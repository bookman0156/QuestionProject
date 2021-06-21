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
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		List<Problem> list = repository.findAll();
		mav.addObject("data",list);
		mav.setViewName("index");
				
		return mav;
	}
}
