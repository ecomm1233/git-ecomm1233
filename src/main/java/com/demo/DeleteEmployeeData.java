package com.demo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployeeData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("com/demo/hibernate.cfg.xml");
		
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx= null;
		
		tx=session.beginTransaction();
		
		Employees employee = session.get(Employees.class, 1);
		
		session.delete(employee);
		
		/*
		Query query=session.createQuery("delete from Employees where eid = :id");
		query.setParameter("id", 1);
		
		int result = query.executeUpdate();
		
		if(result>0){
			System.out.println(result+" Rows deleted");
		}*/
		tx.commit();

		System.out.println("Successfully Deleted");
		session.close();
	}

}
