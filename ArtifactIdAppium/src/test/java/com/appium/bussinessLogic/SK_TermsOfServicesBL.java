package com.appium.bussinessLogic;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_TermsOfServicesPO;

public class SK_TermsOfServicesBL extends SK_TermsOfServicesPO {

	String TestCaseSheet = "TestCase";

	public void acceptTermsOfServices() {

		try {

			if (AcceptTerms().isDisplayed()) {

				
				AcceptTerms().click();
				System.out.println("Terms Of Services is accepted");

			} else {

				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOf(AcceptTerms()));

				System.out.println("Terms Of Services is not accepted");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Accepting Terms Of Services is :" + ex.getMessage());
		}

	}

}
