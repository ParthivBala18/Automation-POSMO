package com.pratian.automation.testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pratian.automation.utility.PropertyManager;

public class Tc028  extends TestLogin {

	@Test(priority = 1)
	public void vadlidateClientPage() throws InterruptedException, IOException {

		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn")))).click();
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientUrl"));
		System.out.println("User is on Client Page");
		Thread.sleep(10000);
		driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientviewPageBtn")))).click();
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientviewUrl"));
		System.out.println("User is on View Client Page");
		Thread.sleep(10000);
		driver.findElement(By.xpath(PropertyManager.getProperty("addStakeBtn"))).click();
		System.out.println("User is on add stakeholder");
		Thread.sleep(10000);
		driver.findElement(By.xpath(PropertyManager.getProperty("clickuploadBtn"))).click();
		System.out.println("test case one");
		Thread.sleep(10000);

	}
}