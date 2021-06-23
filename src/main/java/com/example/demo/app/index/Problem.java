package com.example.demo.app.index;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Problem {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="question")
	private String question;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return question;
	}
	public void setName(String question) {
		this.question = question;
	}
}
