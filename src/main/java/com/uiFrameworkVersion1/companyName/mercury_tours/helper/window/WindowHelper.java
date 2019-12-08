package com.uiFrameworkVersion1.companyName.mercury_tours.helper.window;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.uiFrameworkVersion1.companyName.mercury_tours.helper.log4j.LoggerHelper;

public class WindowHelper {

	private WebDriver driver;
	Logger log = LoggerHelper.getLogger(WindowHelper.class);

	// constructor of this class
	public WindowHelper(WebDriver driver) {
		this.driver = driver;
		log.info(" WindowHelper Class Object Created");
	}

	/**
	 * this method is used for navigating browser backward
	 */
	public void navigateBackward() {
		log.info("navigating backward");
		driver.navigate().back();
	}

	/**
	 * this method helps in navigating browser forward
	 */
	public void navigateForward() {
		log.info("navigating forward");
		driver.navigate().back();
	}

	/**
	 * this method helps to switch browser to its main/default/parent window
	 */
	public void switchToParentWindow() {

		log.info("switching to parent window");
		driver.getWindowHandle();
	}

	/**
	 * this method helps for switching to a specific window by taking index
	 * value as argument of that window
	 * 
	 * @param index
	 */
	public void switchToWindowByIndexNumber(int index) {

		Set<String> windows = driver.getWindowHandles();
		int i = 0;
		for (String window : windows) {
			if (index == i) {
				log.info("switching to" + index + "window");
				driver.switchTo().window(window);
			} else {
				i++;
			}

		}

	}

	/**
	 * this method switches to its parent window and also close all other tabs
	 */
	public void switchToParentWindowAndCloseAllOtherTabs() {

		Set<String> otherwindows = driver.getWindowHandles();
		String parentwindow = driver.getWindowHandle();

		for (String window : otherwindows) {
			if (!window.equalsIgnoreCase(parentwindow)) {
				driver.close();
			} else {
				log.info("switching to parent window and closed all other tabs");
				driver.switchTo().window(parentwindow);

			}

		}

	}

}
