package com.appium.bussinessLogic;

import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_NewAccountPO;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SK_NewAccountBL extends SK_NewAccountPO {

	public void fillFirstName() {

		try {

			if (txtFirstName().isDisplayed()) {

				txtFirstName().sendKeys("Appium");
				System.out.println("FirstName entered");

			}

			else {

				System.out.println("FirstName not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in FirstName:" + ex.getMessage());
		}

	}

	public void fillLastName() {

		try {

			if (txtLastName().isDisplayed()) {

				txtLastName().sendKeys("Test");
				System.out.println("LastName entered");

			}

			else {

				System.out.println("LastName not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in LastName:" + ex.getMessage());
		}

	}

	public void fillMobileNumber() {

		try {

			if (txtMobileNumber().isDisplayed()) {

				txtMobileNumber().sendKeys("54789652326");
				System.out.println("MobileNumber entered");

			}

			else {

				System.out.println("MobileNumber not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in MobileNumber:" + ex.getMessage());
		}

	}

	public void fillSafeWord() {

		try {

			if (txtSafeWord().isDisplayed()) {

				txtSafeWord().sendKeys("Safe");
				System.out.println("SafeWord entered");

			}

			else {

				System.out.println("SafeWord not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in SafeWord:" + ex.getMessage());
		}

	}

	public void fillEmail() {

		try {

			driver.hideKeyboard();

			if (txtEmail().isDisplayed()) {
				txtEmail().sendKeys("test8@yopmail.com");
				System.out.println("Email entered");
			}

			else {

				System.out.println("Email not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Email:" + ex.getMessage());
		}

	}

	public void fillConfirmEmail() {

		try {

			if

			(driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				System.out.println("Hide Keyboard done");
				txtConfirmEmail().sendKeys("test8@yopmail.com");
				System.out.println("Confirm Email entered");

			}

			else {

				txtConfirmEmail().sendKeys("test8@yopmail.com");
				System.out.println("Confirm Email entered");

			}
		} catch (Exception ex) {

			System.out.println("Exception in Confirm Email:" + ex.getMessage());
		}

	}

	public void fillPassword() {

		try {

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				System.out.println("Hide Keyboard done");

				if (txtPassword().isDisplayed()) {

					txtPassword().sendKeys("12345678");
					System.out.println("Password entered");

				}

				else {

					txtPassword().sendKeys("12345678");
					System.out.println("Password entered");

				}

			}

		} catch (Exception ex) {

			System.out.println("Exception in Password:" + ex.getMessage());
		}

	}

	public void fillConfirmPassword() {

		try {

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				System.out.println("Hide Keyboard done");
				if (txtConfirmPassword().isDisplayed()) {

					txtConfirmPassword().sendKeys("12345678");
					System.out.println("Confirm Password entered");

				}

				else {

					txtConfirmPassword().sendKeys("12345678");
					System.out.println("Confirm Password entered");
				}

			}
		} catch (Exception ex) {

			System.out.println("Exception in Confirm Password:" + ex.getMessage());
		}

	}

	public void clickSaveProfile() {

		try {

			if (btnSaveProfile().isDisplayed()) {

				btnSaveProfile().click();
				System.out.println("Profile Saved");

			}

			else {

				System.out.println("Profile not Saved");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Save Profile:" + ex.getMessage());
		}

	}

}
