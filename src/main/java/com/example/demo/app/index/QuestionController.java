package com.example.demo.app.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionService service;
	
	private int java_num = 3;
	private int php_num = 2;
	
	
	public List<Question> list_java,list_php,list_sql;
	
	//
	// 問題のデータをviewに渡す	
	//
	@RequestMapping(value = "/questionpage")
	public ModelAndView Questionspage(ModelAndView mav) {
		
		mav = Data();
		mav.setViewName("index");
		
		return mav;
	}
	
	//
	// 解答した値と正答数をviewに渡す	
	//
	@RequestMapping(value = "/answer",method = RequestMethod.POST)
	public ModelAndView Answerspage(ModelAndView mav ,@ModelAttribute("answerForm")AnswerForm form) {
		
		mav = Data();		
		Score java = new Score();
		Score php = new Score();
		int java_score = java.getScore(java_num, form, list_java, "java");
		int php_score = php.getScore(php_num, form, list_php, "php");
		int add_score = java_score + php_score;
		int add_num = java_num + php_num;
		
		mav.addObject("post_java",form.getSelectJava());
		mav.addObject("post_php",form.getSelectPHP());
		mav.addObject("java_score",java_score);
		mav.addObject("php_score",php_score);
		mav.addObject("score", add_score);
		mav.addObject("java_num", java_num);
		mav.addObject("php_num", php_num);
		mav.addObject("num", add_num);
		
		mav.setViewName("answer");
		
		return mav;
	}
	
	//
	// 問題データの取得	
	//	
	private ModelAndView Data() {
		ModelAndView model = new ModelAndView();
		list_java = service.find_QuestionType("JAVA",java_num);
		list_php = service.find_QuestionType("PHP",php_num);
		list_sql = service.find_QuestionType("SQL");
		
		model.addObject("data_java",list_java);
		model.addObject("data_php",list_php);
		model.addObject("data_sql",list_sql);
		return model;
	}

}
