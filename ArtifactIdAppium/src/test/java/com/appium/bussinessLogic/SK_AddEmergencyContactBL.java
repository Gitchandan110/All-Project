package com.appium.bussinessLogic;

import com.appium.pageobject.SK_AddEmergencyContactPO;

public class SK_AddEmergencyContactBL extends SK_AddEmergencyContactPO {

	public void fillFirstName() {

		try {

			if (tbFirstName().isDisplayed()) { 
				tbFirstName().sendKeys("chandan");
				System.out.println("First Name filed");
			} else {
				System.out.println("First Name not filed");
			}
		} catch (Exception ex) {
			System.out.println("Exception in FirstName:" + ex.getMessage());
		}
	}

	public void fillLastName() {

		try {

			if (tbLastName().isDisplayed()) {
				tbLastName().sendKeys("kumar");
				System.out.println("Last Name filed");
			} else {
				System.out.println("Last Name not filed");
			}
		} catch (Exception ex) {
			System.out.println("Exception in LastName:" + ex.getMessage());
		}
	}

	public void fillEmail() {

		try {

			if (tbEmail().isDisplayed()) {
				tbEmail().sendKeys("chandan.kumar@netsutra.com");
				System.out.println("Email filed");
			} else {
				System.out.println("Email not filed");
			}
		} catch (Exception ex) {
			System.out.println("Exception in Email:" + ex.getMessage());
		}
	}

	public void fillPhoneNumber() {

		try {

			if (tbPhoneNo().isDisplayed()) {
				tbPhoneNo().sendKeys("58963245789");
				System.out.println("Phone Number filed");
			} else {
				System.out.println("Phone Number not filed");
			}
		} catch (Exception ex) {
			System.out.println("Exception in Phone Number:" + ex.getMessage());
		}
	}

	public void SaveEmergencyContact() {

		try {

			if (btnSaveContact().isDisplayed()) {
				btnSaveContact().click();
				System.out.println("Contact Saved");
			} else {
				System.out.println("Contact not Saved");
			}
		} catch (Exception ex) {
			System.out.println("Exception in Save Contact:" + ex.getMessage());
		}
	}

}
