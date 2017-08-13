package com.demo;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.Iterator;
import java.util.List;

public class GetEmployeeData {

	public static <R> void main(String[] args) {
		//Creating configuration object
		
		Configuration cfg=new Configuration();
		cfg.configure("com/demo/hibernate.cfg.xml");
		
		//Creating Session factory object		
		SessionFactory factory=cfg.buildSessionFactory();
		
		//Creating Session Object
		Session session= factory.openSession();
		
		//Creating Transaction Object
		Transaction tx= session.beginTransaction();
		
		List employees = session.createQuery("FROM Employees").list();
		
		Iterator itr = employees.iterator();
		
		for(;itr.hasNext();){
			
			Employees emp= (Employees) itr.next();
			
			System.out.println("\nEmployee Id: "+emp.geteId());
			
			System.out.println("Employee Name: "+emp.getEname());
			
			System.out.println("Department Id: "+emp.getDeptId());
			
			System.out.println("Job : "+emp.getJob());
			
		}
		System.out.println("Records retrieved");
		
		//employees = session.createQuery("FROM Employees").list();
		Criteria cr= session.createCriteria(Employees.class);
		
		Criterion deptId= Restrictions.eq("DeptId", 90);
		
		Criterion jobId = Restrictions.eq("Job", "Manager");
		
		LogicalExpression lg = Restrictions.or(deptId, jobId);
		cr.add(lg);
		cr.addOrder(Order.asc("eId"));	
		List results=cr.list();
		
		Iterator itr1 = results.iterator();
		System.out.println("Results of logical or condition: ");
		
		while(itr1.hasNext()){
			
			Employees emp= (Employees) itr1.next();
			
			System.out.println("\nEmployee Id: "+emp.geteId());
			
			System.out.println("Employee Name: "+emp.getEname());
			
			System.out.println("Department Id: "+emp.getDeptId());
			
			System.out.println("Job : "+emp.getJob());
			
		}
		
		Criteria crt=session.createCriteria(Employees.class);
		crt.addOrder(Order.desc("eId"));
		
		List lst = crt.list();
		Iterator itr2 = lst.iterator();
		System.out.println("Results of Order by: ");
		
		while(itr2.hasNext()){
			
			Employees emp= (Employees) itr2.next();
			
			System.out.println("\nEmployee Id: "+emp.geteId());
			
			System.out.println("Employee Name: "+emp.getEname());
			
			System.out.println("Department Id: "+emp.getDeptId());
			
			System.out.println("Job : "+emp.getJob());
			
		}
		
		tx.commit();
		
		session.close();
		
		
		
		
	}



	
}