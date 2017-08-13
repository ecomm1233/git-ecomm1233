package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fasterxml.classmate.AnnotationConfiguration;

public class PersonTest {

	public static void main(String[] args) {
		 
		  //creating configuration object  
		  Configuration cfg=new Configuration();  
		  cfg.configure("com/demo/hibernate.cfg.xml");//populates the data of the configuration file  
		    
		  //creating seession factory object  
		  SessionFactory factory=cfg.buildSessionFactory();  
		    
		  //creating session object  
		  Session session=factory.openSession();  
		    
		  //creating transaction object  
		  Transaction t=session.beginTransaction();  
			
		
		
		Person p=new Person();
		p.setId(20);
		p.setName("Ankita");
		    
		  session.persist(p);//persisting the object  
		    
		  t.commit();//transaction is commited  
		  session.close();  
		    
		  System.out.println("successfully saved");  
		    
		}  
		}  
