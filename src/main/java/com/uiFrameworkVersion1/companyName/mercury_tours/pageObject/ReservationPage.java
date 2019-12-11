package com.uiFrameworkVersion1.companyName.mercury_tours.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;

public class ReservationPage {
	Logger log = LoggerHelper.getLogger(ReservationPage.class);
	WebDriver driver;

	public ReservationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("ReservationPage Class Object Created");
		TestBase.test.log(Status.INFO, "ReservationPage Class Object Created");
		

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

	@FindBy(xpath = "//body//b//input[1]")
	public	WebElement radiobtn_roundtrip;

	@FindBy(xpath = "//body//b//input[2]")
	public	WebElement radiobtn_oneway;

	@FindBy(xpath = "//select[@name='passCount']")
	public	WebElement drpd_passengers;

	@FindBy(xpath = "//select[@name='fromPort']")
	public	WebElement drpd_departingfrom;

	@FindBy(xpath = "//select[@name='fromMonth']")
	public	WebElement drpd_On_frommonth;

	@FindBy(xpath = "//select[@name='fromDay']")
	public	WebElement drpd_On_fromday;

	@FindBy(xpath = "//select[@name='toPort']")
	public	WebElement drpd_arrivingin;

	@FindBy(xpath = "//select[@name='toMonth']")
	public	WebElement drpd_returningmonth;

	@FindBy(xpath = "//select[@name='toDay']")
	public	WebElement drpd_returningday;

	@FindBy(xpath = "//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form[@name='findflight']/table/tbody/tr/td/font/input[1]")
	public	WebElement radiobtn_serviceclass_Economyclass;

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	public	WebElement radiobtn_serviceclass_Businessclass;

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")
	public	WebElement radiobtn_serviceclass_Firstclass;

	@FindBy(xpath = "//select[@name='airline']")
	public	WebElement drpd_airline;

	@FindBy(xpath = "//input[@name='findFlights']")
	WebElement btn_continue;
	
	@FindBy(xpath = "//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form[@name='findflight']/table/tbody/tr/td/b/font[1]")
	public	WebElement lbl_flightdetails_roundtrip_oneway;
	
	@FindBy(xpath = "//tr[9]//td[2]")
	public	WebElement lbl_preferences_economy_business_first;
	
	
	
	
	

	
	
	
	
	

	// page methods starts from here

	// clicking on link element methods startes here

	public WelcomePage clickOnHome() {
		log.info("Clicking On home Link");
		TestBase.test.log(Status.INFO,"Clicking On home Link" );		
		link_home.click();
		return new WelcomePage(driver);
	}

	public IndexPage clickOnFlights() {
		log.info("Clicking On Flights Link");
		TestBase.test.log(Status.INFO, "Clicking On Flights Link");
		link_flights.click();
		return new IndexPage(driver);
	}

	public UnderConstPage clickOnHotels() {
		log.info("Clicking On Hotels Link");
		TestBase.test.log(Status.INFO, "Clicking On Hotels Link");	
		link_hotels.click();
		return new UnderConstPage(driver);
	}

	public UnderConstPage clickOnCarRentals() {
		log.info("Clicking On CarRentals Link");
		TestBase.test.log(Status.INFO, "Clicking On CarRentals Link");
		link_car_rentals.click();
		return new UnderConstPage(driver);
	}

	public CruisesPage clickOnCruises() {
		log.info("Clicking On Cruises Link");
		TestBase.test.log(Status.INFO, "Clicking On Cruises Link");	
		link_cruises.click();
		return new CruisesPage(driver);
	}

	public UnderConstPage clickOnDestinations() {
		log.info("Clicking On Destinations Link");
		TestBase.test.log(Status.INFO, "Clicking On Destinations Link");	
		link_destinations.click();
		return new UnderConstPage(driver);
	}

	public UnderConstPage clickOnVacations() {
		log.info("Clicking On Vacations Link");
		TestBase.test.log(Status.INFO, "Clicking On Vacations Link");	
		link_vacations.click();
		return new UnderConstPage(driver);
	}

	public SignOnPage clickOnSignOff() {
		log.info("Clicking On SignOff Link");
		TestBase.test.log(Status.INFO,"Clicking On SignOff Link" );		
		link_signoff.click();
		return new SignOnPage(driver);
	}

	public ItineraryPage clickOnItinerary() {
		log.info("Clicking On Itinerary Link");
		TestBase.test.log(Status.INFO, "Clicking On Itinerary Link");		
		link_itinerary.click();
		return new ItineraryPage(driver);
	}

	public ProfilePage clickOnProfile() {
		log.info("Clicking On profile Link");
		TestBase.test.log(Status.INFO, "Clicking On profile Link");	
		link_profile.click();
		return new ProfilePage(driver);
	}

	public UnderConstPage clickOnSupprt() {
		log.info("Clicking On Support Link");
		TestBase.test.log(Status.INFO, "Clicking On Support Link");		
		link_support.click();
		return new UnderConstPage(driver);
	}

	public UnderConstPage clickOnContact() {
		log.info("Clicking On Contact Link");
		TestBase.test.log(Status.INFO, "Clicking On Contact Link");		
		link_contact.click();
		return new UnderConstPage(driver);
	}

	public void clickOnRadioButton_RoundTrip() {
		log.info("Clicking On Round Trip Radio Button");
		TestBase.test.log(Status.INFO, "Clicking On Round Trip Radio Button");		
		radiobtn_roundtrip.click();
	}

	public void clickOnRadioButton_OneWay() {
		log.info("Clicking On One Way Radio Button");
		TestBase.test.log(Status.INFO,"Clicking On One Way Radio Button" );
		radiobtn_oneway.click();
	}

	public void clickOnRadioButton_EconomyClass() {
		log.info("Clicking On Economy Class Radio Button");
		TestBase.test.log(Status.INFO,"Clicking On Economy Class Radio Button" );	
		radiobtn_serviceclass_Economyclass.click();
	}

	public void clickOnRadioButton_BusinessClass() {
		log.info("Clicking On Business Class Radio Button");
		TestBase.test.log(Status.INFO, "Clicking On Business Class Radio Button");		
		radiobtn_serviceclass_Businessclass.click();
	}

	public void clickOnRadioButton_FirstClass() {
		log.info("Clicking On FirstClass Radio Button");
		TestBase.test.log(Status.INFO, "Clicking On FirstClass Radio Button");		
		radiobtn_serviceclass_Firstclass.click();
	}

	public Reservation2Page clickOnContinueButton() {
		log.info("Clicking on continue button");
		TestBase.test.log(Status.INFO, "Clicking on continue button");
		btn_continue.click();
		return new Reservation2Page(driver);
	}

}
