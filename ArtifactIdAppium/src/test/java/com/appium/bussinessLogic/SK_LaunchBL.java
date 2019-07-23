package com.appium.bussinessLogic;

import org.testng.Assert;

import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_LaunchPO;

public class SK_LaunchBL extends SK_LaunchPO {

	String TestCaseSheet = "TestCase";

	public void verifyTitle() {

		try {

			if (titleLaunchScreen().isDisplayed()) {

				System.out.println("Title of Launch Screen is :" + titleLaunchScreen().getText());

				Assert.assertEquals(titleLaunchScreen().getText(), "Safety Kuvrr", "Title Does not match");
				System.out.println("Assertion pass: Title Matched");
				ExcelUtils.WriteExcel(TestCaseSheet, 1, 2);

			} else {

				System.out.println("Title is Missing");

			}

		} catch (Exception ex) {

			System.out.println("Exception in Title is:" + ex.getMessage());

		}

	}

	public void clickBtnSignIn() {

		try {

			if (BtnSignIn().isDisplayed()) {

				ExcelUtils.WriteExcel(TestCaseSheet, 2, 2);
				BtnSignIn().click();
				System.out.println("SignIn Button Clicked");

			}

			else {

				System.out.println("SignIn Button not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in SignIn :" + ex.getStackTrace());
			System.out.println("Exception in SignIn :" + ex.getMessage());
		}

	}

	public void clickBtnNewAccount() {

		try {

			if (BtnNewAccount().isDisplayed()) {

				ExcelUtils.WriteExcel(TestCaseSheet, 3, 2);
				BtnNewAccount().click();
				System.out.println("New Account Button Clicked");

			}

			else {

				System.out.println("New Account Button not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in New Account :" + ex.getStackTrace());
			System.out.println("Exception in New Account :" + ex.getMessage());
		}

	}

}
