package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_QuickTipsPO extends Base{
	
	
	public MobileElement btnCloseTips() {
		
		By BtnCloseTips=By.id("com.safety.armourgrid:id/tutorial_close");
		return driver.findElement(BtnCloseTips);
		
			
	}

}
