package com.uiFrameworkVersion1.companyName.mercury_tours.testScripts;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.uiFrameworkVersion1.companyName.mercury_tours.helper.assertion.AssertionHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.assertion.SoftAssertionHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.config.PropertiesReaderClass;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.select.DropdownHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.HomePage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.Reservation2Page;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.ReservationPage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.SignOnPage;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;

public class testScript extends TestBase {
	Logger log = LoggerHelper.getLogger(testScript.class);
	
	@Test
	 public void testcase1() {
		getUrl(getSignOnPageUrl());
	SignOnPage sp = new SignOnPage(driver);
	sp.signIn("baymax", "baymax");
	ReservationPage rp = new ReservationPage(driver);
	DropdownHelper dd= new DropdownHelper(driver);

	 List<WebElement> data = dd.getAllDropDownData(rp.drpd_passengers);
		int i; 
			for(i=0;i<data.size();i++ ){
				dd.selectByVisibleText(rp.drpd_passengers, data.get(i).getText().trim());
			
				
			}
		
	}
	
	

}
