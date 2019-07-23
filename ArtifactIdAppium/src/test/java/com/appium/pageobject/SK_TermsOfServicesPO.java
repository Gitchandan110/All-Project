package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_TermsOfServicesPO extends Base {
	
	
	public MobileElement AcceptTerms() {
		
	//	MobileElement acceptTerms=driver.findElement(By.id("com.safety.armourgrid:id/confirm"));
		
		By selectTerms=By.id("com.safety.armourgrid:id/confirm");	
		
        return driver.findElement(selectTerms);
		
		
		
	}
	
	
	
	

}
