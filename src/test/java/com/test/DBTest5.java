package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		
		String query="Delete from employee where eid=4";

		Statement stmt= con.createStatement();
		
		stmt.execute(query);
		
		System.out.println("Record Deleted");

	}

}
