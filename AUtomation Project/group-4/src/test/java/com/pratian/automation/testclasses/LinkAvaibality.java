package com.pratian.automation.testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pratian.automation.utility.PropertyManager;

public class LinkAvaibality extends TestLogin {
	@Test(priority = 1)
	public void Linkavalable() throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn"))))
		.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientUrl"));
		System.out.println("User is on Client Page");
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientviewPageBtn")))).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientviewUrl"));
		System.out.println("User is on View Client Page");
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("addstakeholder"))))
		.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("addstakeholderurl"));
		System.out.println("stakeholder add option opened");

		// Testcase25
		Boolean internal = driver.findElement(By.xpath(PropertyManager.getProperty("internalstakeholder")))
				.isDisplayed();
		System.out.println("Internal link is available: " + internal);
		Thread.sleep(3000);
		Boolean external = driver.findElement(By.xpath(PropertyManager.getProperty("externalstakeholder")))
				.isDisplayed();
		System.out.println("External link is available: " + external);
		System.out.println("1 test case done!");
		Thread.sleep(6000);

		// Testcase45
		//		wait.until(ExpectedConditions.elementToBeClickable (By.xpath("//*[@id=\"viewStakeholder_sortBtnFn\"]/span[1]/span")));
		// System.out.println("sort button can be clicked");
		//		System.out.println("2 test cases done!");
		// Thread.sleep(3000);

		// Testcase46
		//		driver.manage().timeouts().pageLoadTimeout(10000000, TimeUnit.MILLISECONDS);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("filterbutton")))).click();
		// Thread.sleep(3000);
		//		driver.manage().timeouts().pageLoadTimeout(10000000, TimeUnit.MILLISECONDS);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("stakeholderstatus")))).click();//
		// Thread.sleep(3000);
		// driver.manage().timeouts().pageLoadTimeout(10000000, TimeUnit.MILLISECONDS);
		// wait.until(ExpectedConditions.elementToBeClickable
		// (By.xpath(PropertyManager.getProperty("activestatus"))));

		// System.out.println("filter can be done by Active status");
		// System.out.println("3 test cases done!");

		// TestCase62

		//	  driver.manage().timeouts().pageLoadTimeout(10000000, TimeUnit.MILLISECONDS);

		//		  Thread.sleep(3000);
		// driver.manage().timeouts().pageLoadTimeout(10000000, TimeUnit.MILLISECONDS);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("stkaholdercategory")))).click();
		// Thread.sleep(3000);
		// driver.manage().timeouts().pageLoadTimeout(10000000, TimeUnit.MILLISECONDS);
		// wait.until(ExpectedConditions.elementToBeClickable
		// (By.xpath(PropertyManager.getProperty("customer"))));

		// System.out.println("filter can be done by customer status");
		// System.out.println("4 test cases done!");

		// Testcase49

		//	   driver.manage().timeouts().pageLoadTimeout(10000000, TimeUnit.MILLISECONDS);
		// Boolean exitbtn =
		// driver.findElement(By.xpath(PropertyManager.getProperty("exitbutton"))).isEnabled();
		//		System.out.println("exit button enabled: "+ exitbtn);
		//		System.out.println("5 test cases done!");

		// System.out.println("All test cases are done!!!");

	}

}
