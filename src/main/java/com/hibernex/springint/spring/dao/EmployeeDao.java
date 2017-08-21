package com.hibernex.springint.spring.dao;

import java.util.List;

import com.hibernex.springint.spring.entity.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee e);
	
	//Method to delete Employee
	public void deleteEmployee(int id);
	
	public int updateSalary(int id);
	
	//Method to return all employees
	public List<Employee> getAllEmployees();
	
	public Double getMaxEmployeeSalary();
	
	public Employee getSalaryById(int id);
		
}
