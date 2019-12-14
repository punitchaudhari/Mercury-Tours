package com.uiFrameworkVersion1.companyName.mercury_tours.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.testbase.TestBase;

public class PurchasePage {

	private Logger log = LoggerHelper.getLogger(PurchasePage.class);
	WebDriver driver;

	public PurchasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("PurchasePage Class Object Created");

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

	@FindBy(xpath = "//input[@name='passFirst0']")
	public WebElement txtb_passenger_firstname;

	@FindBy(xpath = "//input[@name='passLast0']")
	public WebElement txtb_passenger_lastname;

	@FindBy(xpath = "//select[@name='pass.0.meal']")
	public WebElement drpd_passenger_meal;

	@FindBy(xpath = "//select[@name='creditCard']")
	public WebElement drpd_creditcard_cardtype;

	@FindBy(xpath = "//input[@name='creditnumber']")
	public WebElement txtb_creditcard_number;

	@FindBy(xpath = "//select[@name='cc_exp_dt_mn']")
	public WebElement drpd_creditcard_expirationmonth;

	@FindBy(xpath = "//select[@name='cc_exp_dt_yr']")
	public WebElement drpd_creditcard_expirationyear;

	@FindBy(xpath = "//input[@name='cc_frst_name']")
	public WebElement txtb_creditcard_firstname;

	@FindBy(xpath = "//input[@name='cc_mid_name']")
	public WebElement txtb_creditcard_midname;

	@FindBy(xpath = "//input[@name='cc_last_name']")
	public WebElement txtb_creditcard_lastname;

	@FindBy(xpath = "//tr[8]//td[2]//input[1]")
	public WebElement checkb_billing_ticketlesstravel;

	@FindBy(xpath = "//input[@name='billAddress1']")
	public WebElement txtb_billing_address1;

	@FindBy(xpath = "//input[@name='billAddress2']")
	public WebElement txtb_billing_address2;

	@FindBy(xpath = "//input[@name='billCity']")
	public WebElement txtb_billing_city;

	@FindBy(xpath = "//input[@name='billState']")
	public WebElement txtb_billing_state_provinance;

	@FindBy(xpath = "//input[@name='billZip']")
	public WebElement txtb_billing_postalcode;

	@FindBy(xpath = "//select[@name='billCountry']")
	public WebElement drpd_billing_country;

	@FindBy(xpath = "//tr[14]//td[2]//input[1]")
	public WebElement checkb_delivey_same_as_billing_address;

	@FindBy(xpath = "//input[@name='delAddress1']")
	public WebElement txtb_delivery_address1;

	@FindBy(xpath = "//input[@name='delAddress2']")
	public WebElement txtb_delivery_address2;

	@FindBy(xpath = "//input[@name='delCity']")
	public WebElement txtb_delivery_city;

	@FindBy(xpath = "//input[@name='delState']")
	public WebElement txtb_delivery_stateprovinance;

	@FindBy(xpath = "//input[@name='delZip']")
	public WebElement txtb_delivery_postalcode;

	@FindBy(xpath = "//select[@name='delCountry']")
	public WebElement drpd_delivey_country;

	@FindBy(xpath = "//input[@name='buyFlights']")
	public WebElement btn_securePurchase;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/b[1]/font[1]")
	public WebElement lbl_summary_fromlocation_tolocation1;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/b[1]/font[1]")
	public WebElement lbl_summary_date1;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/font[1]/b[1]")
	public WebElement lbl_summary_flight_airline1;
	
	@FindBy(xpath = "//tr[3]//td[2]//font[1]")
	public WebElement lbl_summary_class1;
	
	@FindBy(xpath = "//tr[3]//td[3]//font[1]")
	public WebElement lbl_summary_price1;
	
	
	
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/b[1]/font[1]")
	public WebElement lbl_summary_fromlocation_tolocation2;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[4]/td[2]/b[1]/font[1]")
	public WebElement lbl_summary_date2;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[6]/td[1]/font[1]/font[1]/font[1]/b[1]")
	public WebElement lbl_summary_flight_airline2;
	
	@FindBy(xpath = "//tr//tr//tr//tr//tr//tr[6]//td[2]//font[1]")
	public WebElement lbl_summary_class2;
	
	@FindBy(xpath = "//tr//tr//tr//tr//tr//tr[6]//td[3]//font[1]")
	public WebElement lbl_summary_price2;
	
	
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[7]/td[2]/font[1]")
	public WebElement lbl_summary_passengers;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[8]/td[2]/font[1]")
	public WebElement lbl_summary_taxes;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[9]/td[2]/font[1]/b[1]")
	public WebElement lbl_summary_totalprice;
	

	

	// page methods starts from here

	// clicking on link element methods startes here

	public WelcomePage clickOnHome() {
		log.info("Clicking On Home Link");
		TestBase.test.log(Status.INFO, "Clicking On Home Link");
		
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
		TestBase.test.log(Status.INFO,"Clicking On Hotels Link" );
		
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
		TestBase.test.log(Status.INFO,"Clicking On Cruises Link" );
		
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
		TestBase.test.log(Status.INFO,"Clicking On Vacations Link" );
		
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
		TestBase.test.log(Status.INFO,"Clicking On Support Link" );
		
		link_support.click();
		return new UnderConstPage(driver);
	}

	public UnderConstPage clickOnContact() {
		log.info("Clicking On Contact Link");
		TestBase.test.log(Status.INFO, "Clicking On Contact Link");
		
		link_contact.click();
		return new UnderConstPage(driver);
	}

	public void typeOnPassengers_Firstname(String text) {

		log.info("Typing " + text + " on passengers first name feild");
		TestBase.logExtentReport("Typing " + text + " on passengers first name field");
		txtb_creditcard_firstname.sendKeys(text);
	}

	public void typeOnPassengers_LastName(String text) {
		log.info("Typing " + text + " on passengers last name  feild");
		TestBase.logExtentReport("Typing " + text + " on passengers last name field");
		txtb_creditcard_lastname.sendKeys(text);

	}

	public void typeOnCreditCard_Number(String text) {
		log.info("Typing " + text + " on credit card number feild");
		TestBase.logExtentReport("Typing " + text + " on credit card number feild");
		txtb_creditcard_number.sendKeys(text);
	}

	public void typeOnCreditCard_FirstName(String text) {
		log.info("Typing " + text + " on credit card first name feild");
		TestBase.logExtentReport("Typing " + text + " on credit card first name field");
		txtb_creditcard_firstname.sendKeys(text);

	}

	public void typeOnCreditCard_MiddleName(String text) {
		log.info("Typing " + text + " on credit card middle name feild");
		TestBase.logExtentReport("Typing " + text + " on credit card middle name field");
		txtb_creditcard_midname.sendKeys(text);

	}

	public void typeOnCreditCard_LastName(String text) {
		log.info("Typing " + text + " on credit card last name feild");
		TestBase.logExtentReport("Typing " + text + " on credit card last name field");
		txtb_creditcard_lastname.sendKeys(text);

	}

	public void clickOnTicketlessTravel() {
		log.info("Clicking  on Ticketless travel check box feild");
		TestBase.logExtentReport("Clicking  on Ticketless travel check box feild");
		checkb_billing_ticketlesstravel.click();

	}

	public void typeOnBilling_Address1(String text) {
		log.info("Typing " + text + " on billing address address1 feild");
		TestBase.logExtentReport("Typing " + text + " on billing address address1 feild");
		txtb_billing_address1.clear(); 
		txtb_billing_address1.sendKeys(text);
	}

	public void typeOnBilling_Address2(String text) {
		log.info("Typing " + text + " on billing address address2 feild");
		TestBase.logExtentReport("Typing " + text + " on billing address address2 feild");
		txtb_billing_address2.clear();
		txtb_billing_address2.sendKeys(text);

	}

	public void type_OnBilling_City(String text) {
		log.info("Typing " + text + " on billing address city feild");
		TestBase.logExtentReport("Typing " + text + " on billing address city  field");
		txtb_billing_city.clear();
		txtb_billing_city.sendKeys(text);
	}
	public void type_OnBilling_StateProvinance(String text) {
		log.info("Typing " + text + " on billing state/provinance feild");
		TestBase.logExtentReport("Typing " + text + " on billing state/provinance  field");
		txtb_billing_state_provinance.clear();
		txtb_billing_state_provinance.sendKeys(text);

	}

	public void type_OnBillng_PostalCode(String text) {
		log.info("Typing " + text + " on postal code feild");
		TestBase.logExtentReport("Typing " + text + " on postal code field");
		txtb_billing_postalcode.clear();
		txtb_billing_postalcode.sendKeys(text);

	}

	public void clickOnSameAsBillingAddress() {
		log.info("Clicking  on same as billing address check box feild");
		TestBase.logExtentReport("Clicking  on same as billing address  check box feild");
		checkb_delivey_same_as_billing_address.click();

	}

	public void typeOnDelivery_address1(String text) {
		log.info("Typing " + text + " on delivery address1 feild");
		TestBase.logExtentReport("Typing " + text + " on delivery address1 field");
		txtb_delivery_address1.clear();
		txtb_delivery_address1.sendKeys(text);

	}

	public void typeOnDelivery_address2(String text) {
		log.info("Typing " + text + " on delivery address2 feild");
		TestBase.logExtentReport("Typing " + text + " on delivery address2 field");
		txtb_delivery_address2.clear();
		txtb_delivery_address2.sendKeys(text);

	}

	public void typeOnDelivery_City(String text) {
		log.info("Typing " + text + " on delivery city feild");
		TestBase.logExtentReport("Typing " + text + " on delivery city field");
		txtb_delivery_city.clear();
		txtb_delivery_city.sendKeys(text);

	}

	public void typeOnDelivery_StateProvinance(String text) {
		log.info("Typing " + text + " on delivery state/provinance feild");
		TestBase.logExtentReport("Typing " + text + " on delivery state/provinance  field");
		txtb_delivery_stateprovinance.clear();
		txtb_delivery_stateprovinance.sendKeys(text);

	}

	public void typeOnDelivery_PostalCode(String text) {
		log.info("Typing " + text + " on postal code feild");
		TestBase.logExtentReport("Typing " + text + " on postal code field");
		txtb_delivery_postalcode.clear();
		txtb_delivery_postalcode.sendKeys(text);

	}

	public Purchase2Page clickOnSecurePurchase() {
		log.info("Clicking on secure purchase button");
		TestBase.logExtentReport("Clicking on secure purchase button");
		btn_securePurchase.click();
		return new Purchase2Page(driver);

	}

}
