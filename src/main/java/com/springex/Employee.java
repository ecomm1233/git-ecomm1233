package com.springex;


import javax.persistence.Id;

public class Employee {
	
		private int id;
		private String name;
		private int deptId;
		private String job;
		//private Address address;
		
		
		public Employee(){
			System.out.println("Default Constructor");
		}
		
		
		public Employee(String name, int deptId, String job) {
			super();
			this.name = name;
			this.deptId = deptId;
			this.job = job;
		}


		public Employee(int id, String name, int deptId, String job) {
			
			this.id = id;
			this.name = name;
			this.deptId = deptId;
			this.job = job;
		}

		@Override
		public String toString() {
			
			return id+" "+name+" "+deptId+" "+job;
		}

		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

		void show(){
			System.out.println("Employee id: "+id+" and Name: "+name);
			//System.out.println("Address : "+address.toString());
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

			
}
