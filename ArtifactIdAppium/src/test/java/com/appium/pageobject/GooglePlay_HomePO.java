package com.appium.pageobject;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class GooglePlay_HomePO extends Base {

	public MobileElement SearchBox() {

		By searchBox = By.id("com.android.vending:id/search_box_idle_text");
		return driver.findElement(searchBox);

	}

	public MobileElement txtBoxSearch() {

		By searchBox = By.id("com.android.vending:id/search_box_text_input");
		return driver.findElement(searchBox);

	}

	public MobileElement suggestText() {

		By suggested = By.id("com.android.vending:id/suggest_text");
		return driver.findElement(suggested);

	}

	public MobileElement appSafetyKuvrr() {

		By appSafety = By.id("App: Safety Kuvrr");

		// By.xpath("//android.widget.TextView[@content-desc=\"App: Safety Kuvrr\"]");
		return driver.findElement(appSafety);

	}

	public MobileElement appInstallOption() {

		By appInstall = By.className("android.widget.ImageView");

		return driver.findElement(appInstall);

	}

	public MobileElement btnInstallapp() {

		List<MobileElement> Button = driver.findElements(By.className("android.widget.Button"));

		for (int i = 0; i < Button.size(); i++) {
			MobileElement btnInstall = Button.get(i);
			String btnText = btnInstall.getText();
			System.out.println("Install button text is:" + btnText);
			if (btnText.contains("INSTALL"))
			return btnInstall;
		}
		return null;
	}

	public MobileElement btnOpen() {

		List<MobileElement> Button = driver.findElements(By.className("android.widget.Button"));

		for (int i = 0; i < Button.size(); i++) {
			MobileElement btnOpen = Button.get(i);
			String btnText = Button.get(i).getText();
			System.out.println("Button Text is:" + btnText);
			if (btnText.contains("OPEN"))
			return btnOpen;

		}
		return null;

	}

}