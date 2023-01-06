/**
 *
 */
package com.pratian.automation.pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * @author amarendra.kumar
 *
 */
public class BasePage {
	@SuppressWarnings("unused")
	protected static WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.setDriver(driver);// calling web driver
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
