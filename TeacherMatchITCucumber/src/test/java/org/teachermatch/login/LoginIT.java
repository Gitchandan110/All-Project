package org.teachermatch.login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginIT {
	
	private WebDriver webDriver;
	
	private Logger logger = Logger.getLogger(LoginIT.class);
	
	@Test
	public void checkForInvalidEmailValidation() {
		// check for Login title
		String actualTitle = webDriver.getTitle();
		assertEquals("Login", actualTitle);
		
		
		logger.info("ABC");
		
		// check for empty form submit
		webDriver.findElement(By.id("submitLogin")).click();
		
		String validationMsg = webDriver.findElement(By.id("errordiv")).getText();
		assertTrue(validationMsg.contains("Please enter Email"));
		assertTrue(validationMsg.contains("Please enter Password"));		
		
		// check for invalid email and empty password
		webDriver.findElement(By.id("emailAddress1")).sendKeys("admin");
		webDriver.findElement(By.id("submitLogin")).click();
		validationMsg = webDriver.findElement(By.id("errordiv")).getText();
		assertTrue(validationMsg.contains("Please enter valid Email"));
		assertTrue(validationMsg.contains("Please enter Password"));
		
		// check for login fail
		webDriver.findElement(By.id("emailAddress1")).sendKeys("@teachermatch.com");
        webDriver.findElement(By.id("password1")).sendKeys("password");
        webDriver.findElement(By.id("submitLogin")).click();
        validationMsg = webDriver.findElement(By.id("divServerError")).getText();        
        assertTrue(validationMsg.contains("Invalid Email or Password. Please check the Email and Password and try again. Password is case sensitive."));
        
        // all entries are correct and check for title of TM Dashboard
        webDriver.findElement(By.id("password1")).sendKeys("");
        webDriver.findElement(By.id("password1")).sendKeys("TM@g!5U#r%|");
        webDriver.findElement(By.id("submitLogin")).click();        
        
        String title = webDriver.getTitle();
        assertEquals(title, "Admin Mosaic");
	}
  
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","/home/ashish/Desktop/chromedriver");
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		String baseUrl = "https://titan.teachermatch.org";
		webDriver.get(baseUrl);
	}

	@AfterMethod
	public void afterMethod() {
		//webDriver.close();
	}

}