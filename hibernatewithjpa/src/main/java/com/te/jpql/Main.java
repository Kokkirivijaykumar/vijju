package com.te.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernatewithjpa.Room;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Balaya_Hostels");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
//
//		Employees emp = new Employees(101, "Lokesh", "67895433221");
//		manager.persist(emp); //add employess
//
//		manager.getTransaction().commit();
	
//	Employees emp1=manager.find(Employees.class, 104);
//	System.out.println(emp1);//find employee
//		
//		Employees em = manager.find(Employees.class,101);
//		 manager.remove(em);
//		manager.getTransaction().commit();//delete employee
//		
////	

//	
	String jpql="FROM Employees";
	Query query=manager.createQuery(jpql);
	List<Employees> room=query.getResultList();//get all employees details
	
	  for(Employees r:room) {
		
	  System.out.println(r.getId()+","+r.getName()+","+r.getPhoneNumber());
	  }
		manager.close();

	}

}
