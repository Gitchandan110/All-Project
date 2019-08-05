package com.appium.AppScripts;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.appium.commonutils.ExcelUtils;
import com.appium.commonutils.ConnectMySQL;

public class RunSQLQuery {
	
	ConnectMySQL mysql;
	ExcelUtils excel;
	
//	@Test(priority=1)
	public String expectedFirstName() throws ClassNotFoundException, SQLException {
		
		String qry = "select FirstName from users where LastName='kumarrr';";
		ResultSet rset= mysql.executeQuery(qry);
		if(rset.next()) {
			return rset.getString("FirstName");
		}
		return null;
	}
	
	
	//@Test(priority=2)
	
	public String actualFirstName() throws IOException {
		
	//System.out.println("Excel Data is " +excel.ReadExcel("TestData", 2, 0));
		return excel.ReadExcel("TestData", 2, 0);
		
	}

	@Test(priority=3)
	public void compareData() {
		
		try {
			System.out.println("actualFirstName():::"+actualFirstName());
			System.out.println("expectedFirstName():::"+expectedFirstName());
			System.out.println(actualFirstName().trim().equals(expectedFirstName().trim()));	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
