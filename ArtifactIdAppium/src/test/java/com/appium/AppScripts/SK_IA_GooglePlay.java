package com.appium.AppScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.bussinessLogic.SK_Install4mGooglePlayBL;
import com.appium.commonutils.Base;

public class SK_IA_GooglePlay extends Base{
	
	SK_Install4mGooglePlayBL googleplaybl=PageFactory.initElements(driver, SK_Install4mGooglePlayBL.class);
	
	@BeforeMethod
	public void openGooglePlayStore() {
		
		try {
			launchGooglePlayStore ();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	
public void installApp() {
	
	googleplaybl.searchApp();
	googleplaybl.selectApp();
	googleplaybl.clickbtnInstall();
	googleplaybl.waitfor3Min();
	googleplaybl.clickbtnOpen();
	
	
} 
	

}
