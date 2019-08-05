package com.appium.ApkScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.bussinessLogic.SK_AddEmergencyContactBL;
import com.appium.bussinessLogic.SK_AddOrganizationBL;
import com.appium.bussinessLogic.SK_LaunchBL;
import com.appium.bussinessLogic.SK_NewAccountBL;
import com.appium.bussinessLogic.SK_PermissionBL;
import com.appium.bussinessLogic.SK_PrivacyPolicyBL;
import com.appium.bussinessLogic.SK_QuickTipsBL;
import com.appium.bussinessLogic.SK_TermsOfServicesBL;
import com.appium.commonutils.Base;

import io.appium.java_client.AppiumDriver;

public class SK_CreateAccount extends Base{
	
	SK_LaunchBL launchbl=PageFactory.initElements(driver, SK_LaunchBL.class);
	SK_TermsOfServicesBL termsbl=PageFactory.initElements(driver, SK_TermsOfServicesBL.class);
	SK_PrivacyPolicyBL privacypolicybl=PageFactory.initElements(driver, SK_PrivacyPolicyBL.class);
	SK_NewAccountBL newaccountbl=PageFactory.initElements(driver, SK_NewAccountBL.class);
	SK_AddOrganizationBL addOrgbl=PageFactory.initElements(driver, SK_AddOrganizationBL.class);
	SK_AddEmergencyContactBL addEmergencyContactbl=PageFactory.initElements(driver, SK_AddEmergencyContactBL.class);
	SK_PermissionBL permissionbl=PageFactory.initElements(driver, SK_PermissionBL.class);
	SK_QuickTipsBL quicktipsbl=PageFactory.initElements(driver, SK_QuickTipsBL.class);
	
	 @BeforeTest
	    
	    public void launchSafetyKuvrr() throws MalformedURLException {
		  
		  
		  launchApk();
		  System.out.println("App Launched Successfull");
	        
	  }
	  
	@Test (priority=1) 
	
	public void CreateAccount() {
		
		
		launchbl.clickBtnNewAccount();
		termsbl.acceptTermsOfServices();
		privacypolicybl.acceptPrivacyPolicy();
		newaccountbl.createProfile();
		addOrgbl.fillOrgCode();
	    addOrgbl.saveOrgCode();
	    addEmergencyContactbl.fillFirstName();
	    addEmergencyContactbl.fillLastName();
	    addEmergencyContactbl.fillEmail();
	    addEmergencyContactbl.fillPhoneNumber();
	    addEmergencyContactbl.SaveEmergencyContact();
	    addEmergencyContactbl.fillFirstName();
	    addEmergencyContactbl.fillLastName();
	    addEmergencyContactbl.fillEmail();
	    addEmergencyContactbl.fillPhoneNumber();
	    addEmergencyContactbl.SaveEmergencyContact();
	    permissionbl.acceptPermissions();
	    quicktipsbl.CloseTips();
		
	}
	
	
	   
	@AfterMethod
    
  public void tearDown() {
    	
		((AppiumDriver) driver).removeApp("com.safety.armourgrid");
        

        
    }
    
 
}



	


