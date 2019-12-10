package com.uiFrameworkVersion1.companyName.mercury_tours.testScripts;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.assertion.AssertionHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.assertion.SoftAssertionHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.assertion.VerificationHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.select.DropdownHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.CreateAccountSuccessPage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.CruisesPage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.HomePage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.IndexPage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.ItineraryPage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.ProfilePage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.Purchase2Page;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.PurchasePage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.RegisterPage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.Reservation2Page;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.ReservationPage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.SignOnPage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.UnderConstPage;
import com.uiFrameworkVersion1.companyName.mercury_tours.pageObject.WelcomePage;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;

public class TestScriptSet1 extends TestBase{
	Logger log =LoggerHelper.getLogger(TestScriptSet1.class);
	RegisterPage rp;
	HomePage hp;
	IndexPage ip;
	ItineraryPage itineraryp;
	CruisesPage cp;
	SignOnPage sp;
	ProfilePage pp;
	PurchasePage purchsep;
	Purchase2Page purchse2p;
	UnderConstPage up;
	WelcomePage wp;
	Reservation2Page reservation2p;
	ReservationPage reservationp;
	CreateAccountSuccessPage createp;
	DropdownHelper ddh;
	VerificationHelper vh;


	@Test(enabled=false)
	public void checkHomeLinkNavigation_ID22(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnHome();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getWelcomePageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getWelcomePageUrl()+"'");
		 boolean status = url.contains(getWelcomePageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkFlightsLinkNavigation_ID23(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnFlights();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getindexPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getindexPageUrl()+"'");
		 boolean status = url.contains(getindexPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkHotelsLinkNavigation_ID24(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnHotels();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkCarRentalsLinkNavigation_ID25(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnCarRentals();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkCruisesLinkNavigation_ID26(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnCruises();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getCruisesPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getCruisesPageUrl()+"'");
		 boolean status = url.contains(getCruisesPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkDestinationsLinkNavigation_ID27(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnDestinations();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkVacationsLinkNavigation_ID28(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnVacations();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkSignOnLinkNavigation_ID29(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnSignOn();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getSignOnPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getSignOnPageUrl()+"'");
		 boolean status = url.contains(getSignOnPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkRegisterLinkNavigation_ID30(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnRegister();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getRegisterPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getRegisterPageUrl()+"'");
		 boolean status = url.contains(getRegisterPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkSupportLinkNavigation_ID31(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnSupprt();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	
	@Test(enabled=false)
	public void checkContactLinkNavigation_ID32(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnContact();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	

	@Test(enabled=false)
	public void check_yourDestination_LinkNavigation_ofHomePage_ID33(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnYourDestination();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void check_FeaturedVactionsDestination_LinkNavigation_ofHomePage_ID34(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnFeaturedVacationDestination();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void check_RegisterHere_LinkNavigation_ofHomePage_ID35(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnRegisterHere();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getRegisterPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getRegisterPageUrl()+"'");
		 boolean status = url.contains(getRegisterPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	
	@Test(enabled=false)
	public void checkDate_ofHomePage_ID36() {
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		String homepageDate = hp.lbl_date.getText();

		String[] monthName = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		Calendar cal = Calendar.getInstance();
		String month = monthName[cal.get(Calendar.MONTH)];
		// System.out.println(month);

		int dayofmonth = cal.get(Calendar.DAY_OF_MONTH);
		// System.out.println(dayofmonth);

		int year = cal.get(Calendar.YEAR);
		// System.out.println(year);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(homepageDate, month + " " + dayofmonth + ", " + year);
		AssertionHelper.updateTestStatus(status);

	}
	

	@Test(enabled=false)
	public void check_yourDestination_LinkNavigation_ofWelcomePage_ID37(){
		getUrl(getWelcomePageUrl());
		wp = new WelcomePage(driver);
		wp.clickOnYourDestination();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	
	@Test(enabled=false)
	public void check_FeaturedVactionsDestination_LinkNavigation_ofWelcomePage_ID38(){
		getUrl(getWelcomePageUrl());
		wp = new WelcomePage(driver);
		wp.clickOnFeaturedVacationDestination();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void check_RegisterHere_LinkNavigation_ofWelcomePage_ID39(){
		getUrl(getWelcomePageUrl());
		wp = new WelcomePage(driver);
		wp.clickOnRegisterHere();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getRegisterPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getRegisterPageUrl()+"'");
		 boolean status = url.contains(getRegisterPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkDate_ofWelcomePage_ID40() {
		getUrl(getWelcomePageUrl());
		wp = new WelcomePage(driver);
		String homepageDate = wp.lbl_date.getText();
		String[] monthName = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		Calendar cal = Calendar.getInstance();
		String month = monthName[cal.get(Calendar.MONTH)];
		// System.out.println(month);

		int dayofmonth = cal.get(Calendar.DAY_OF_MONTH);
		// System.out.println(dayofmonth);

		int year = cal.get(Calendar.YEAR);
		// System.out.println(year);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(homepageDate, month + " " + dayofmonth + ", " + year);
		AssertionHelper.updateTestStatus(status);
	}
	
	
	
	@Test(enabled=false)
	public void check_yourDestination_LinkNavigation_ofIndexPage_ID41(){
		getUrl(getindexPageUrl());
		ip = new IndexPage(driver);
		ip.clickOnYourDestination();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	
	@Test(enabled=false)
	public void check_FeaturedVactionsDestination_LinkNavigation_ofIndexPage_ID42(){
		getUrl(getindexPageUrl());
		ip = new IndexPage(driver);
		ip.clickOnFeaturedVacationDestination();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getUnderConstructionPageUrl()+"'");
		 boolean status = url.contains(getUnderConstructionPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void check_RegisterHere_LinkNavigation_ofIndexPage_ID43(){
		getUrl(getindexPageUrl());
		ip = new IndexPage(driver);
		ip.clickOnRegisterHere();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getRegisterPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getRegisterPageUrl()+"'");
		 boolean status = url.contains(getRegisterPageUrl());
		 AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkDate_ofIndexPage_ID44() {
		getUrl(getindexPageUrl());
		ip = new IndexPage(driver);
		String homepageDate = ip.lbl_date.getText();
		String[] monthName = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		Calendar cal = Calendar.getInstance();
		String month = monthName[cal.get(Calendar.MONTH)];
		// System.out.println(month);

		int dayofmonth = cal.get(Calendar.DAY_OF_MONTH);
		// System.out.println(dayofmonth);

		int year = cal.get(Calendar.YEAR);
		// System.out.println(year);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(homepageDate, month + " " + dayofmonth + ", " + year);
		AssertionHelper.updateTestStatus(status);
	}
	
	@Test(enabled=false)
	public void checkBackToHomeButton_ofUnderconstructionPage_ID45() {
		getUrl(getUnderConstructionPageUrl());
		up= new UnderConstPage(driver);
		up.clickOnBackToHome();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getWelcomePageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getWelcomePageUrl()+"'");
		
		Boolean status = url.contains(getWelcomePageUrl());
		AssertionHelper.updateTestStatus(status);
		
	}
	
	@Test(enabled=false)
	public void checkRegistrationFormLink_ofSignOnPage_ID46() {
		getUrl(getSignOnPageUrl());
		sp= new SignOnPage(driver);
		sp.clickOnRegistrationformlink();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getRegisterPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getRegisterPageUrl()+"'");
		
		Boolean status = url.contains(getRegisterPageUrl());
		AssertionHelper.updateTestStatus(status);	
	}
	
	@Test(enabled=false)
	public void checkRadioButtons_FlightsDetailsSection_ofReservationage_ID47() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new ReservationPage(driver);
		reservationp.clickOnRadioButton_RoundTrip();
		boolean status = reservationp.radiobtn_roundtrip.isSelected();
		SoftAssertionHelper sah = new SoftAssertionHelper();
		sah.assertTrue(status,"verify Round Trip radio button is checked");
		reservationp.clickOnRadioButton_OneWay();
		Boolean status1= reservationp.radiobtn_oneway.isSelected();
		sah.assertTrue(status1,"verify One Way radio button is checked");
		sah.assertAll();
	}
	
	@Test(enabled=false)
	public void checkRadioButtons_PreferencesSection_ofReservationPage_ID48() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new ReservationPage(driver);
		
		reservationp.clickOnRadioButton_EconomyClass();
		boolean status = reservationp.radiobtn_serviceclass_Economyclass.isSelected();
		SoftAssertionHelper sah = new SoftAssertionHelper();
		sah.assertTrue(status,"verify Economy Class radio button is checked");
		
		reservationp.clickOnRadioButton_BusinessClass();
		Boolean status1= reservationp.radiobtn_serviceclass_Businessclass.isSelected();
		sah.assertTrue(status1,"verify Business Class radio button is checked");
		
		reservationp.clickOnRadioButton_FirstClass();
		Boolean status2= reservationp.radiobtn_serviceclass_Firstclass.isSelected();
		sah.assertTrue(status2,"verify First Class radio button is checked");
		
		sah.assertAll();
	}
	
	@Test(enabled=false)
	public void checkDropDownListFunctionality_FlightDetailsSection_PassengersList_ofReservationPage_ID49() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new ReservationPage(driver);
		ddh = new DropdownHelper(driver);
		List<WebElement> data = ddh.getAllDropDownData(reservationp.drpd_passengers);
		int i;
		SoftAssertionHelper sah= new  SoftAssertionHelper();
		
		for(i=0;i<data.size();i++){
			ddh.selectByVisibleText(reservationp.drpd_passengers, data.get(i).getText().trim());
			sah.assertEquals(ddh.getSelectedText(reservationp.drpd_passengers), data.get(i).getText().trim(),"verify correct option is selected");
			
		}
		sah.assertAll();
		
	}
	
	
	@Test(enabled=false)
	public void checkDropDownListFunctionality_FlightDetailsSection_DepartingfromList_ofReservationPage_ID50() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new ReservationPage(driver);
		ddh = new DropdownHelper(driver);
		List<WebElement> data = ddh.getAllDropDownData(reservationp.drpd_departingfrom);
		int i;
		SoftAssertionHelper sah= new  SoftAssertionHelper();
		
		for(i=0;i<data.size();i++){
			ddh.selectByVisibleText(reservationp.drpd_departingfrom, data.get(i).getText().trim());
			sah.assertEquals(ddh.getSelectedText(reservationp.drpd_departingfrom), data.get(i).getText().trim(),"verify correct option is selected");
			
		}
		sah.assertAll();
		
	}
	
	@Test(enabled=false)
	public void checkDropDownListFunctionality_FlightDetailsSection_OnMonthList_ofReservationPage_ID51() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new ReservationPage(driver);
		ddh = new DropdownHelper(driver);
		List<WebElement> data = ddh.getAllDropDownData(reservationp.drpd_On_frommonth);
		int i;
		SoftAssertionHelper sah= new  SoftAssertionHelper();
		
		for(i=0;i<data.size();i++){
			ddh.selectByVisibleText(reservationp.drpd_On_frommonth, data.get(i).getText().trim());
			sah.assertEquals(ddh.getSelectedText(reservationp.drpd_On_frommonth), data.get(i).getText().trim(),"verify correct option is selected");
			
		}
		sah.assertAll();	
	}
	
	@Test(enabled=false)
	public void checkDropDownListFunctionality_FlightDetailsSection_OnDayList_ofReservationPage_ID52() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new ReservationPage(driver);
		ddh = new DropdownHelper(driver);
		List<WebElement> data = ddh.getAllDropDownData(reservationp.drpd_On_fromday);
		int i;
		SoftAssertionHelper sah= new  SoftAssertionHelper();
		
		for(i=0;i<data.size();i++){
			ddh.selectByVisibleText(reservationp.drpd_On_fromday, data.get(i).getText().trim());
			sah.assertEquals(ddh.getSelectedText(reservationp.drpd_On_fromday), data.get(i).getText().trim(),"verify correct option is selected");
			
		}
		sah.assertAll();
		
	}
	
	

	@Test(enabled=false)
	public void checkDropDownListFunctionality_FlightDetailsSection_ArrivingInList_ofReservationPage_ID53() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new ReservationPage(driver);
		ddh = new DropdownHelper(driver);
		List<WebElement> data = ddh.getAllDropDownData(reservationp.drpd_arrivingin);
		int i;
		SoftAssertionHelper sah= new  SoftAssertionHelper();
		
		for(i=0;i<data.size();i++){
			ddh.selectByVisibleText(reservationp.drpd_arrivingin, data.get(i).getText().trim());
			sah.assertEquals(ddh.getSelectedText(reservationp.drpd_arrivingin), data.get(i).getText().trim(),"verify correct option is selected");
			
		}
		sah.assertAll();
		
	}
	
	@Test(enabled=false)
	public void checkDropDownListFunctionality_FlightDetailsSection_ReturningMonthList_ofReservationPage_ID54() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new ReservationPage(driver);
		ddh = new DropdownHelper(driver);
		List<WebElement> data = ddh.getAllDropDownData(reservationp.drpd_returningmonth);
		int i;
		SoftAssertionHelper sah= new  SoftAssertionHelper();
		
		for(i=0;i<data.size();i++){
			ddh.selectByVisibleText(reservationp.drpd_returningmonth, data.get(i).getText().trim());
			sah.assertEquals(ddh.getSelectedText(reservationp.drpd_returningmonth), data.get(i).getText().trim(),"verify correct option is selected");
			
		}
		sah.assertAll();
		
	}
	
	
	@Test(enabled=false)
	public void checkDropDownListFunctionality_FlightDetailsSection_ReturningDayList_ofReservationPage_ID55() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new ReservationPage(driver);
		ddh = new DropdownHelper(driver);
		List<WebElement> data = ddh.getAllDropDownData(reservationp.drpd_returningday);
		int i;
		SoftAssertionHelper sah= new  SoftAssertionHelper();
		
		for(i=0;i<data.size();i++){
			ddh.selectByVisibleText(reservationp.drpd_returningday, data.get(i).getText().trim());
			sah.assertEquals(ddh.getSelectedText(reservationp.drpd_returningday), data.get(i).getText().trim(),"verify correct option is selected");
			
		}
		sah.assertAll();
		
	}
	
	
	@Test(enabled=false)
	public void checkDropDownListFunctionality_PreferencesSection_AirlineList_ofReservationPage_ID56() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new ReservationPage(driver);
		ddh = new DropdownHelper(driver);
		List<WebElement> data = ddh.getAllDropDownData(reservationp.drpd_airline);
		int i;
		SoftAssertionHelper sah= new  SoftAssertionHelper();
		
		for(i=0;i<data.size();i++){
			ddh.selectByVisibleText(reservationp.drpd_airline, data.get(i).getText().trim());
			sah.assertEquals(ddh.getSelectedText(reservationp.drpd_airline), data.get(i).getText().trim(),"verify correct option is selected");
			
		}
		sah.assertAll();
		
	}
	
	
	@Test(enabled=false)
	public void checkContinueButtonFunctionality_ofReservationPage_ID57() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new  ReservationPage(driver);
		reservationp.clickOnContinueButton();
		String url =driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getReservation2PageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getReservation2PageUrl()+"'");
		Boolean status = url.contains(getReservation2PageUrl());
		AssertionHelper.updateTestStatus(status);
	}
	
	
	@Test(enabled=false)
	public void checkItineraryLinkNavigation_ofReservationPage_ID58() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new  ReservationPage(driver);
		reservationp.clickOnItinerary();
		String url =driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getItineraryPageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getItineraryPageUrl()+"'");
		Boolean status = url.contains(getItineraryPageUrl());
		AssertionHelper.updateTestStatus(status);
	}
	
	@Test(enabled=false)
	public void checkProfileLinkNavigation_ofReservationPage_ID59() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new  ReservationPage(driver);
		reservationp.clickOnProfile();
		String url =driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getProfilePageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getProfilePageUrl()+"'");
		Boolean status = url.contains(getProfilePageUrl());
		AssertionHelper.updateTestStatus(status);
	}
	
	/*
	 @Test(enabled=false)
	public void checkCancelAllReservationButtonFunctionality_ofItineraryPage_ID60() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new  ReservationPage(driver);
		reservationp.clickOnItinerary();
		itineraryp = new  ItineraryPage(driver);
		itineraryp.
		String url =driver.getCurrentUrl();
		Boolean status = url.contains(getProfilePageUrl());
		AssertionHelper.updateTestStatus(status);
	}
	*/
	
	
	@Test(enabled=false)
	public void checkRadioButtonFunctionality_DepartSection_ofReservation2Page_ID61() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new  ReservationPage(driver);
		reservationp.clickOnContinueButton();
		reservation2p = new Reservation2Page(driver);
		
		reservation2p.clickOnRadioButton_Depart1();
		Boolean status = reservation2p.radiobtn_depart1.isSelected();
		SoftAssertionHelper softassert = new SoftAssertionHelper();
		softassert.assertTrue(status,"Verifying correct radio button is selected");
		
		reservation2p.clickOnRadioButton_Depart2();
		status = reservation2p.radiobtn_depart2.isSelected();
		softassert.assertTrue(status,"Verifying correct radio button is selected");
		
		reservation2p.clickOnRadioButton_Depart3();
		status = reservation2p.radiobtn_depart3.isSelected();
		softassert.assertTrue(status,"Verifying correct radio button is selected");
		
		reservation2p.clickOnRadioButton_Depart4();
		status = reservation2p.radiobtn_depart4.isSelected();
		softassert.assertTrue(status,"Verifying correct radio button is selected");
		
		softassert.assertAll();
		
	}
	
	@Test(enabled=false)
	public void checkRadioButtonFunctionality_ReturnSection_ofReservation2Page_ID62() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		reservationp = new  ReservationPage(driver);
		reservationp.clickOnContinueButton();
		reservation2p = new Reservation2Page(driver);
		
		reservation2p.clickOnRadioButton_Return1();
		Boolean status = reservation2p.radiobtn_return1.isSelected();
		SoftAssertionHelper softassert = new SoftAssertionHelper();
		softassert.assertTrue(status,"Verifying correct radio button is selected");
		
		reservation2p.clickOnRadioButton_Return2();
		status = reservation2p.radiobtn_return2.isSelected();
		softassert.assertTrue(status,"Verifying correct radio button is selected");
		
		reservation2p.clickOnRadioButton_Return3();;
		status = reservation2p.radiobtn_return3.isSelected();
		softassert.assertTrue(status,"Verifying correct radio button is selected");
		
		reservation2p.clickOnRadioButton_Return4();
		status = reservation2p.radiobtn_return4.isSelected();
		softassert.assertTrue(status,"Verifying correct radio button is selected");
		
		softassert.assertAll();
		
	}
	
	@Test(enabled=false)
	public void checkLabelFunctionality_DepartSection_ofReservation2Page_ID63() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		
		reservationp = new  ReservationPage(driver);
		ddh= new DropdownHelper(driver);
		ddh.selectByVisibleText(reservationp.drpd_departingfrom, "London");
		ddh.selectByVisibleText(reservationp.drpd_arrivingin, "New York");
		reservationp.clickOnContinueButton();
		
		reservation2p = new Reservation2Page(driver);
		String text = getElementText(reservation2p.lbl_depart_fromlocation_tolocation);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(text, "London to New York");
		AssertionHelper.updateTestStatus(status);
	
	}
	
	@Test(enabled=false)
	public void checkLabelFunctionality_ReturnSection_ofReservation2Page_ID64() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		
		reservationp = new  ReservationPage(driver);
		ddh= new DropdownHelper(driver);
		ddh.selectByVisibleText(reservationp.drpd_departingfrom, "London");
		ddh.selectByVisibleText(reservationp.drpd_arrivingin, "New York");
		reservationp.clickOnContinueButton();
		
		reservation2p = new Reservation2Page(driver);
		String text = getElementText(reservation2p.lbl_return_fromlocation_tolocation);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(text, "New York to London");
		AssertionHelper.updateTestStatus(status);
	
	}
	
	@Test(enabled=false)
	public void checkDepartureDateFunctionality_DepartSection_ofReservation2Page_ID65() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		
		reservationp = new  ReservationPage(driver);
		ddh= new DropdownHelper(driver);
		ddh.selectByVisibleText(reservationp.drpd_On_frommonth, "January");
		ddh.selectByVisibleText(reservationp.drpd_On_fromday, "1");
		reservationp.clickOnContinueButton();
		
		reservation2p = new Reservation2Page(driver);
		String text = getElementText(reservation2p.lbl_depart_date);
		vh = new VerificationHelper(driver);
		Calendar cal = Calendar.getInstance();
	
		Boolean status = vh.verifyTextEquals(text, "1/1/"+cal.get(Calendar.YEAR));
		AssertionHelper.updateTestStatus(status);
	
	}
	
	@Test(enabled=false)
	public void checkReturningDateFunctionality_ReturnSection_ofReservation2Page_ID66() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		
		reservationp = new  ReservationPage(driver);
		ddh= new DropdownHelper(driver);
		ddh.selectByVisibleText(reservationp.drpd_returningmonth, "February");
		ddh.selectByVisibleText(reservationp.drpd_returningday, "1");
		reservationp.clickOnContinueButton();
		
		reservation2p = new Reservation2Page(driver);
		String text = getElementText(reservation2p.lbl_return_date);
		vh = new VerificationHelper(driver);
		Calendar cal = Calendar.getInstance();
		Boolean status = vh.verifyTextEquals(text, "2/1/"+cal.get(Calendar.YEAR));
		AssertionHelper.updateTestStatus(status);
	}
	
	
	
	@Test(enabled=false)
	public void checkContinueButtonFunctionality_ofReservation2Page_ID67() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		
		reservationp = new  ReservationPage(driver);
		reservationp.clickOnContinueButton();
		
		reservation2p = new Reservation2Page(driver);
		reservation2p.clickOnContinue();
		String url = driver.getCurrentUrl();
		log.info("Verifying navigated url='"+url+"' is equals to='"+getPurchasePageUrl()+"'");
		test.log(Status.INFO,"Verifying navigated url='"+url+"' is equals to='"+getPurchasePageUrl()+"'");
		Boolean status = url.contains(getPurchasePageUrl());
		AssertionHelper.updateTestStatus(status);
	}
	
	
	@Test(enabled=false)
	public void checkLabelFunctionality_ofPurchasePage_ID68() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
	
		reservationp = new  ReservationPage(driver);
		ddh= new DropdownHelper(driver);
		ddh.selectByVisibleText(reservationp.drpd_departingfrom, "London");
		ddh.selectByVisibleText(reservationp.drpd_arrivingin, "New York");
		
		reservationp.clickOnContinueButton();
		reservation2p= new Reservation2Page(driver);
		reservation2p.clickOnContinue();
		purchsep = new PurchasePage(driver);
		
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals("London to New York", purchsep.lbl_summary_fromlocation_tolocation1.getText());
		AssertionHelper.updateTestStatus(status);
	}
	
	

	@Test(enabled=false)
	public void checkLabelFunctionality_ofPurchasePage_ID69() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
	
		reservationp = new  ReservationPage(driver);
		ddh= new DropdownHelper(driver);
		ddh.selectByVisibleText(reservationp.drpd_departingfrom, "London");
		ddh.selectByVisibleText(reservationp.drpd_arrivingin, "New York");
		
		reservationp.clickOnContinueButton();
		reservation2p= new Reservation2Page(driver);
		reservation2p.clickOnContinue();
		purchsep = new PurchasePage(driver);
		
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals("New York to London", purchsep.lbl_summary_fromlocation_tolocation2.getText());
		AssertionHelper.updateTestStatus(status);
	}
	
	@Test(enabled=false)
	public void checkDepartureDateFunctionality_summarySection_ofPurchasePage_ID70() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		
		reservationp = new  ReservationPage(driver);
		ddh= new DropdownHelper(driver);
		ddh.selectByVisibleText(reservationp.drpd_On_frommonth, "January");
		ddh.selectByVisibleText(reservationp.drpd_On_fromday, "1");
		reservationp.clickOnContinueButton();
		
		reservation2p = new Reservation2Page(driver);
		reservation2p.clickOnContinue();
		purchsep = new PurchasePage(driver);
		Calendar cal = Calendar.getInstance();
		
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals("1/1/"+cal.get(Calendar.YEAR), purchsep.lbl_summary_date1.getText());
		AssertionHelper.updateTestStatus(status);
		
	}
	
	
	@Test(enabled=false)
	public void checkReturningDateFunctionality_summarySection_ofPurchasePage_ID71() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		
		reservationp = new  ReservationPage(driver);
		ddh= new DropdownHelper(driver);
		ddh.selectByVisibleText(reservationp.drpd_returningmonth, "February");
		ddh.selectByVisibleText(reservationp.drpd_returningday, "1");
		reservationp.clickOnContinueButton();
		
		reservation2p = new Reservation2Page(driver);
		reservation2p.clickOnContinue();
		purchsep = new PurchasePage(driver);
		Calendar cal = Calendar.getInstance();
		
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals("2/1/"+cal.get(Calendar.YEAR), purchsep.lbl_summary_date2.getText());
		AssertionHelper.updateTestStatus(status);
		
	}
	
	
	
	@Test(enabled=false)
	public void checklabelFunctionality_summarySection_ofPurchasePage_ID72() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		
		reservationp = new  ReservationPage(driver);
		reservationp.clickOnContinueButton();
		
		reservation2p = new Reservation2Page(driver);
		reservation2p.clickOnRadioButton_Depart2();
		 String text = getElementText(reservation2p.lbl_depart_flight_airline2);
		reservation2p.clickOnContinue();
		purchsep = new PurchasePage(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(text, purchsep.lbl_summary_flight_airline1.getText());
		AssertionHelper.updateTestStatus(status);
	
	}
	
	@Test(enabled=true)
	public void checklabelFunctionality_summarySection_ofPurchasePage_ID73() {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(), getValidPassword());
		
		reservationp = new  ReservationPage(driver);
		reservationp.clickOnContinueButton();
		
		reservation2p = new Reservation2Page(driver);
		reservation2p.clickOnRadioButton_Return2();
		 String text = getElementText(reservation2p.lbl_return_flight_airline2);
		reservation2p.clickOnContinue();
		purchsep = new PurchasePage(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(text, purchsep.lbl_summary_flight_airline2.getText());
		AssertionHelper.updateTestStatus(status);
		
	
	}
	
	
}
