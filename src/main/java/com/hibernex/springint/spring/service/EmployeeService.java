package com.hibernex.springint.spring.service;

import java.util.List;

import com.hibernex.springint.spring.entity.Employee;

public interface EmployeeService {

	 void saveEmployee(Employee e);
	
	//Method to delete Employee
	void deleteEmployee(int id);
	
	public int updateSalary(int id);
	public Double getMaxEmployeeSalary();
	
	public Employee getSalaryById(int id);
	
	//Method to return all employees
	List<Employee> getAllEmployees();

	Integer getMaxEmpId();

	Employee getEmployeeById(int id);

	int updateEmployee(Employee employee);
	
	
}
