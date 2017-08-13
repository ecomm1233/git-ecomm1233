package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployeeData {

	public static void main(String[] args) {
		
		Configuration config= new Configuration();
		
		config.configure("com/demo/hibernate.cfg.xml");
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx=null;
		
		tx= session.beginTransaction();
		
		Employees employee = session.get(Employees.class, 2);
		
		employee.setJob("Manager");
		
		session.update(employee);
		
		tx.commit();

		System.out.println("Successfully Updated");
		session.close();
	}

}
