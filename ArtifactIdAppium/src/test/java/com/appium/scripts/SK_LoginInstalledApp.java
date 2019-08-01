package com.appium.scripts;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.commonutils.Base;

public class SK_LoginInstalledApp extends Base{
	
	
	@Test
	
	public void launchApp() {
		
		try {
			launchInstalledApp();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
