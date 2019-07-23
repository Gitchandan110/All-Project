package com.BussinessFlow.file;


import java.io.IOException;
import java.util.ArrayList;

import com.Commonutills.file.Base;
import com.Commonutills.file.ReadExcelColumn;
import com.PageObjectRepository.file.LoginSafetyKuvrrPL;

public class LoginSafetyKuvrrBL extends LoginSafetyKuvrrPL {
	
	
	
	public void login() throws IOException {
		
		ArrayList<String> Email;
		ArrayList<String> Password;
		ReadExcelColumn readExcel=new ReadExcelColumn();
		Email=readExcel.readExcel(1);
		Password=readExcel.readExcel(2);
		try {
		
	if (Email().isDisplayed()==true && Password().isDisplayed()==true) {
		
	
		Email().clear();
		Email().click();
		Base.highLightElement(driver, Email());
		System.out.println("Email field found");
		
		for(int i=0; i<Email.size();i++) {
		
		Email().sendKeys(Email.get(i));
		Password().click();
		Password().clear();
		Base.highLightElement(driver, Password());
		System.out.println("Password field found");
		Password().sendKeys(Password.get(i));
		BtnContinue().click();
	}
	}
	else {
		
		System.out.println("Email and Password field is not found");
	}
				
		}	catch (Exception ex)	{
			
			System.out.println("Exception in Login functionality :" + ex.getStackTrace());
			System.out.println("Exception in Login functionality :" + ex.getMessage());
		}
	}

}
