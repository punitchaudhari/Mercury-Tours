package com.uiFrameworkVersion1.companyName.mercury_tours.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;

public class SignOnPage {
	 WebDriver driver;
	Logger log = LoggerHelper.getLogger(SignOnPage.class);

	// constructor of this class
	public SignOnPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("SignOnPage Class Object Created");

	}

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

	@FindBy(xpath = "//a[contains(text(),'registration')]")
	WebElement link_registration_form;

	@FindBy(xpath = "//input[@name='userName']")
	WebElement txtb_username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txtb_password;

	@FindBy(xpath = "//input[@name='login']")
	WebElement btn_submit;

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

	public RegisterPage clickOnRegistrationformlink() {
		log.info("Clicking On Registration Form Link Link");
		link_registration_form.click();
		return new RegisterPage(driver);
	}

	// login functionality methods starts here

	public void typeOnUserName(String username) {
		log.info("typing " + username + " on username feild");
		txtb_username.sendKeys(username);
	}

	public void typeOnPassword(String password) {
		log.info("typing " + password + " on password feild");
		txtb_password.sendKeys(password);
	}

	public ReservationPage clickOnSubmitButton() {
		log.info("Clicking On Submit Button");
		btn_submit.click();
		return new ReservationPage(driver);

	}

	public void signIn(String username,String password){
		typeOnUserName(username);
		typeOnPassword(password);
		clickOnSubmitButton();
	}
}
