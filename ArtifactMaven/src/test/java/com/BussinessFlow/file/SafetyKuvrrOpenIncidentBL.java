package com.BussinessFlow.file;



import org.openqa.selenium.NoSuchElementException;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SafetyKuvrrOpenIncidentPL;

public class SafetyKuvrrOpenIncidentBL extends SafetyKuvrrOpenIncidentPL {

	SafetyKuvrrOpenIncidentPL OpenIncidentPL;

	public void verifyOpenIncident() throws InterruptedException {
		
		try {
			
			if (IncomingIncident().isDisplayed()==true) {
			Base.scrolltoElement(driver, IncomingIncident());
			Thread.sleep(3000);
			Base.highLightElement(driver, IncomingIncident());
			Thread.sleep(2000);
			IncomingIncident().click();
			System.out.println("Incoming Incident was clicked");
		}
			
		    } catch (NoSuchElementException ex) {
				
		   if (ex.toString().contains("NoSuchElementException")) {
		 	
		    if (OpenIncident().isDisplayed()==true) {
		    	
		    Base.scrolltoElement(driver, OpenIncident());
		    Thread.sleep(3000);
			Base.highLightElement(driver, OpenIncident());
			Thread.sleep(2000);
			OpenIncident().click();
			System.out.println("Open Incident was clicked");

		} else {

			System.out.println("No Open Incident Found");

	} 
		
		}
		
	
			}

	}

}
