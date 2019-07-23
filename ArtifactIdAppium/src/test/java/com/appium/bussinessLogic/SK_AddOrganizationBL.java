package com.appium.bussinessLogic;

import com.appium.pageobject.SK_AddOrganizationPO;

public class SK_AddOrganizationBL extends SK_AddOrganizationPO {

	public void fillOrgCode() {

		try {

			if (tbAddOrganization().isDisplayed()) {
				tbAddOrganization().sendKeys("CKORG");
				System.out.println("Org Code filed");
			} else {
				System.out.println("Org Code not filed");
			}
		} catch (Exception ex) {
			System.out.println("Exception in OrgCode:" + ex.getMessage());
		}
	}
	
	public void saveOrgCode() {

		try {

			if (btnConfirmOrganization().isDisplayed()) {
				btnConfirmOrganization().click();
				System.out.println("Org Code Saved");
			} else {
				System.out.println("Org Code not Saved");
			}
		} catch (Exception ex) {
			System.out.println("Exception in Save OrgCode:" + ex.getMessage());
		}
	}
	
}


