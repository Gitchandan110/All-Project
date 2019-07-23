package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_HomePagePO extends Base {

	public MobileElement btnSOS() {

		By SOS = By.id("com.safety.armourgrid:id/waiting_start_incident");

		return driver.findElement(SOS);

	}

	public MobileElement camera() {

		By Camera = By.id("com.safety.armourgrid:id/waiting_switch_camera");

		return driver.findElement(Camera);

	}

	public MobileElement btn911() {

		By Btn911 = By.id("com.safety.armourgrid:id/waiting_call_911");

		return driver.findElement(Btn911);

	}

	public MobileElement btnSettings() {

		By BtnSetting = By.id("com.safety.armourgrid:id/menu_settings_button");

		return driver.findElement(BtnSetting);

	}

	public MobileElement btnSafeWalk() {

		By BtnSafeWalk = By.id("com.safety.armourgrid:id/menu_walksafe_button");

		return driver.findElement(BtnSafeWalk);

	}

	public MobileElement btnTimer() {

		By BtnTimer = By.id("com.safety.armourgrid:id/menu_timer_button");

		return driver.findElement(BtnTimer);

	}

	public MobileElement btnTips() {

		By BtnTips = By.id("com.safety.armourgrid:id/menu_tips_button");

		return driver.findElement(BtnTips);

	}
}
