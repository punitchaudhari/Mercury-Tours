package com.uiFrameworkVersion1.companyName.mercury_tours.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;

public class Purchase2Page {

	Logger log = LoggerHelper.getLogger(Purchase2Page.class);
	WebDriver driver;

	public Purchase2Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Purchase2Page Class Object Created");
		TestBase.test.log(Status.INFO, "Purchase2Page Class Object Created");
		

	}
	
	// Links Locaters starts from here

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	public WebElement link_home;

	@FindBy(xpath = "//a[contains(text(),'Flights')]")
	public WebElement link_flights;

	@FindBy(xpath = "//a[contains(text(),'Hotels')]")
	public WebElement link_hotels;

	@FindBy(xpath = "//a[contains(text(),'Car Rentals')]")
	public WebElement link_car_rentals;

	@FindBy(xpath = "//a[contains(text(),'Cruises')]")
	public WebElement link_cruises;

	@FindBy(xpath = "//a[contains(text(),'Destinations')]")
	public WebElement link_destinations;

	@FindBy(xpath = "//a[contains(text(),'Vacations')]")
	public WebElement link_vacations;

	@FindBy(xpath = "//a[contains(text(),'SIGN-OFF')]")
	public WebElement link_signoff;

	@FindBy(xpath = "//a[contains(text(),'REGISTER')]")	
	public WebElement link_register;

	@FindBy(xpath = "//a[contains(text(),'SUPPORT')]")
	public WebElement link_support;

	@FindBy(xpath = "//a[contains(text(),'CONTACT')]")
	public WebElement link_contact;
	
	@FindBy(xpath = "//td//td//td//td//td[1]//a[1]//img[1]")
	public WebElement btn_backtoflights;
	
	@FindBy(xpath = "//td//td//td//td[2]//a[1]//img[1]")
	public WebElement btn_backtohome;
	
	@FindBy(xpath = "//td[3]//a[1]//img[1]")
	public WebElement btn_logout;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/p[1]/font[1]/b[1]/font[2]")
	public WebElement lbl_flightconfirmation_mesate;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/b[1]/font[1]/font[1]/b[1]/font[1]")
	public WebElement lbl_flightconfirmation_code1;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/font[1]/b[1]")
	public WebElement lbl_flightconfirmation_code2;
	
	@FindBy(xpath = "//tr//tr//tr//tr//tr[3]//td[1]")
	public WebElement lbl_departing;
	
	@FindBy(xpath = "//tr//tr//tr//tr//tr[5]//td[1]")
	public WebElement lbl_returning;
	
	@FindBy(xpath = "//tr//tr//tr//tr//tr[7]//td[1]")
	public WebElement lbl_passengers;
	
	@FindBy(xpath = "//tr[9]//td[1]//p[1]")
	public WebElement lbl_billedto;
	
	
	@FindBy(xpath = "//tr[11]//td[1]//p[1]")
	public WebElement lbl_deliveryaddress;
	
	
	@FindBy(xpath = "//td[@class='data_left']//tr[1]//td[2]")
	public WebElement lbl_totaltaxes;
	
	
	@FindBy(xpath = "//tr//tr//tr//tr//tr[2]//td[2]")
	public WebElement lbl_totalprice;
	

	

	// page methods starts from here

		// clicking on link element methods startes here

		public WelcomePage clickOnHome() {
			log.info("Clicking On Home Link");
			TestBase.test.log(Status.INFO,"Clicking On Home Link" );
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
			TestBase.test.log(Status.INFO,"Clicking On Destinations Link" );
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
			TestBase.test.log(Status.INFO, "Clicking On SignOff Link");
			link_signoff.click();
			return new SignOnPage(driver);
		}

		public RegisterPage clickOnRegister() {
			log.info("Clicking On Register Link");
			TestBase.test.log(Status.INFO, "Clicking On Register Link");
			link_register.click();
			return new RegisterPage(driver);
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
		
		public  ReservationPage clickOnBackToFlights() {
			log.info("Clicking On back to flights button");
			TestBase.test.log(Status.INFO, "Clicking On back to flights button");
			btn_backtoflights.click();
			return new ReservationPage(driver);
		}
		public  WelcomePage clickOnBackToHome() {
			log.info("Clicking On back to home button");
			TestBase.test.log(Status.INFO, "Clicking On back to home button");
			btn_backtohome.click();
			return new WelcomePage(driver);
		}
		public  SignOnPage clickOnLogout() {
			log.info("Clicking On logout button");
			TestBase.test.log(Status.INFO,"Clicking On logout button" );
			btn_logout.click();
			return new SignOnPage(driver);
		}
		
		
}
