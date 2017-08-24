package com.hibernex.springint.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernex.springint.spring.dao.EmployeeDao;
import com.hibernex.springint.spring.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao userDao;
	
	@Transactional
	public void saveEmployee(Employee e) {
		userDao.saveEmployee(e);
		
	}

	@Transactional
	public void deleteEmployee(int id) {
		userDao.deleteEmployee(id);
		
	}
	
	@Transactional
	public int updateSalary(int id) {
		return userDao.updateSalary(id);
		
	}

	@Transactional(readOnly=true)
	public List<Employee> getAllEmployees() {
		
		return userDao.getAllEmployees();
	}

	@Transactional(readOnly=true)
	public Double getMaxEmployeeSalary() {
		
		return userDao.getMaxEmployeeSalary();
	}

	public Employee getSalaryById(int id) {
		
		return userDao.getSalaryById(id);
	}
	
	@Transactional(readOnly=true)
	public Integer getMaxEmpId() {
		
		return userDao.getMaxEmpId();
	}

	public Employee getEmployeeById(int id) {
		
		return userDao.getEmployeeById(id);
	}

	@Transactional
	public int updateEmployee(Employee employee) {
		 return userDao.updateEmployee(employee);
		
	}

	

	
}
