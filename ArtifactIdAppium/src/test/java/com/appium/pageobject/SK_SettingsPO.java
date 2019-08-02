package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_SettingsPO extends Base {

	public MobileElement incidentOptions() {

		By IncidentOptions = By.id("com.safety.armourgrid:id/settings_incident_options");
		return driver.findElement(IncidentOptions);

	}

	public MobileElement panicButtonOptions() {

		By PanicButton = By.id("com.safety.armourgrid:id/settings_panic_button");
		return driver.findElement(PanicButton);

	}

	public MobileElement profile() {

		By Profile = By.id("com.safety.armourgrid:id/settings_profile");
		return driver.findElement(Profile);

	}

	public MobileElement organization() {

		By Organization = By.id("com.safety.armourgrid:id/settings_organizations");
		return driver.findElement(Organization);

	}

	public MobileElement emergencyContacts() {

		By EmergencyContact = By.id("com.safety.armourgrid:id/settings_contacts");
		return driver.findElement(EmergencyContact);

	}

	public MobileElement incidentHistory() {

		By IncidentHistory = By.id("com.safety.armourgrid:id/settings_history");
		return driver.findElement(IncidentHistory);

	}

	public MobileElement incidentResponsePlan() {

		By IRP = By.id("com.safety.armourgrid:id/settings_plan");
		return driver.findElement(IRP);

	}

	public MobileElement groupCall() {

		By GRPCALL = By.id("com.safety.armourgrid:id/settings_group_call");
		return driver.findElement(GRPCALL);

	}

	public MobileElement map() {

		By MAP = By.id("com.safety.armourgrid:id/settings_map");
		return driver.findElement(MAP);

	}

	public MobileElement tutorial() {

		By Tutorial = By.id("com.safety.armourgrid:id/settings_tutorial");
		return driver.findElement(Tutorial);

	}

	public MobileElement privacyPolicy() {

		By PP = By.id("com.safety.armourgrid:id/settings_privacy");
		return driver.findElement(PP);

	}

	public MobileElement termsOfServices() {

		By TS = By.id("com.safety.armourgrid:id/settings_tou");
		return driver.findElement(TS);

	}

	public MobileElement logOutOption() {

		By LogOut = By.id("com.safety.armourgrid:id/settings_logout");
		return driver.findElement(LogOut);

	}
	
	public MobileElement logOutPopUpYes() {

		By LogOutYes = By.id("android:id/button1");
		return driver.findElement(LogOutYes);

	}
	
	

}