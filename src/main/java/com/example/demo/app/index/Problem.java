package com.example.demo.app.index;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Problem {
	@Id
	@Column(name="id", nullable = false)
	private int id;
	@Column(name="question", nullable = false)
	private String problem;
	@Column(name="choice1", nullable = false)
	private String select_1;
	@Column(name="choice2", nullable = false)
	private String select_2;
	@Column(name="choice3", nullable = false)
	private String select_3;
	@Column(name="choice4", nullable = false)
	private String select_4;
	@Column(name="answer", nullable = false)
	private String answer;
	@Column(name="question_type", nullable = false)
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getSelect_1() {
		return select_1;
	}
	public void setSelect_1(String select_1) {
		this.select_1 = select_1;
	}
	public String getSelect_2() {
		return select_2;
	}
	public void setSelect_2(String select_2) {
		this.select_2 = select_2;
	}
	public String getSelect_3() {
		return select_3;
	}
	public void setSelect_3(String select_3) {
		this.select_3 = select_3;
	}
	public String getSelect_4() {
		return select_4;
	}
	public void setSelect_4(String select_4) {
		this.select_4 = select_4;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
