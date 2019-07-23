package com.appium.scripts;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.bussinessLogic.SK_HomePageBL;
import com.appium.bussinessLogic.SK_IncidentScreenBL;
import com.appium.bussinessLogic.SK_LaunchBL;
import com.appium.bussinessLogic.SK_PermissionBL;
import com.appium.bussinessLogic.SK_PrivacyPolicyBL;
import com.appium.bussinessLogic.SK_QuickTipsBL;
import com.appium.bussinessLogic.SK_SetTimerBL;
import com.appium.bussinessLogic.SK_SignInBL;
import com.appium.bussinessLogic.SK_TermsOfServicesBL;
import com.appium.commonutils.Base;

public class SK_Timer_Incident extends Base{
	

	SK_LaunchBL launchbl = PageFactory.initElements(driver, SK_LaunchBL.class);
	SK_TermsOfServicesBL termsbl = PageFactory.initElements(driver, SK_TermsOfServicesBL.class);
	SK_PrivacyPolicyBL privacypolicybl = PageFactory.initElements(driver, SK_PrivacyPolicyBL.class);
	SK_SignInBL signinbl = PageFactory.initElements(driver, SK_SignInBL.class);
	SK_PermissionBL permissionbl = PageFactory.initElements(driver, SK_PermissionBL.class);
	SK_QuickTipsBL quicktipsbl = PageFactory.initElements(driver, SK_QuickTipsBL.class);
	SK_HomePageBL homepagebl=PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_SetTimerBL setTimerbl=PageFactory.initElements(driver, SK_SetTimerBL.class);
	SK_IncidentScreenBL incidentscreenbl=PageFactory.initElements(driver, SK_IncidentScreenBL.class);
	
	
	@BeforeTest

	public void launchSafetyKuvrr() throws MalformedURLException {

		launchApp();
		System.out.println("App Launched Successfull");

	}

	
	
	
	
	@Test
	public void testTimerIncident() {
		
		
		launchbl.verifyTitle();
		launchbl.clickBtnSignIn();
		termsbl.acceptTermsOfServices();
		privacypolicybl.acceptPrivacyPolicy();
		signinbl.fillEmail();
		signinbl.fillPassword();
		signinbl.clickSubmit();
		permissionbl.acceptPermissions();
		quicktipsbl.CloseTips();
		homepagebl.startTimer();
		setTimerbl.SetTimer();
		setTimerbl.Set();
		incidentscreenbl.EndIncident();
		incidentscreenbl.SelectEndReason();
		
		
		
		
	}
	
	

}
