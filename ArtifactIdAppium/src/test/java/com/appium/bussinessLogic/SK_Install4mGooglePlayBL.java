package com.appium.bussinessLogic;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appium.commonutils.Base;
import com.appium.pageobject.GooglePlay_HomePO;

import io.appium.java_client.MobileElement;

public class SK_Install4mGooglePlayBL extends GooglePlay_HomePO {

	public void searchApp() {

		SearchBox().click();
		txtBoxSearch().sendKeys("Safety Kuvrr");
		System.out.println("Entered text under Search box");
		suggestText().click();
		System.out.println("Suggested text clicked");
	}

	public void selectApp() {

			if (appSafetyKuvrr().isDisplayed()) {
				System.out.println("App displayed under list.");
				appSafetyKuvrr().click();

	   }
	}
	
	public void clickbtnInstall() {
		
		try {
			
			Base.waitFor30Seconds(btnInstallapp());
			if(btnInstallapp().isDisplayed()) {
			btnInstallapp().click();
			System.out.println(Base.GetDateTime());
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void waitfor3Min() {
		
		try {
			Thread.sleep(210000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void clickbtnOpen() {
		
		System.out.println("Open App Button Method");
		System.out.println(Base.GetDateTime());
		btnOpen().click();
		System.out.println("Open button clicked");
		
		
	}
		
		
	

}
