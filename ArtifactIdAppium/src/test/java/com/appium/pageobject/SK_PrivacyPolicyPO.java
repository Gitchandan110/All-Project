package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_PrivacyPolicyPO extends Base{
	
	public MobileElement btnAcceptPrivacyPolicy() {
		
		
	By AcceptButton=By.id("android:id/button1");	
	return driver.findElement(AcceptButton);
		
		
	}

}
