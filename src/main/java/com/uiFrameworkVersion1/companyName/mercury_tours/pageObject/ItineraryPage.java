package com.uiFrameworkVersion1.companyName.mercury_tours.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;

public class ItineraryPage {

	Logger log = LoggerHelper.getLogger(ItineraryPage.class);
	WebDriver driver;

	public ItineraryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("ItineraryPage Class Object Created");

	}
	
}
