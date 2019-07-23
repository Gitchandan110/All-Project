package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_AddOrganizationPO extends Base{
	
	public MobileElement tbAddOrganization() {
		
	By AddOrganization=By.id("com.safety.armourgrid:id/add_uni_name_or_code");	
		
	return driver.findElement(AddOrganization);
		
		
	}
	
	public MobileElement btnConfirmOrganization() {
		
		By confirmOrganization=By.id("com.safety.armourgrid:id/confirm");
		return driver.findElement(confirmOrganization);
	}

}
