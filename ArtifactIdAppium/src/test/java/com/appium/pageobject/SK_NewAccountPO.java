package com.appium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_NewAccountPO extends Base {

	public WebElement txtFirstName() {

		By FirstName = By.id("com.safety.armourgrid:id/register_edit_firstname");
		return driver.findElement(FirstName);

	}

	public WebElement txtLastName() {

		By LastName = By.id("com.safety.armourgrid:id/register_edit_lastname");
		return driver.findElement(LastName);
	}

	public WebElement txtMobileNumber() {
		By MobileNumber = By.id("com.safety.armourgrid:id/register_edit_phone");
		return driver.findElement(MobileNumber);
	}

	public WebElement txtSafeWord() {

		By SafeWord = By.id("com.safety.armourgrid:id/register_edit_safeWord");
		return driver.findElement(SafeWord);
	}

	public WebElement txtEmail() {

		By Email = By.id("com.safety.armourgrid:id/register_edit_email");

		return driver.findElement(Email);
	}

	public WebElement txtConfirmEmail() {

		By ConfirmEmail = By.id("com.safety.armourgrid:id/register_edit_confirm_email");
		return driver.findElement(ConfirmEmail);
	}

	public WebElement txtPassword() {

		By Password = By.id("com.safety.armourgrid:id/register_edit_password");
		return driver.findElement(Password);
	}

	public WebElement txtConfirmPassword() {

		By ConfirmPassword = By.id("com.safety.armourgrid:id/register_edit_confirm_password");
		return driver.findElement(ConfirmPassword);//
	}
	
	public WebElement btnSaveProfile() {
		
		By SaveProfile=By.id("com.safety.armourgrid:id/confirm");
		
		return driver.findElement(SaveProfile);
	}

}
