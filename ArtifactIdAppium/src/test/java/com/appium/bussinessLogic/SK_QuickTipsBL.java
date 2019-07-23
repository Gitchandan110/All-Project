package com.appium.bussinessLogic;

import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_QuickTipsPO;

public class SK_QuickTipsBL extends SK_QuickTipsPO {
	
	String TestCaseSheet="TestCase";
	
	public void CloseTips() {
		
		try {

			if (btnCloseTips().isDisplayed()) {
				
				ExcelUtils.WriteExcel(TestCaseSheet, 5, 2);

				btnCloseTips().click();
				Thread.sleep(5000);
				System.out.println("Quick Tips Closed");

			} else {

				System.out.println("Quick Tips Closed");
			}

		} catch (Exception ex) {

			System.out.println("Exception found :" + ex.getMessage());
		}

	}

}
