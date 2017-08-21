package com.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.Employees;
import com.springex.Employee;
import com.springex.EmployeeDao;


@Controller
public class EmpController {
	
	@Autowired
	 EmployeeDao empdao;
	
	@RequestMapping("/empform")
	public ModelAndView showForm(){
		  //command is a reserved request attribute name, now use <form> tag to show object data  
		return new ModelAndView("empform","command",new Employees());
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("employees")Employees employees){
		//write code to save emp object  
        //here, we are displaying emp object to prove emp has data  
		Integer newId = empdao.getMaxEmpId();
		Employee emp=new Employee(newId.intValue()+1,employees.getEname(),employees.getDeptId(),employees.getJob());
		System.out.println(emp.toString());
		empdao.saveEmployee(emp);
		System.out.println(employees.getEname()+"  "+employees.getDeptId()+"  "+employees.getJob());
		
		//return new ModelAndView("empform","command",employees);//will display object data  
		return new ModelAndView("redirect:/viewemp");
	}
	
	@RequestMapping(value="/editemp/{id}")
	public ModelAndView edit(@PathVariable int id){
			
		Employee emp = empdao.getEmployeeById(id);
	
		System.out.println(emp.getName()+"  "+emp.getDeptId()+"  "+emp.getJob());
		
		return new ModelAndView("empeditform","command",emp);
	}
	
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public ModelAndView edit(@ModelAttribute("employee")Employee employee){
		System.out.println(employee.toString());
		//Employee emp=new Employee(employees.geteId(),employees.getEname(),employees.getDeptId(),employees.getJob());
	
		empdao.updateEmployee(employee);
		//System.out.println(employees.getEname()+"  "+employees.getDeptId()+"  "+employees.getJob());
		
		return new ModelAndView("redirect:/viewemp");
	}
	
	
	@RequestMapping(value="/deleteemp/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		
		empdao.deleteEmployee(id);
		System.out.println("deleting employee id "+id);
		
		return new ModelAndView("redirect:/viewemp");
	}
	
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		System.out.println("Inside view Emp");
		
		List<Employee> list= empdao.getAllEmployees();//new ArrayList<Employees>();  
       // list.add(new Employees(1,"rahul",100,"S.Engineer"));  
       // list.add(new Employees(2,"aditya",110,"IT Manager")); 
		return new ModelAndView("viewemp","list",list);
		
	}
}
