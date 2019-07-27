package com.appium.bussinessLogic;

import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_SignInPO;

public class SK_SignInBL extends SK_SignInPO {
	
	String LoginDataSheet = "Login";
	String TestCaseSheet = "TestCase";

	public void fillEmail() {

	
		
		try {

			if (Email().isDisplayed()) {
				System.out.println("Email Found");
				Email().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 0));
				System.out.println("Email is:"+ ExcelUtils.ReadExcel(LoginDataSheet, 1, 0));
				System.out.println("Email entered");

			}

			else {

				System.out.println("Email not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Email:" + ex.getMessage());
			System.out.println("StackTrace in Email:" + ex.getStackTrace());
			System.out.println("ExceptionCause in Email:" + ex.getCause());
		}

	}

	public void fillPassword() {

		try {

			if (Password().isDisplayed()) {
				Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 1));
				System.out.println("Password entered");

			}

			else {

				System.out.println("Password not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Password:" + ex.getMessage());
		}

	}

	public void clickSubmit() {

		try {

			if (Submit().isDisplayed()) {

				Submit().click();
				System.out.println("SignIn button Clicked");
			

			}

			else {

				System.out.println("SignIn button Not Clicked");
			}
		} catch (Exception ex) {

			System.out.println("Exception in SignIn:" + ex.getMessage());
		}

	}

}
