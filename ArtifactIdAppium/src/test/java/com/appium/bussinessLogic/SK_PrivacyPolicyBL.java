package com.appium.bussinessLogic;

import com.appium.pageobject.SK_PrivacyPolicyPO;

public class SK_PrivacyPolicyBL extends SK_PrivacyPolicyPO {

	public void acceptPrivacyPolicy() {

		try {

			if (btnAcceptPrivacyPolicy().isDisplayed()) {

				btnAcceptPrivacyPolicy().click();
				System.out.println("Privacy Policy Accepted");

			} else {

				System.out.println("Privacy Policy not Accepted");
			}

		} catch (Exception ex) {

			System.out.println("Exception found :" + ex.getMessage());
		}

	}

}
