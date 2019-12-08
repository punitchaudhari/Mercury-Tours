package com.uiFrameworkVersion1.companyName.mercury_tours.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;

public class ProfilePage {

	WebDriver driver;
	Logger log = LoggerHelper.getLogger(ProfilePage.class);

	// constructer of ProfilePage
	public ProfilePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("ProfilePage Class Object Created");
	}
}
