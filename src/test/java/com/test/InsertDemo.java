package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.h2.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		
		String qry="insert into employee values(1,'ankita',110,'IT_PROG')";
		
		Statement stmt=con.createStatement();
		stmt.execute(qry);
		System.out.println("Recored inserted");

		/*
		//Statement stmt= con.
		PreparedStatement pstmt= con.prepareStatement("Insert into Employee(EID,ENAME,DEPTID,JOB) values ");
		*/
	}

}
