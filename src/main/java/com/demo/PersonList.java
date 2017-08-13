package com.demo;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class PersonList {

	
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
				
			  List person=session.createQuery("from Person").list();
			  
			  Iterator itr = person.iterator();
			  
			  while(itr.hasNext()){
				  
				  Person p = (Person) itr.next();
				  
				  System.out.println("Person Id: "+p.getId());
					
				  System.out.println("Person Name: "+p.getName());
				  
			  }
			  
			    
			  t.commit();
			  session.close();  
			    
			  
			    
			}  
}  


