package com.example.demo.app.index.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.app.index.Problem;


public interface ProblemRepository extends JpaRepository<Problem, Integer> {

}
