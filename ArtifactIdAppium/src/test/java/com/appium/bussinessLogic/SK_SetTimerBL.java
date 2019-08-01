package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_SetTimerPO;

public class SK_SetTimerBL extends SK_SetTimerPO{

	
	public void SetTimer() {
		
		try {

			if (btnSetTimer().isDisplayed()) { 
				System.out.println("Set Timer Button displayed");
				btnSetTimer().click();
				Thread.sleep(3000);
				System.out.println("Set Timer clicked");

			} else {

				System.out.println("Set Timer not clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Set Timer button:" + ex.getMessage());
		}

	}

	
	
public void Set() {
	
	try {

		if (btnSet().isDisplayed()) {
			btnSet().click();
			System.out.println("Set button clicked");
			System.out.println("Current Time is :"+ Base.GetDateTime());
			Thread.sleep(360000);
			System.out.println("Thread sleep for 5 Minute");
			System.out.println("Current Time is :"+ Base.GetDateTime());

		} else {

			System.out.println("Set button not clicked");
		}

	} catch (Exception ex) {

		System.out.println("Exception in Set button:" + ex.getMessage());
	}

}

}


	

