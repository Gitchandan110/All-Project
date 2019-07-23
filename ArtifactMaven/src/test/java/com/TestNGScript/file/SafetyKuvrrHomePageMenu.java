package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.LoginSafetyKuvrrBL;
import com.BussinessFlow.file.SafetyKuvrrHomePageMenuBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.Read_Write_Excel;

public class SafetyKuvrrHomePageMenu extends Base{
	
	SafetyKuvrrHomePageMenuBL homePageMenuBL=PageFactory.initElements(driver, SafetyKuvrrHomePageMenuBL.class);
	LoginSafetyKuvrrBL loginSafetyKuvrrBL=PageFactory.initElements(driver, LoginSafetyKuvrrBL.class);
	
	
	
	@BeforeMethod
	
	public void launchApp() throws IOException {
		
		opendriver();
		Read_Write_Excel readexcel= new Read_Write_Excel();
		String url=readexcel.appURL();
		driver.get(url);
		loginSafetyKuvrrBL.login();
		
	}
	
	
	
	@Test(priority=1)
	
	public void TestHambugerMenuClick() throws InterruptedException {
		
		homePageMenuBL.verifyHamburgerMenu();
		
		homePageMenuBL.VerifyOrganizationlink();
		
		
	}
	

}
