package com.uiFrameworkVersion1.companyName.mercury_tours.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;

public class Reservation2Page {

	Logger log = LoggerHelper.getLogger(Reservation2Page.class);
	WebDriver driver;

	public Reservation2Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Reservation2Page Class Object Created");
	}

	// Links Locaters starts from here

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement link_home;

	@FindBy(xpath = "//a[contains(text(),'Flights')]")
	WebElement link_flights;

	@FindBy(xpath = "//a[contains(text(),'Hotels')]")
	WebElement link_hotels;

	@FindBy(xpath = "//a[contains(text(),'Car Rentals')]")
	WebElement link_car_rentals;

	@FindBy(xpath = "//a[contains(text(),'Cruises')]")
	WebElement link_cruises;

	@FindBy(xpath = "//a[contains(text(),'Destinations')]")
	WebElement link_destinations;

	@FindBy(xpath = "//a[contains(text(),'Vacations')]")
	WebElement link_vacations;

	@FindBy(xpath = "//a[contains(text(),'SIGN-OFF')]")
	WebElement link_signoff;

	@FindBy(xpath = "//a[contains(text(),'ITINERARY')]")
	WebElement link_itinerary;

	@FindBy(xpath = "//a[contains(text(),'PROFILE')]")
	WebElement link_profile;

	@FindBy(xpath = "//a[contains(text(),'SUPPORT')]")
	WebElement link_support;

	@FindBy(xpath = "//a[contains(text(),'CONTACT')]")
	WebElement link_contact;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[3]//td[1]//input[1]")
	public WebElement radiobtn_depart1;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[5]//td[1]//input[1]")
	public WebElement radiobtn_depart2;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[7]//td[1]//input[1]")
	public WebElement radiobtn_depart3;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[9]//td[1]//input[1]")
	public WebElement radiobtn_depart4;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[3]//td[1]//input[1]")
	public WebElement radiobtn_return1;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[5]//td[1]//input[1]")
	public WebElement radiobtn_return2;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[7]//td[1]//input[1]")
	public WebElement radiobtn_return3;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[9]//td[1]//input[1]")
	public WebElement radiobtn_return4;

	@FindBy(xpath = "//input[@name='reserveFlights']")
	WebElement btn_continue;

	@FindBy(xpath ="//table//table//table//table//table[1]//tbody[1]//tr[1]//td[1]//table[1]//tbody[1]//tr[2]//td[1]//b[1]//font[1]")
	public WebElement lbl_depart_fromlocation_tolocation;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/b[1]/font[1]")
	public WebElement lbl_depart_date;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/font[1]/b[1]")
	public WebElement lbl_depart_flight_airline1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[3]/td[3]/font[1]")
	public WebElement lbl_depart_depart_time1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[3]/td[4]/font[1]")
	public WebElement lbl_depart_stops_stop1;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[4]//td[1]//font[1]//font[1]//b[1]")
	public WebElement lbl_depart_flight_airline1_price1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/font[1]/b[1]")
	public WebElement lbl_depart_flight_airline2;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[3]/font[1]")
	public WebElement lbl_depart_depart_time2;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[5]//td[4]//font[1]")
	public WebElement lbl_depart_stops_stop2;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[6]//td[1]//font[1]//font[1]//b[1]")
	public WebElement lbl_depart_flight_airline2_price2;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/font[1]/b[1]")
	public WebElement lbl_depart_flight_airline3;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[7]/td[3]/font[1]")
	public WebElement lbl_depart_depart_time3;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[7]//td[4]//font[1]")
	public WebElement lbl_depart_stops_stop3;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[8]//td[1]//font[1]//font[1]//b[1]")
	public WebElement lbl_depart_flight_airline3_price3;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[9]/td[2]/font[1]/b[1]")
	public WebElement lbl_depart_flight_airline4;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[9]/td[3]/font[1]")
	public WebElement lbl_depart_depart_time4;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[9]//td[4]//font[1]")
	public WebElement lbl_depart_stops_stop4;

	@FindBy(xpath = "//table//table//table//table//table[1]//tbody[1]//tr[10]//td[1]//font[1]//font[1]//b[1]")
	public WebElement lbl_depart_flight_airline4_price4;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[1]//td[1]//table[1]//tbody[1]//tr[2]//td[1]//b[1]//font[1]")
	public WebElement lbl_return_fromlocation_tolocation;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/b[1]/font[1]")
	public WebElement lbl_return_date;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[3]/td[2]/font[1]/b[1]")
	public WebElement lbl_return_flight_airline1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[3]/td[3]/font[1]")
	public WebElement lbl_return_depart_time1;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[3]//td[4]//font[1]")
	public WebElement lbl_return_stops_stop1;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[4]//td[1]//font[1]//font[1]//b[1]")
	public WebElement lbl_return_flight_airline1_price1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[5]/td[2]/font[1]/b[1]")
	public WebElement lbl_return_flight_airline2;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[5]/td[3]/font[1]")
	public WebElement lbl_return_depart_time2;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[5]//td[4]//font[1]")
	public WebElement lbl_return_stops_stop2;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[6]//td[1]//font[1]//font[1]//b[1]")
	public WebElement lbl_return_flight_airline2_price2;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[7]/td[2]/font[1]/b[1]")
	public WebElement lbl_return_flight_airline3;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[7]/td[3]/font[1]")
	public WebElement lbl_return_depart_time3;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[7]//td[4]//font[1]")
	public WebElement lbl_return_stops_stop3;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[8]//td[1]//font[1]//font[1]//b[1]")
	public WebElement lbl_return_flight_airline3_price3;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[9]/td[2]/font[1]/b[1]")
	public WebElement lbl_return_flight_airline4;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[9]/td[3]/font[1]")
	public WebElement lbl_return_depart_time4;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[9]//td[4]//font[1]")
	public WebElement lbl_return_stops_stop4;

	@FindBy(xpath = "//table[2]//tbody[1]//tr[10]//td[1]//font[1]//font[1]//b[1]")
	public WebElement lbl_return_flight_airline4_price4;

	// page methods starts from here

	// clicking on link element methods startes here

	public WelcomePage clickOnHome() {
		log.info("Clicking On Home Link");
		link_home.click();
		return new WelcomePage(driver);
	}

	public IndexPage clickOnFlights() {
		log.info("Clicking On Flights Link");
		link_flights.click();
		return new IndexPage(driver);
	}

	public UnderConstPage clickOnHotels() {
		log.info("Clicking On Hotels Link");
		link_hotels.click();
		return new UnderConstPage(driver);
	}

	public UnderConstPage clickOnCarRentals() {
		log.info("Clicking On CarRentals Link");
		link_car_rentals.click();
		return new UnderConstPage(driver);
	}

	public CruisesPage clickOnCruises() {
		log.info("Clicking On Cruises Link");
		link_cruises.click();
		return new CruisesPage(driver);
	}

	public UnderConstPage clickOnDestinations() {
		log.info("Clicking On Destinations Link");
		link_destinations.click();
		return new UnderConstPage(driver);
	}

	public UnderConstPage clickOnVacations() {
		log.info("Clicking On Vacations Link");
		link_vacations.click();
		return new UnderConstPage(driver);
	}

	public SignOnPage clickOnSignOff() {
		log.info("Clicking On SignOff Link");
		link_signoff.click();
		return new SignOnPage(driver);
	}

	public ItineraryPage clickOnItinerary() {
		log.info("Clicking On Itinerary Link");
		link_itinerary.click();
		return new ItineraryPage(driver);
	}

	public ProfilePage clickOnProfile() {
		log.info("Clicking On profile Link");
		link_profile.click();
		return new ProfilePage(driver);
	}

	public UnderConstPage clickOnSupprt() {
		log.info("Clicking On Support Link");
		link_support.click();
		return new UnderConstPage(driver);
	}

	public UnderConstPage clickOnContact() {
		log.info("Clicking On Contact Link");
		link_contact.click();
		return new UnderConstPage(driver);
	}

	public void clickOnRadioButton_Depart1() {
		log.info("Clicking On Depart1 Radio Button");
		radiobtn_depart1.click();
	}

	public void clickOnRadioButton_Depart2() {
		log.info("Clicking On Depart2 Radio Button");
		radiobtn_depart2.click();
	}

	public void clickOnRadioButton_Depart3() {
		log.info("Clicking On Depart3 Radio Button");
		radiobtn_depart3.click();
	}

	public void clickOnRadioButton_Depart4() {
		log.info("Clicking On Depart4 Radio Button");
		radiobtn_depart4.click();
	}

	public void clickOnRadioButton_Return1() {
		log.info("Clicking On return1 Radio Button");
		radiobtn_return1.click();
	}

	public void clickOnRadioButton_Return2() {
		log.info("Clicking On return2 Radio Button");
		radiobtn_return2.click();
	}

	public void clickOnRadioButton_Return3() {
		log.info("Clicking On return3 Radio Button");
		radiobtn_return3.click();
	}

	public void clickOnRadioButton_Return4() {
		log.info("Clicking On return4 Radio Button");
		radiobtn_return4.click();
	}

	public PurchasePage clickOnContinue() {
		log.info("Clicking on continue button");
		btn_continue.click();
		return new PurchasePage(driver);
	}

}
