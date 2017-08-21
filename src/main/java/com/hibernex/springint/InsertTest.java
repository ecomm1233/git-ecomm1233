package com.hibernex.springint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernex.springint.spring.dao.EmployeeDao;
import com.hibernex.springint.spring.entity.Employee;

public class InsertTest {

	public static void main(String[] args) { 
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext1.xml");
		
		EmployeeDao edao = (EmployeeDao) context.getBean("empd");
		
		edao.saveEmployee(new Employee(101,"Gopal",5000));

	}

}
