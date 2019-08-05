package com.appium.bussinessLogic;

import com.appium.pageobject.SK_NewAccountPO;

import io.appium.java_client.AppiumDriver;

public class SK_NewAccountBL extends SK_NewAccountPO {

	public void createProfile() {

		try {
			if (txtFirstName().isDisplayed()) {
				txtFirstName().click();
				txtFirstName().sendKeys("Appium");
				System.out.println("FirstName entered");
				if (txtLastName().isDisplayed()) {
					txtLastName().sendKeys("Test");
					System.out.println("LastName entered");
				}

				if (txtMobileNumber().isDisplayed()) {
					txtMobileNumber().sendKeys("54789652326");
					System.out.println("MobileNumber entered");

				}

				if (txtSafeWord().isDisplayed()) {
					txtSafeWord().sendKeys("Safe");
					System.out.println("SafeWord entered");

				}
				
				
			        driver.hideKeyboard();
			   		if (txtEmail().isDisplayed()) {
					txtEmail().sendKeys("appium1@yopmail.com");
					System.out.println("Email entered");
					
					
					if (driver.isKeyboardShown() == true) {
						driver.hideKeyboard();
						txtConfirmEmail().click();
						txtConfirmEmail().sendKeys("appium1@yopmail.com");
						System.out.println("Confirm Email entered");
					} else {
						
						txtConfirmEmail().click();
						txtConfirmEmail().sendKeys("appium1@yopmail.com");
						System.out.println("Confirm Email entered");
						
						
					}

					if (driver.isKeyboardShown() == true) {
						driver.hideKeyboard();
						System.out.println("Hide Keyboard done");

					}
					if (txtPassword().isDisplayed()) {
						txtPassword().sendKeys("12345678");
						System.out.println("Password entered");
					} else {

						txtPassword().sendKeys("12345678");
						System.out.println("Password entered");

					}

					if (driver.isKeyboardShown() == true) {
						driver.hideKeyboard();
						System.out.println("Hide Keyboard done");
						if (txtConfirmPassword().isDisplayed()) {
							txtConfirmPassword().click();
							txtConfirmPassword().sendKeys("12345678");
							System.out.println("Confirm Password entered");

						}

						else {
							txtConfirmPassword().click();
							txtConfirmPassword().sendKeys("12345678");
							System.out.println("Confirm Password entered");
						}

						if (btnSaveProfile().isDisplayed()) {
							btnSaveProfile().click();
							System.out.println("Profile Saved");

						}

						else {

							System.out.println("Profile not Saved");
						}
					}
				}
			
			}

		} catch (Exception ex) {

			System.out.println("Exception in Create Profile:" + ex.getMessage());
			((AppiumDriver) driver).closeApp();
		}

	}
}