package com.pratian.automation.testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pratian.automation.utility.PropertyManager;

public class Tc047 extends TestLogin{
	@Test(priority = 1)
	public void vadlidateClientPage() throws InterruptedException, IOException {

		WebDriverWait wait=new WebDriverWait(driver, 5);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn")))).click();
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientUrl"));
		System.out.println("User is on Client Page");
	}
	
	@Test(priority = 2)
	public void filterStakeholder() throws IOException, InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 6);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PropertyManager.getProperty("clientselectid")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("addbtn")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("filterid")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("stakeholderTypebtn")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("externalbtn")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("filterid1")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("stakeholderTypebtn1")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clearfilterbtn")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
      	   
	}
}
