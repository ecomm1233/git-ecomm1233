package com.springex;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springex/Beans1.xml");
		EmployeeDao e=(EmployeeDao) context.getBean("edao");
		
		/*
		int status = e.saveEmployee(new Employee(32,"Ravi",110,"MSE"));
		System.out.println("Status = "+status);
		
		boolean res=e.saveEmployeeByPreparedStatement(new Employee(34,"Madhu",60,"Asst MGR"));
		System.out.println("Response of insert is"+res);
		
		
		List<Employee> list=e.getAllEmployees();
		for(Employee emp:list){
			System.out.println(emp);
		}
		*/
		
		List<Employee> list=e.getAllEmployeesRowMapper();
		for(Employee emp:list){
			System.out.println(emp);
		}
		
		
		/*
		EmpDao empDao=(EmpDao) context.getBean("empdao");
		
		empDao.save(new Employee(35,"Madhav",100,"PM"));
		System.out.println("Success");
		
		empDao.updateEmp(new Employee(35,"Madhav",100,"PM"));
		System.out.println("row updated");
		*/
	}

}
