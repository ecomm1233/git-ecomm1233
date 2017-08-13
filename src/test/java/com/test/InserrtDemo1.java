package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserrtDemo1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("org.h2.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		
		String insertQuery = "insert into employee values (?,?,?,?)";
		
		PreparedStatement pstmt= con.prepareStatement(insertQuery);
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Employee Id: ");
		pstmt.setInt(1, sc.nextInt());
		System.out.println("Enter Employee Name: ");
		pstmt.setString(2, sc.next());
		System.out.println("Enter Dept Id: ");
		pstmt.setInt(3, sc.nextInt());
		System.out.println("Enter Job: ");
		pstmt.setString(4, sc.next());
		
		pstmt.executeUpdate();
		
		System.out.println("Record added");
		
	}

}
