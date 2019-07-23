package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.LoginSafetyKuvrrBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.Read_Write_Excel;

public class LoginSafetyKuvrr extends Base {
	LoginSafetyKuvrrBL loginSKbl=PageFactory.initElements(driver, LoginSafetyKuvrrBL.class);


	@BeforeMethod

	public void launchSK() throws IOException {

		//opendriver();
		chromeDriver();
		Read_Write_Excel readexcel= new Read_Write_Excel();
	    String url=readexcel.appURL();
		driver.get(url);		
		
	}

	@Test

	public void TestLoginSafetyKuvrr() throws IOException {
		
		
		loginSKbl.login();

	}

	@AfterMethod

	public void closeBrowser() {

//	driver.quit();
	}

}
