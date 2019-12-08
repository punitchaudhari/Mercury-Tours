package com.uiFrameworkVersion1.companyName.mercury_tours.testbase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.browserConfiguration.BrowserType;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.browserConfiguration.ChromeBrowser;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.browserConfiguration.FirefoxBrowser;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.browserConfiguration.IExploreBrowser;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.config.PropertiesReaderClass;
import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;
import com.uiFrameworkVersion1.companyName.mercury_tours.utils.ExtentManager;

public class TestBase {

	Logger log = LoggerHelper.getLogger(TestBase.class);
	public WebDriver driver;
	static ExtentReports report;
	public static ExtentTest test;

	@BeforeSuite
	public void beforeSuite() {
		report = ExtentManager.getInstance();
//		TestBase.logExtentReport("============Ending the suite execution============");
		log.info("============Starting the SUITE execution============");
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		
	
		test = report.createTest(getClass().getSimpleName());
		log.info("============Starting the TESTS execution============");
		test.info("============Starting the TESTS execution============");
	}

	@AfterTest
	public void afterTest() throws Exception {
		log.info("============Ending the TESTS execution============");
		test.info("============Ending the TESTS execution============");
		/*if (driver != null) {
			log.info("============Closing the browser============");
			logExtentReport("============Closing the browser============");
			driver.quit();

		}*/
		
	}

	@BeforeMethod
	public void beforeMethod(Method method) throws Exception {
		log.info("============Launching the browser============");
		logExtentReport("============Launching the browser============");
		setWebDriverTo(BrowserType.Chrome);
		driver.manage().window().maximize();
		test.log(Status.INFO, method.getName() + "============Test case Started");
		log.info("============" + method.getName() + "============Started============");

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.INFO, result.getName() + " is Failed");
			test.log(Status.FAIL, result.getThrowable());

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName() + " is Passed");

		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.INFO, result.getName() + " is Skipped");
			test.log(Status.SKIP, result.getThrowable());
		}
		log.info("============" + result.getName() + "============Finished============");

		// closing driver after every method
		try {
			if (driver != null) {
				log.info("============Closing the browser============");
				logExtentReport("============Closing the browser============");
				driver.quit();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	@AfterSuite
	public void afterSuite() {
		logExtentReport("============Ending the suite execution============");
		log.info("============Ending the suite execution============");
		report.flush();

	}

	/**
	 * this method will print any message that you pass in the extent report
	 * 
	 * @param s1
	 */

	public static void logExtentReport(String s1) {
		test.log(Status.INFO, s1);
	}

	/**
	 * this method is used to print log on the console pass the message that you
	 * want to print on console
	 * 
	 * @param string
	 */

	public void logConsole(String string) {
		log.info(string);
	}

	/**
	 * this method takes Browser Type as Argument and assigns it to driver
	 * variable . tis variable is used in TESTSCRIPT CLASS. CALL THIS METHOD IN
	 * "@BEFORE CLASS" TESTNG ANNOTAION METHOD
	 * 
	 * @param btype
	 * @throws Exception
	 */
	public void setWebDriverTo(BrowserType btype) throws Exception {
		driver = getBrowserObject(btype);

	}

	/**
	 * this method returns the webdriver according to what browser name passed
	 * in it .simply it fetches the DRIVER locatation from HARD DISK location
	 * after detectiing the OS
	 * 
	 * @param btype
	 * @return
	 * @throws Exception
	 */
	public WebDriver getBrowserObject(BrowserType btype) throws Exception {

		try {
			switch (btype) {
			case Chrome:
				// get object of ChromeBrowser class
				ChromeBrowser chrome = ChromeBrowser.class.newInstance();
				ChromeOptions option = chrome.getChromeOptions();
				return chrome.getChromeDriver(option);
			case Firefox:
				FirefoxBrowser firefox = FirefoxBrowser.class.newInstance();
				FirefoxOptions options = firefox.getFirefoxOptions();
				return firefox.getFirefoxDriver(options);

			case Iexplorer:
				IExploreBrowser ie = IExploreBrowser.class.newInstance();
				InternetExplorerOptions cap = ie.getIExplorerCapabilities();
				return ie.getIExplorerDriver(cap);
			default:
				throw new Exception("Driver not Found: " + btype.name());
			}
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}

	public void getUrl(String url) {
		driver.get(url);
		log.info("Visiting to this URL = " + url);
		logExtentReport("Visiting to this URL = " + url);

	}
	
	public String getHomePageUrl() {
		return PropertiesReaderClass.getHomePageUrl();

	}

	public String getCreateAccountSuccessPageUrl() {
		return PropertiesReaderClass.getCreateAccountSuccessPageUrl();

	}

	public String getCruisesPageUrl() {
		return PropertiesReaderClass.getCruisesPageUrl();

	}

	public String getindexPageUrl() {
		return PropertiesReaderClass.getindexPageUrl();

	}

	public String getItineraryPageUrl() {
		return PropertiesReaderClass.getItineraryPageUrl();

	}

	public String getProfilePageUrl() {

		return PropertiesReaderClass.getProfilePageUrl();

	}

	public String getPurchasePageUrl() {
		return PropertiesReaderClass.getPurchasePageUrl();

	}

	public String getPurchse2PageUrl() {
		return PropertiesReaderClass.getPurchse2PageUrl();

	}

	public String getRegisterPageUrl() {
		return PropertiesReaderClass.getRegisterPageUrl();

	}

	public String getReservationPageUrl() {
		return PropertiesReaderClass.getReservationPageUrl();

	}

	public String getReservation2PageUrl() {
		return PropertiesReaderClass.getReservation2PageUrl();

	}

	public String getSignOnPageUrl() {
		return PropertiesReaderClass.getSignOnPageUrl();

	}

	public String getUnderConstructionPageUrl() {
		return PropertiesReaderClass.getUnderConstructionPageUrl();

	}

	public String getWelcomePageUrl() {
		return PropertiesReaderClass.getWelcomePageUrl();

	}

	public String getValidUserName() {

		return PropertiesReaderClass.getValidUserName();
	}

	public String getValidPassword() {
		return PropertiesReaderClass.getValidPassword();

	}

	public String getInValidUserName() {
		return PropertiesReaderClass.getInValidUserName();

	}

	public String getInValidPassword() {
		return PropertiesReaderClass.getInValidPassword();

	}
	

}
