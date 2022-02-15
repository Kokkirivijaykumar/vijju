package com.te.hibernatewithjpa3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Answers {
    @Id
	private int answerId;
	private String answer;
	@OneToOne
	private Question question;
	
	
	public Answers(int answerId, String answer, Question question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}


	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAnswerId() {
		return answerId;
	}


	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}


	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", answer=" + answer + ", question=" + question + "]";
	}
	
	
}
