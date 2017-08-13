package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("org.h2.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		
		String query="Select * from employee";

		Statement stmt= con.createStatement();
		
		ResultSet rs= stmt.executeQuery(query);
		
		while(rs.next()){
			
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			
		}
	}

}
