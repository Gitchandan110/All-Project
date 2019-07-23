package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_PermissionPO extends Base{

	public MobileElement BtnAllow() {
		
		By btnAllow=By.id("com.android.packageinstaller:id/permission_allow_button");
		
		return driver.findElement(btnAllow);
		
		
}
	
public MobileElement BtnDeny() {
		
		By btnDeny=By.id("com.android.packageinstaller:id/permission_deny_button");
		
		return driver.findElement(btnDeny);
	
	
}
}