package com.appium.commonutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMySQL {
	
	
	

	public static ResultSet executeQuery(String qry) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("mysql jdbc driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kuvrr","root","");
		System.out.println("Connected to MySQL DB");
		Statement smt=con.createStatement();
		System.out.println("Created DB Statement");
		ResultSet rs=smt.executeQuery(qry);
		return rs;
		
	}

}
