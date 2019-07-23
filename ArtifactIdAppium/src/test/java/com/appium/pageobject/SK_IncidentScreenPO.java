package com.appium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_IncidentScreenPO extends Base {

	public MobileElement btnEndIncident() {

		By EndIncident = By.id("com.safety.armourgrid:id/streaming_ongoing_end");
		return driver.findElement(EndIncident);

	}

	public MobileElement btnChat() {
		By Chat = By.id("com.safety.armourgrid:id/incident_ongoing_chat_text");
		return driver.findElement(Chat);

	}

	public MobileElement btnHideScreen() {
		By Hide = By.linkText("Hide");
		return driver.findElement(Hide);

	}

	public MobileElement reasonEndIncident() {
	

	//    By Reason = By.xpath("//android.widget.TextView[@text='Call Me']");
	//   By Reason = By.xpath("//android.widget.TextView[contains(@resource-id,'android:id/text1')]");
	    By Reason = By.xpath("//android.widget.TextView[@text='Call Me' and @index='2']");
		return driver.findElement(Reason);

	}

}
