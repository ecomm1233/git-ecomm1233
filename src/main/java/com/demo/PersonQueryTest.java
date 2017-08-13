package com.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonQueryTest {

	public static void main(String[] args) {
		
		//creating configuration object  
		  Configuration cfg=new Configuration();  
		  cfg.configure("com/demo/hibernate.cfg.xml");//populates the data of the configuration file  
		    
		  //creating seession factory object  
		  SessionFactory factory=cfg.buildSessionFactory();  
		    
		  //creating session object  
		  Session session=factory.openSession();  
		    
		 
		

		 Query query = session.getNamedQuery("findPersonById");
		 query.setInteger("id", 20);
		 List rs=query.list();
		 
		 Iterator itr1=rs.iterator();
		 while(itr1.hasNext()){
			 	
			 	Person p = (Person) itr1.next();
				
				System.out.println("Person Id: "+p.getId());
				
				System.out.println("Person Name: "+p.getName());
		 }
		 
		 session.close();

	}

}
