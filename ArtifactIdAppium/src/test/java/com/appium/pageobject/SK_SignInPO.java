package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_SignInPO extends Base{
	
	
	public MobileElement Email() {
		
		
	By emailId=By.id("com.safety.armourgrid:id/login_edit_email");	
		
	return driver.findElement(emailId);
		
		
	}
	
	
	
	public MobileElement Password() {
		
		By password=By.id("com.safety.armourgrid:id/login_edit_password");
		
		return driver.findElement(password);
		
		
	}
	
	
	public MobileElement Submit() {
		
		By submit=By.id("com.safety.armourgrid:id/login_button_submit");
		return driver.findElement(submit);
		
		
	}
	
	public MobileElement ForgetPassword() {
		
		By forgetPassword=By.id("com.safety.armourgrid:id/login_button_forgot_password");
		return driver.findElement(forgetPassword);
		
	}

}
