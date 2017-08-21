package com.hibernex.springint.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hibernex.springint.spring.config.AppConfig;
import com.hibernex.springint.spring.entity.Employee;
import com.hibernex.springint.spring.service.EmployeeService;

public class MainApp {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		EmployeeService empService=context.getBean(EmployeeService.class);
		
		//empService.saveEmployee(new Employee("Jyoti",25000));
		
		/*empService.saveEmployee(new Employee("Rupa",15000));
		empService.saveEmployee(new Employee("Chanda",25000));
		empService.saveEmployee(new Employee("Kiran",18000));
		empService.saveEmployee(new Employee("Madhu",35000));
		empService.saveEmployee(new Employee("Bihari",45000));
		
		
		empService.deleteEmployee(6);
		System.out.println("Record Deleted");
		System.out.println();
		*/
		
		//int noOfRowsUpdated = empService.updateSalary(7);
		//System.out.println("Record Updated :"+noOfRowsUpdated);
		System.out.println();
		
		
		System.out.println("Maximum Employee Salary is = "+empService.getMaxEmployeeSalary());
		System.out.println();
		
		
		System.out.println();
		System.out.println("Salary of Employee id  10 is = "+empService.getSalaryById(10).getSalary());
		System.out.println();
		
		List<Employee> empList=empService.getAllEmployees();
		
		for(Employee emp:empList){
			System.out.println("Employee Id ="+emp.getId());
			System.out.println("Name = "+emp.getName());
			System.out.println("Salary = "+emp.getSalary());
			System.out.println();
		}
		context.close();
		
	}

}
