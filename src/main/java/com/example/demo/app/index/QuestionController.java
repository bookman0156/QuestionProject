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
	
	private int gitcommand_num = 3;
	private int htmlcss_num = 3;
	private int php_num = 3;
	private int sql_num = 3;
	
	
	public List<Question> list_gitcommand,list_htmlcss,list_php,list_sql;
	
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
		Score php = new Score();
		Score sql = new Score();
		Score gitcommand = new Score();
		Score htmlcss = new Score();
		int php_score = php.getScore(php_num, form, list_php, "php");
		int sql_score = sql.getScore(sql_num, form, list_sql, "sql");
		int gitcommand_score = gitcommand.getScore(gitcommand_num, form, list_gitcommand, "command");
		int htmlcss_score = htmlcss.getScore(htmlcss_num, form, list_htmlcss, "html");
		int add_score = php_score + sql_score + gitcommand_score + htmlcss_score;
		int add_num = php_num + sql_num + gitcommand_num + htmlcss_num;
		
		mav.addObject("post_php",form.getSelectPHP());
		mav.addObject("post_sql",form.getSelect_Sql());
		mav.addObject("post_gitcommand",form.getSelect_Command());
		mav.addObject("post_htmlcss",form.getSelect_Html());
		mav.addObject("php_score",php_score);
		mav.addObject("sql_score",sql_score);
		mav.addObject("gitcommand_score",gitcommand_score);
		mav.addObject("htmlcss_score",htmlcss_score);
		mav.addObject("score", add_score);
		mav.addObject("php_num", php_num);
		mav.addObject("sql_num", sql_num);
		mav.addObject("gitcommand_num", gitcommand_num);
		mav.addObject("htmlcss_num", htmlcss_num);
		mav.addObject("num", add_num);
		
		mav.setViewName("answer");
		
		return mav;
	}
	
	//
	// 問題データの取得	
	//	
	private ModelAndView Data() {
		ModelAndView model = new ModelAndView();
		list_gitcommand = service.find_QuestionType("GIT/CL",gitcommand_num);
		list_htmlcss = service.find_QuestionType("HTML/CSS",htmlcss_num);
		list_sql = service.find_QuestionType("SQL",sql_num);
		list_php = service.find_QuestionType("PHP",php_num);
		
		model.addObject("data_gitcommand",list_gitcommand);
		model.addObject("data_htmlcss",list_htmlcss);
		model.addObject("data_php",list_php);
		model.addObject("data_sql",list_sql);
		return model;
	}

}
