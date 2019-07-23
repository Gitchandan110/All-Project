package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.LoginSafetyKuvrrBL;
import com.BussinessFlow.file.SafetyKuvrrBroadcastBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.Read_Write_Excel;

public class SafetyKuvrrBroadcast extends Base{
	SafetyKuvrrBroadcastBL broadcastbl=PageFactory.initElements(driver, SafetyKuvrrBroadcastBL.class);
	LoginSafetyKuvrrBL loginSafetyKuvrrBL=PageFactory.initElements(driver, LoginSafetyKuvrrBL.class);
	
	@BeforeMethod
	
	public void launchSKApp() throws InterruptedException, IOException {
		
		opendriver();
		Read_Write_Excel readexcel= new Read_Write_Excel();
		String url=readexcel.appURL();
		driver.get(url);
		Thread.sleep(5000);
	
		
			
	}
	
	
    @Test(priority=1)
	
	public void launchSafetyApp() throws IOException {
		
		loginSafetyKuvrrBL.login();
		broadcastbl.verifyBroadcastBtn();
		broadcastbl.verifyBroadcastMessage();
		broadcastbl.verifyBtnSubmit();
	//	broadcastbl.verifyBtnCancel();
		
    }
		

	
	
	@AfterMethod
	
	public void closeBrowser() {
		
		driver.quit();
	}
	

}
