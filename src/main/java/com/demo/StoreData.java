package com.demo;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

public class StoreData {  
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
        
  Employees e1=new Employees();  
  e1.seteId(3);
  e1.setEname("Rupa");
  e1.setDeptId(100);
  e1.setJob("AsstMgr");
    
  session.persist(e1);//persisting the object  
    
  t.commit();//transaction is commited  
  session.close();  
    
  System.out.println("successfully saved");  
    
}  
}  
