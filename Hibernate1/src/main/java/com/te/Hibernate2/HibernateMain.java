package com.te.Hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		//insert data
//		session.save(new HibernateSecond(2,"SWAMY"));
////		
//////		//fetch
//		HibernateSecond h =session.find(HibernateSecond.class,1);
//	System.out.println(h);
//	
	//update
//	HibernateSecond hi =session.find(HibernateSecond.class,1);
//	hi.setName("VIJJU");
//	session.merge(hi);
//		
		// delete
//		
//		HibernateSecond hr=session.find(HibernateSecond.class,2);
//		session.delete(hr);
	
	
	HibernateSecond hello = new HibernateSecond();
//	hello.setId(10);
//	hello.setName("Neeraj");
//	
//	   session.save(hello);
	
	
	//System.out.println(hello);
		
		trans.commit();
		session.close();

	}
}
