package com.example.demo.app.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.app.index.Repository.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository repository;
	
	//
	// 問題の種類が一致しているデータを取得する
	//
	public List<Question> find_QuestionType(String type) {
		return repository.findType(type);
	}
	
	//
	// 問題の種類が一致しているデータを取得したい数だけ取得する
	//
	public List<Question> find_QuestionType(String type,int num) {
		Pageable limit = PageRequest.of(0, num);
		return repository.findType(type,limit);
	}
	
}
