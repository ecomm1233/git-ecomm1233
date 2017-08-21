package com.demo.beans;

public class Employees {

	int eId;
	String Ename;
	int DeptId;
	String Job;	
	
	public Employees() {
		
	}
	
	
	public Employees(int eId, String ename, int deptId, String job) {
		
		this.eId = eId;
		Ename = ename;
		DeptId = deptId;
		Job = job;
	}


	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}	
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getDeptId() {
		return DeptId;
	}
	public void setDeptId(int deptId) {
		DeptId = deptId;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
		
}
