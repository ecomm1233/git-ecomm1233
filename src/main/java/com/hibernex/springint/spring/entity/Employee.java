package com.hibernex.springint.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="salary")
		private double salary;
		
		@Column(name="designation")
		private String designation;
		
		
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
		
		public Employee(String name, double salary, String designation) {
		
			this.name = name;
			this.salary = salary;
			this.designation = designation;
		}

		public Employee(int id, String name, double salary, String designation) {
		
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.designation = designation;
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


		public String getDesignation() {
			return designation;
		}


		public void setDesignation(String designation) {
			this.designation = designation;
		}


		@Override
		public String toString() {
			
			return id+"  "+name+" "+salary+" "+designation;
		}
		
		
		
}
