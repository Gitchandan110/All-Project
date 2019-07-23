package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_LaunchPO extends Base {

	public MobileElement BtnSignIn() {

		By btnSignIn = By.id("com.safety.armourgrid:id/splash_login");
		return driver.findElement(btnSignIn);

	}

	public MobileElement BtnNewAccount() {

		By btnNewAccount = By.id("com.safety.armourgrid:id/splash_register");
		return driver.findElement(btnNewAccount);

	}
	
	
	public MobileElement titleLaunchScreen() {
		
		By Title= By.className("android.widget.TextView");
		return driver.findElement(Title);
		
		
		
	}

}
