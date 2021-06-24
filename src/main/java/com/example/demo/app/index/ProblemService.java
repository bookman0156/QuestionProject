package com.example.demo.app.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.index.Repository.ProblemRepository;

@Service
public class ProblemService {
	@Autowired
	private ProblemRepository repository;
	
	public List<Problem> find_ProblemType(String type) {
		return repository.findType(type);
	}
}
