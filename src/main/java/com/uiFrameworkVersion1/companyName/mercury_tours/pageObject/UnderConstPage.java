package com.uiFrameworkVersion1.companyName.mercury_tours.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;

public class UnderConstPage {
	Logger log = LoggerHelper.getLogger(UnderConstPage.class);
	 WebDriver driver;

	public UnderConstPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("UnderConstPage Class Object Created");

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

	@FindBy(xpath = "//a[contains(text(),'SIGN-ON')]")
	WebElement link_signon;
	
	@FindBy(xpath = "//a[contains(text(),'SIGN-OFF')]")
	WebElement link_signoff;

	@FindBy(xpath = "//a[contains(text(),'REGISTER')]")
	WebElement link_register;

	@FindBy(xpath = "//a[contains(text(),'SUPPORT')]")
	WebElement link_support;

	@FindBy(xpath = "//a[contains(text(),'CONTACT')]")
	WebElement link_contact;

	@FindBy(xpath = "//img[@src=\"/images/forms/home.gif\"]")
	WebElement btn_back_to_home;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/p[1]/font[1]/b[1]/font[1]")
	WebElement lbl_underconstruction_thissection;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/p[1]/font[1]/b[1]/font[2]/b[1]/font[1]")
	WebElement lbl_undercontruction_sorryforinconvienece;

	
	

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

	public SignOnPage clickOnSignOn() {
		log.info("Clicking On SignOn Link");
		link_signon.click();
		return new SignOnPage(driver);
	}

	public SignOnPage clickOnSignOff() {
		log.info("Clicking On SignOff Link");
		link_signoff.click();
		return new SignOnPage(driver);
	}
	public RegisterPage clickOnRegister() {
		log.info("Clicking On Register Link");
		link_register.click();
		return new RegisterPage(driver);
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

	public WelcomePage clickOnBackToHome() {
		log.info("Clicking On Back To Home Link");
		btn_back_to_home.click();
		return new WelcomePage(driver);
	}

}
