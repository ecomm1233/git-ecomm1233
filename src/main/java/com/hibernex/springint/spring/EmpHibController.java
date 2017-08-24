package com.hibernex.springint.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hibernex.springint.spring.entity.Employee;
import com.hibernex.springint.spring.service.EmployeeService;


@Controller
public class EmpHibController {
	
		@Autowired
		private EmployeeService userDao;

		@RequestMapping("/empform1")
		public ModelAndView showForm(){
			return new ModelAndView("empform1","command",new Employee());
		}
		
		@RequestMapping(value="/saveEmp",method=RequestMethod.POST)
		public ModelAndView save(@ModelAttribute("employee")Employee employee){
			
			Integer newId = userDao.getMaxEmpId();
			//Employee emp=new Employee(newId.intValue()+1,employees.getEname(),employees.getDeptId(),employees.getJob());
			
			System.out.println(employee.toString());
			employee.setId(++newId);
			userDao.saveEmployee(employee);
			System.out.println(employee.getName()+"  "+employee.getSalary()+"  "+employee.getDesignation());
			
			return new ModelAndView("redirect:/viewemp1");
		}
		
		@RequestMapping(value="/viewemp1")
		public ModelAndView viewemp(){
			System.out.println("Inside view Employee");
			
			List<Employee> list= userDao.getAllEmployees();
	      
			return new ModelAndView("viewemp1","list",list);
			
		}
		
		@RequestMapping("/editemployee/{id}")
		public ModelAndView edit(@PathVariable int id){
			Employee e = userDao.getEmployeeById(id);
			
			return new ModelAndView("empeditform1","command",e);
		}
		
		@RequestMapping(value="/editempsave",method=RequestMethod.POST)
		public ModelAndView editempsave(@ModelAttribute("employee")Employee employee){
			 int count =userDao.updateEmployee(employee);
			System.out.println("No of Records updated of employees: "+count);
			return new ModelAndView("redirect:/viewemp1");
		}
		
		@RequestMapping(value="/deleteemployee/{id}",method=RequestMethod.GET)
		public ModelAndView deleteemployee(@PathVariable int id){
			userDao.deleteEmployee(id);
			System.out.println("Deleting record of Employee with id = "+id);
			
			return new ModelAndView("redirect:/viewemp1");
		}
}
