package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		
		
		//step1 load the driver
		
		Class.forName("org.h2.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		
		String createQuery ="CREATE TABLE EMPLOYEE(EID int, ENAME varchar2(20),DEPTID int,JOB varchar2(10))";
		
		Statement stmt= con.createStatement();
		
		stmt.execute(createQuery);
		
	}
		
		
}
