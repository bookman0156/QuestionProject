package com.example.demo.app.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionService service;
	
	@RequestMapping(value = "/problempage",method = RequestMethod.GET)
	public ModelAndView get_ProblemData(ModelAndView mav) {
		
		mav = Data();
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping(value = "/answerpage",method = RequestMethod.GET)
	public ModelAndView get_AnserData(ModelAndView mav) {
		
		mav = Data();		
		mav.setViewName("answer");
				
		return mav;
	}
	
	private ModelAndView Data() {
		ModelAndView model = new ModelAndView();
		List<Question> list_java = service.find_QuestionType("JAVA",3);
		List<Question> list_php = service.find_QuestionType("PHP");
		List<Question> list_sql = service.find_QuestionType("SQL");
		
		model.addObject("data_java",list_java);
		model.addObject("data_php",list_php);
		model.addObject("data_sql",list_sql);
		return model;
	}
}
