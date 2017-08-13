package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.h2.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		
		String query="Update employee set job='Manager' where eid=4";

		Statement stmt= con.createStatement();
		
		stmt.execute(query);
		
		System.out.println("Record Updated");
	}

}
