package com.appium.commonutils;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<MobileElement> driver;

	public static AppiumDriver launchApk() throws MalformedURLException {

		File appDir = new File("C:\\Users\\Chandan\\git\\repository\\ArtifactIdAppium\\ApkFile");
		File apk = new File(appDir, "SK_49_develop_21_June.apk");

		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability("deviceName", "K9 VIRAAT_4G");
		capability.setCapability("udid", "DQTKDYTGKRWOONPR");
		capability.setCapability("platformVersion", "6.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.safety.armourgrid");
		capability.setCapability("appActivity", "com.safety.armourgrid.activity.SplashActivity");

		capability.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());

		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}

	public static AppiumDriver launchGooglePlayStore() throws MalformedURLException {

		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability("deviceName", "K9 VIRAAT_4G");
		capability.setCapability("udid", "DQTKDYTGKRWOONPR");
		capability.setCapability("platformVersion", "6.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.android.vending");
		capability.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		return driver;

	}

	public static AppiumDriver launchInstalledApp() throws MalformedURLException {

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "K9 VIRAAT_4G");
		capability.setCapability("udid", "DQTKDYTGKRWOONPR");
		capability.setCapability("platformVersion", "6.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.safety.armourgrid");
		capability.setCapability("appActivity", "com.safety.armourgrid.activity.SplashActivity");
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}

	public static void waitFor30Seconds(MobileElement element) {

		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(element));
			System.out.println("Explicit Wait 30 seconds Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void waitFor300Seconds(MobileElement element) {

		try {
			new WebDriverWait(driver, 300).until(ExpectedConditions.visibilityOf(element));
			System.out.println("Explicit Wait 300 Seconds Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void Scrolldown() throws Exception {

		driver.hideKeyboard();

		MobileElement Frame = driver.findElement(By.className("android.widget.ScrollView"));

		List<MobileElement> listElement = Frame.findElements(By.className("android.widget.EditText"));
		System.out.println("Number of Elements are :" + listElement.size());

		for (int i = 0; i > listElement.size(); i++) {

			System.out.println("List Item :" + listElement.get(i).getText());

		}

		MobileElement listitem = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().text(\"Confirm Password\"));"));
		System.out.println("Scrolled items are :" + listitem.getText());

		System.out.println("Scrolled item locations are :" + listitem.getLocation());
		listitem.click();
	}

	public static String GetDateTime() {

		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		String date1 = dateFormat.format(date);

		// Print the Date
		System.out.println("Current date and time is " + date1);
		return date1;

	}
	
	
	public static void scrolltoElement(String text){
		
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
		        
   }
	
	

}
