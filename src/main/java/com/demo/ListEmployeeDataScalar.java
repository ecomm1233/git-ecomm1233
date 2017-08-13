package com.demo;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javassist.bytecode.Descriptor.Iterator;

public class ListEmployeeDataScalar {

	public static void main(String[] args) {
		//Creating configuration object
		
				Configuration cfg=new Configuration();
				cfg.configure("com/demo/hibernate.cfg.xml");
				
				//Creating Session factory object		
				SessionFactory factory=cfg.buildSessionFactory();
				
				//Creating Session Object
				Session session= factory.openSession();
				
				//Creating Transaction Object
				Transaction tx= session.beginTransaction();
				/*
				 * To save employee object
				 */
				/*
				Employees emp = new Employees();
				emp.seteId(4);
				emp.setEname("Maya");
				emp.setDeptId(20);
				emp.setJob("TPO");
				
				Integer empId= (Integer) session.save(emp);
				System.out.println(empId+" Successfully saved");
				*/
				String sql="SELECT ename,job from EMPLOYEE";
				
				SQLQuery query=session.createSQLQuery(sql);
				
				query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
				
				List data = query.list();
				
												
				for(Object obj:data){
					Map row= (Map) obj;
					System.out.println("Employee Name: "+row.get("ENAME"));
					System.out.println("Job: "+row.get("JOB"));
				}
				
				tx.commit();
				session.close();
	}

}
