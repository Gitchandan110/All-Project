package com.appium.bussinessLogic;

import com.appium.pageobject.SK_HomePagePO;

public class SK_HomePageBL extends SK_HomePagePO {

	public void startSOS() {

		try {

			if (btnSOS().isDisplayed()) {

				btnSOS().click();
				System.out.println("SOS started");
				Thread.sleep(20000);

			} else {

				System.out.println("SOS not started");
			}

		} catch (Exception ex) {

			System.out.println("Exception in SOS :" + ex.getMessage());

		}

	}

	public void startSafeWalk() {

		try {

			if (btnSafeWalk().isDisplayed()) {

				btnSafeWalk().click();
				Thread.sleep(20000);
				System.out.println("SafeWalk started");

			} else {

				System.out.println("SafeWalk not started");
			}

		} catch (Exception ex) {

			System.out.println("Exception in SafeWalk :" + ex.getMessage());

		}
	}

	public void startTimer() {

		try {

			if (btnTimer().isDisplayed()) {

				btnTimer().click();
				System.out.println("Timer Button Clicked");
				Thread.sleep(5000);

			} else {

				System.out.println("Timer Button not Clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Timer button:" + ex.getMessage());

		}

	}

	public void startTips() {

		try {

			if (btnTips().isDisplayed()) {

				btnTips().click();
				System.out.println("Tips clicked");
				Thread.sleep(5000);

			} else {

				System.out.println("Tips Button not Clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Tips button:" + ex.getMessage());

		}
	}
	
	
	public void clickSetting() {
		
		
		btnSettings().click();
		System.out.println("Setting Button Clicked");
		
		
		
	}
	
	
	
	
	
	
}
