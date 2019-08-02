package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_SettingsPO;

public class SK_SettingsBL extends SK_SettingsPO{
	
	
	public void logOutSK() {
		
		Base.scrolltoElement("Logout");
		logOutOption().click();
		logOutPopUpYes().click();
		
}
	
	
	

}
