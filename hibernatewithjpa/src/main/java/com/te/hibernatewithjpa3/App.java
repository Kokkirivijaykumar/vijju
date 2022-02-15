package com.te.hibernatewithjpa3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		Question q = new Question();
		q.setQuestionId(1);
		q.setQuestion("What is love");
		

		Answers a = new Answers();
		a.setAnswerId(12);
		a.setAnswer("combination of two hearts");
		q.setAnswers(a);
		a.setQuestion(q);
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Balaya_Hostels");
		EntityManager manager = factory.createEntityManager();
	  EntityTransaction trans = manager.getTransaction();
	  trans.begin();
		
		manager.persist(a);
		manager.persist(q);
		
		trans.commit();
		manager.close();

//		Question q2=new Question();
//		q2.setQuestionId(24);
//      q2.setQuestion("what is java");
//      
//      Answers a2 = new Answers();
//    a2.setAnswerId(34);
//    a2.setAnswer("mind confusion language");
//    q2.setAnswers(a2);
//    a2.setQuestion(q2);
	}
	

}
