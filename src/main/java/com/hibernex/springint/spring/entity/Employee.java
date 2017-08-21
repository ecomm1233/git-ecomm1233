package com.hibernex.springint.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
@NamedQuery(name = "Employee.selectAll", query = "Select e from Employee e")
public class Employee {

		@Id
		@GeneratedValue
		private int id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="salary")
		private double salary;
		
		
		public Employee() {
			
		}		
		
			
		public Employee(String name, double salary) {
			super();
			this.name = name;
			this.salary = salary;
		}


		public Employee(int id, String name, double salary) {
			
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
}
