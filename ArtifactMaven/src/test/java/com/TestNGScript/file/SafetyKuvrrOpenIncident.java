package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.LoginSafetyKuvrrBL;
import com.BussinessFlow.file.SafetyKuvrrOpenIncidentBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.Read_Write_Excel;

public class SafetyKuvrrOpenIncident extends Base {
	
	SafetyKuvrrOpenIncidentBL openIncidentbl=PageFactory.initElements(driver, SafetyKuvrrOpenIncidentBL.class);
	LoginSafetyKuvrrBL loginSafetyKuvrrBL=PageFactory.initElements(driver, LoginSafetyKuvrrBL.class);
	
	@BeforeMethod
	
	public void launchSKApp() throws InterruptedException, IOException {
		
		opendriver();
	//	chromeDriver();
		Read_Write_Excel readexcel= new Read_Write_Excel();
		String url=readexcel.appURL();
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		By Email=By.cssSelector("input[type='text'][id='email']");
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(Email));
	    System.out.println("Found WebElement Email");
		
			
	}
	
	  @Test(priority=1)
		
		public void launchSafetyApp() throws IOException, InterruptedException {
			
			loginSafetyKuvrrBL.login();
			openIncidentbl.verifyOpenIncident();
   
}
	  
}