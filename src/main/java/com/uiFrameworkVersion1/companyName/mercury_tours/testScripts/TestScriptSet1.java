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
	Logger log =LoggerHelper.getLogger(Register_Login_Logout.class);
	RegisterPage rp;
	HomePage hp;
	IndexPage ip;
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
	
	@Test(enabled=true)
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
	
	
	@Test(enabled=true)
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
	
	@Test(enabled=true)
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
	
	@Test(enabled=true)
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
	
	

	@Test(enabled=true)
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
	
	@Test(enabled=true)
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
	
	
	@Test(enabled=true)
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
	
	
	@Test(enabled=true)
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
	
	
	//
	
	
	
	
	
}
