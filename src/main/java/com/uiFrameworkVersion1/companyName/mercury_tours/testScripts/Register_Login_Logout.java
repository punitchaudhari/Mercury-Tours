package com.uiFrameworkVersion1.companyName.mercury_tours.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.validator.ValidatorUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.uiFrameworkVersion1.companyName.mercury_tours.helper.assertion.AssertionHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.assertion.SoftAssertionHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.assertion.VerificationHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.config.PropertiesReaderClass;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.excel.ExcelHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.select.DropdownHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.wait.WaitHelper;
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

public class Register_Login_Logout extends TestBase {
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
	AssertionHelper ah;

	@Test(enabled=false, dataProvider = "register")
	public void checkCustomerRegistration_ID01(String fname, String lname, String phone, String email, String address1,String address2, String city, String state, String postalcode, String country, String username,String password, String confirmpassword) {
		WaitHelper wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.clickOnRegister();
		rp = new RegisterPage(driver);
		rp.typeOnFirstName(fname);
		rp.typeOnLastName(lname);
		rp.typeOnPhone(phone);
		rp.typeOnEmail(email);
		rp.typeOnAddress1(address1);
		rp.typeOnAddress2(address2);
		rp.typeOnCity(city);
		rp.typeOnState(state);
		rp.typeOnPostalCode(postalcode);
		ddh= new DropdownHelper(driver);
		ddh.selectByVisibleText(rp.drpd_country, country);
		rp.typeOnUsername(username);
		rp.typeOnPassword(password);
		rp.typeOnConfirmPassword(confirmpassword);
		rp.ClickOnSubmit();
		createp = new CreateAccountSuccessPage(driver);
		String txt = createp.lbl_successful_registration_message.getText();
		//ah = new AssertionHelper(driver);
		 Boolean status = AssertionHelper.verifyTextEquals(txt, "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
		AssertionHelper.updateTestStatus(status);
		
	}
	
	@DataProvider(name = "register")
	public String[][] dataProvider() throws FileNotFoundException, IOException {
		ExcelHelper helper = new ExcelHelper();
		String[][] data = helper.readExcelData("src/main/resources/excel files/test data.xlsx", "sheet1",0, 0);
		return data;
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromHomepageWith_valid_username_invalid_password_ID02(){
		getUrl(getHomePageUrl());
		hp = new HomePage(driver);
		hp.signIn(PropertiesReaderClass.getProperty("validUsername"),PropertiesReaderClass.getProperty("invalidPassword"));
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);
			
	}

	@Test(enabled=false)
	public void checkCustomerLoginfromHomepageWith_valid_username_valid_password_ID03(){
		getUrl(getHomePageUrl());		hp = new HomePage(driver);
		hp.signIn(PropertiesReaderClass.getProperty("validUsername"),PropertiesReaderClass.getProperty("validPassword"));
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getReservationPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getReservationPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getReservationPageUrl());
		AssertionHelper.updateTestStatus(status);
			
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromHomepageWith_invalid_username_valid_password_ID04(){
		getUrl(getHomePageUrl());		hp = new HomePage(driver);
		hp.signIn(PropertiesReaderClass.getProperty("invalidUsername"),PropertiesReaderClass.getProperty("validPassword"));
	
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);
			
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromHomepageWith_invalid_username_invalid_password_ID05(){
		getUrl(getHomePageUrl());		hp = new HomePage(driver);
		hp.signIn(PropertiesReaderClass.getProperty("invalidUsername"),PropertiesReaderClass.getProperty("invalidPassword"));
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);
			
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromSignOnPageWith_valid_username_invalid_password_ID06(){
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(),getInValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromSignOnPageWith_valid_username_valid_password_ID07(){
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(),getInValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getReservationPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getReservationPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getReservationPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromSignOnPageWith_invalid_username_valid_password_ID08(){
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getInValidUserName(),getValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromSignOnPageWith_invalid_username_invalid_password_ID09(){
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getInValidUserName(),getInValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	
	@Test(enabled=false)
	public void checkCustomerLoginfromIndexPageWith_valid_username_invalid_password_ID010(){
		getUrl(getindexPageUrl());
		ip = new IndexPage(driver);
		ip.signIn(getValidUserName(),getInValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromIndexPageWith_valid_username_valid_password_ID011(){
		getUrl(getindexPageUrl());

		ip = new IndexPage(driver);
		ip.signIn(getValidUserName(),getValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getReservationPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getReservationPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getReservationPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromIndexPageWith_invalid_username_valid_password_ID012(){
		getUrl(getindexPageUrl());

		ip = new IndexPage(driver);
		ip.signIn(getInValidUserName(), getValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromIndexPageWith_invalid_username_invalid_password_ID013(){
		getUrl(getindexPageUrl());

		ip = new IndexPage(driver);
		ip.signIn(getInValidUserName(),getInValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromWelcomePageWith_valid_username_invalid_password_ID014(){
		getUrl(getWelcomePageUrl());

		wp = new WelcomePage(driver);
		wp.signIn(getValidUserName(),getInValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	
	@Test(enabled=false)
	public void checkCustomerLoginfromWelcomePageWith_valid_username_valid_password_ID015(){
		getUrl(getWelcomePageUrl());

		wp = new WelcomePage(driver);
		wp.signIn(getValidUserName(),getValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getReservationPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getReservationPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getReservationPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	

	@Test(enabled=false)
	public void checkCustomerLoginfromWelcomePageWith_invalid_username_valid_password_ID016(){
		getUrl(getWelcomePageUrl());

		wp = new WelcomePage(driver);
		wp.signIn(getInValidUserName(),getValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	@Test(enabled=false)
	public void checkCustomerLoginfromWelcomePageWith_invalid_username_invalid_password_ID017(){
		getUrl(getWelcomePageUrl());

		wp = new WelcomePage(driver);
		wp.signIn(getInValidUserName(),getInValidPassword());
		String url = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url.contains(PropertiesReaderClass.getSignOnPageUrl());
		AssertionHelper.updateTestStatus(status);		
	}
	
	
	@Test(enabled=false)
	public void checkCustomerLogoutfromHomePage_ID018(){
		getUrl(getHomePageUrl());

		hp = new HomePage(driver);
		hp.signIn(getValidUserName(),getValidPassword());
		String url = driver.getCurrentUrl();
		
		SoftAssertionHelper sah= new SoftAssertionHelper();
		log.info("Verifying user is navigated to url '"+getReservationPageUrl()+"'");
		sah.assertTrue(url.contains(getReservationPageUrl()));
		reservationp = new ReservationPage(driver);
		reservationp.clickOnSignOff();
		String url2 = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url2+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url2+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url2.contains(PropertiesReaderClass.getSignOnPageUrl());
		sah.assertTrue(status);
		sah.assertAll();
	}
	
	@Test(enabled=false)
	public void checkCustomerLogoutfromWelcomePage_ID019(){
		getUrl(getWelcomePageUrl());

		wp = new WelcomePage(driver);
		wp.signIn(getValidUserName(),getValidPassword());
		String url = driver.getCurrentUrl();
		
		SoftAssertionHelper sah= new SoftAssertionHelper();
		log.info("Verifying user is navigated to url '"+getReservationPageUrl()+"'");
		sah.assertTrue(url.contains(getReservationPageUrl()));
		reservationp = new ReservationPage(driver);
		reservationp.clickOnSignOff();
		String url2 = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url2+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url2+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url2.contains(PropertiesReaderClass.getSignOnPageUrl());
		sah.assertTrue(status);
		sah.assertAll();
	}
	
	@Test(enabled=false)
	public void checkCustomerLogoutfromIndexPage_ID020(){
		getUrl(getindexPageUrl());

		ip = new IndexPage(driver);
		ip.signIn(getValidUserName(),getValidPassword());
		String url = driver.getCurrentUrl();
		
		SoftAssertionHelper sah= new SoftAssertionHelper();
		log.info("Verifying user is navigated to url '"+getReservationPageUrl()+"'");
		sah.assertTrue(url.contains(getReservationPageUrl()));
		reservationp = new ReservationPage(driver);
		reservationp.clickOnSignOff();
		String url2 = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url2+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url2+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		Boolean status =url2.contains(PropertiesReaderClass.getSignOnPageUrl());
		sah.assertTrue(status);
		sah.assertAll();
	}
	
	@Test(enabled=true)
	public void checkCustomerLogoutfromSignOnPage_ID021()  {
		getUrl(getSignOnPageUrl());
		sp = new SignOnPage(driver);
		sp.signIn(getValidUserName(),getValidPassword());
		String url = driver.getCurrentUrl();
		SoftAssertionHelper sah= new SoftAssertionHelper();
		log.info("Verifying user is navigated to url '"+getReservationPageUrl()+"'");
		sah.assertTrue(url.contains(getReservationPageUrl()));
		reservationp = new ReservationPage(driver);
		reservationp.clickOnSignOff();
		String url2 = driver.getCurrentUrl();
		
		log.info("Verifying navigated url='"+url2+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		test.info("Verifying navigated url='"+url2+"' is equals to reuired page url='"+PropertiesReaderClass.getSignOnPageUrl()+"'");
		
		sah.assertTrue(url2.contains(PropertiesReaderClass.getSignOnPageUrl()));
		sah.assertAll();
	}
	
	
	
	
	
	
	
	
}
