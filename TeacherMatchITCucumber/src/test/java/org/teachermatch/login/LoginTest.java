package org.teachermatch.login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class LoginTest {

	WebDriver webDriver;
	
	@Given("^user navigates to https://titan.teachermatch.org")
    public void givenStatment(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chandan\\Desktop\\Eclipse\\TeacherMatchIT\\src\\main\\resources\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		String baseUrl = "https://titan.teachermatch.org";
		webDriver.get(baseUrl);           
    }
	
    @When("^user logs in using email as titanteacher@yopmail.com and password as omsai11ram")
    public void whenStatement(){
    	webDriver.findElement(By.id("emailAddress1")).sendKeys("titanteacher@yopmail.com");
    	webDriver.findElement(By.id("password1")).sendKeys("omsai11ram");
    	webDriver.findElement(By.id("submitLogin")).click();
    }
    
    @Then("^login should be successful$")
    public void thenStatment(){
    	String title = webDriver.getTitle();
        assertEquals(title, "Admin Mosaic");
    }

}