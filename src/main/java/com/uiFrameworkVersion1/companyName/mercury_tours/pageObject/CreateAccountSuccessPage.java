package com.uiFrameworkVersion1.companyName.mercury_tours.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;

public class CreateAccountSuccessPage {

	Logger log = LoggerHelper.getLogger(CreateAccountSuccessPage.class);
	WebDriver driver;

	public CreateAccountSuccessPage(WebDriver driver) {
		this.driver = driver;
		log.info("CreateAccountSuccessPage Class Object Created");
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[contains(text(),'SIGN-OFF')]")
	public WebElement link_signoff;

	@FindBy(xpath = "//a[contains(text(),'sign-in')]")
	public WebElement link_signin;

	@FindBy(xpath = "//b[contains(text(),'Dear')]")
	public WebElement txt_Dear;

	@FindBy(xpath = "//b[contains(text(),'Note: Your user name is')]")
	public WebElement txt_Your_user_name_is;

	@FindBy(xpath="//p[1]//font[1]")
	public WebElement lbl_dear_name;
	

	@FindBy(xpath="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/p[2]/font[1]")
	public	WebElement lbl_successful_registration_message;
	

	@FindBy(xpath="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/p[3]/a[1]/font[1]/b[1]")
	public WebElement lbl_username_message;
	

	
	

	public SignOnPage clickOnSignOff() {
		log.info("Clicking On SignOff Link");
		link_signoff.click();
		return new SignOnPage(driver);
	}

	public SignOnPage clickOnSignIn() {
		log.info("Clicking On SignIn Link");
		link_signin.click();
		return new SignOnPage(driver);
	}

	/**
	 * this method returns the text of the passed WebElement . passed elemetnt
	 * should be of CreateAccountSuccessPage
	 * 
	 * @param elementofthisclass
	 * @return
	 */
	public String getText(WebElement elementofthisclass) {
		log.info("getting text of element "+elementofthisclass+" and the text is = "+elementofthisclass.getText().toString().trim());
		return elementofthisclass.getText().toString().trim();
	}

	
}
