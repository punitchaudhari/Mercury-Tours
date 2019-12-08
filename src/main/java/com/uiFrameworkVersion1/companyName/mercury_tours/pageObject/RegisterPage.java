package com.uiFrameworkVersion1.companyName.mercury_tours.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.select.DropdownHelper;

public class RegisterPage {
	 Logger log = LoggerHelper.getLogger(RegisterPage.class);

	 WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("RegisterPage Class Object Created");

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

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement txtb_firstname;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement txtb_lastname;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement txtb_phone;

	@FindBy(xpath = "//input[@id='userName']")
	WebElement txtb_email;

	@FindBy(xpath = "//input[@name='address1']")
	WebElement txtb_address1;

	@FindBy(xpath = "//input[@name='address2']")
	WebElement txtb_address2;

	@FindBy(xpath = "//input[@name='city']")
	WebElement txtb_city;

	@FindBy(xpath = "//input[@name='state']")
	WebElement txtb_state_province;

	@FindBy(xpath = "//input[@name='postalCode']")
	WebElement txtb_postalcode;

	@FindBy(xpath = "//select[@name='country']")
	public WebElement drpd_country;

	@FindBy(xpath = "//input[@id='email']")
	WebElement txtb_username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txtb_password;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement txtb_confirmpassword;

	@FindBy(xpath = "//input[@name='register']")
	WebElement btn_submit;

	// page methods starts from here

	// clicking on link element methods startes here

	public  WelcomePage clickOnHome() {
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

	public void typeOnFirstName(String firstname) {
		log.info("Typing " + firstname + " on firstname feild");
		txtb_firstname.sendKeys(firstname);

	}

	public void typeOnLastName(String lastname) {
		log.info("Typing " + lastname + " on lastname feild");
		txtb_lastname.sendKeys(lastname);
	}

	public void typeOnPhone(String phone) {
		log.info("Typing " + phone + " on phone feild");
		txtb_phone.sendKeys(phone);

	}

	public  void typeOnEmail(String email) {
		log.info("Typing " + email + " on email feild");
		txtb_email.sendKeys(email);

	}

	public void typeOnAddress1(String address1) {
		log.info("Typing " + address1 + " on first address box feild");
		txtb_address1.sendKeys(address1);
	}

	public void typeOnAddress2(String address2) {
		log.info("Typing " + address2 + " on second address box feild");
		txtb_address2.sendKeys(address2);
	}

	public void typeOnCity(String city) {
		log.info("Typing " + city + " on city feild");
		txtb_city.sendKeys(city);
	}

	public void typeOnState(String state) {
		log.info("Typing " + state + " on state feild");
		txtb_state_province.sendKeys(state);
	}

	public void typeOnPostalCode(String postalcode) {
		log.info("Typing " + postalcode + " on postal code feild");

		txtb_postalcode.sendKeys(postalcode);
	}

	public void ClickOnCountry() {
		log.info("Clicking On Country Dropdown Box");
		drpd_country.click();

	}

	public void typeOnUsername(String username) {
		log.info("Typing " + username + " on username feild");
		txtb_username.sendKeys(username);
	}

	public void typeOnPassword(String password) {
		log.info("Typing " + password + " on password feild");
		txtb_password.sendKeys(password);
	}

	public void typeOnConfirmPassword(String confirmpassowrd) {
		log.info("Typing " + confirmpassowrd + " on confirm passowrd feild");
		txtb_confirmpassword.sendKeys(confirmpassowrd);
	}

	public CreateAccountSuccessPage ClickOnSubmit() {
		log.info("Clicking On Submit Button");
		btn_submit.click();
		return new CreateAccountSuccessPage(driver);

	}

	
	
	
	
}
