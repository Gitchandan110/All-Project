package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_SetTimerPO extends Base {

	public MobileElement btnSetTimer() {

		By SetTimer = By.id("com.safety.armourgrid:id/timer_setup_set");
		return driver.findElement(SetTimer);
	}

	public MobileElement btnSelectTime() {

		By Time = By.xpath("//android.widget.EditText[@Text='5']");
		return driver.findElement(Time);
	}

	public MobileElement btnSet() {

		By Set = By.id("android:id/button1");
		return driver.findElement(Set);

	}

	public MobileElement btnStartNow() {
		By StartNow = By.id("com.safety.armourgrid:id/timer_start_button");
		return driver.findElement(StartNow);

	}

	public MobileElement btnCancelTimer() {
		By Cancel = By.id("com.safety.armourgrid:id/timer_cancel_button");
		return driver.findElement(Cancel);

	}

}
