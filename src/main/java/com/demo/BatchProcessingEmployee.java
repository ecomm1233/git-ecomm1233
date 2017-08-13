package com.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BatchProcessingEmployee {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		
		cfg.configure("com/demo/hibernate.cfg.xml");
		
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx=null;
		
		tx=session.beginTransaction();
		
		tx.setTimeout(10);
		System.out.println(tx.getTimeout());
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=10;i++){
			
			System.out.println("Enter employee details");
			System.out.println();
			System.out.println("Employee Id: ");
			Integer Id = sc.nextInt();
			System.out.println("Employee Name: ");
			String ename=sc.next();
			System.out.println("Employee Department: ");
			Integer dept = sc.nextInt();
			System.out.println("Employee Job: ");
			String job= sc.next();
			
			Employees emp=new Employees();
			emp.seteId(Id);
			emp.setEname(ename);
			emp.setDeptId(dept);
			emp.setJob(job);
			
			session.save(emp);
			if(i%3 == 0){
				session.flush();
				session.clear();
				System.out.println("session flushed");
			}
			
		}
		tx.commit();
		session.close();
		

	}

}
