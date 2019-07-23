package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_TipSubmitPO extends Base {

	public MobileElement dropdownGeofence() {

		By GeoFence = By.id("android:id/text1");
		return driver.findElement(GeoFence);

	}

	public MobileElement chkboxIncludeGeoLocation() {

		By GeoLocation = By.id("com.safety.armourgrid:id/tips_include_location");
		return driver.findElement(GeoLocation);

	}

	public MobileElement chkboxRemainAnonymous() {

		By Anonymous = By.id("com.safety.armourgrid:id/tips_remain_anon");
		return driver.findElement(Anonymous);

	}

	public MobileElement txtTipsDescription() {

		By Description = By.id("com.safety.armourgrid:id/tips_description");
		return driver.findElement(Description);

	}

	public MobileElement txtTipsName() {

		By TipsName = By.id("com.safety.armourgrid:id/tips_names");
		return driver.findElement(TipsName);

	}

	public MobileElement btnAttachMedia() {

		By AttachMedia = By.id("com.safety.armourgrid:id/tips_media_text");
		return driver.findElement(AttachMedia);

	}

	public MobileElement btnSendTip() {

		By SendTip = By.id("com.safety.armourgrid:id/tips_send_button");
		return driver.findElement(SendTip);

	}

}
