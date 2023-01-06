package com.pratian.automation.testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pratian.automation.utility.PropertyManager;

public class ConfirmationDialogBox extends TestLogin {
	@Test(priority=1)
	public void vadlidateClientPage() throws InterruptedException, IOException {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(60000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn")))).click();
		Thread.sleep(6000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientUrl"));
		System.out.println("User is on Client Page");
		driver.manage().timeouts().pageLoadTimeout(60000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientviewPageBtn")))).click();
		//Thread.sleep(6000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientviewUrl"));
		Thread.sleep(6000);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		System.out.println("User is on View Client Page");
	}
	@Test(priority = 2)
	public void addValidInt() throws InterruptedException, IOException {
		WebDriverWait wait=new WebDriverWait(driver, 15);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("add")))).click();
		Thread.sleep(6000);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		WebElement enterName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("name"))));
		enterName.click();
		enterName.sendKeys("Samplessxaxaxa");
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		WebElement enterDesignation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("designation"))));
		enterDesignation.click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		enterDesignation.sendKeys("CEO");
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		WebElement enterStakeholdercategory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("stakeholderCategory"))));
		enterStakeholdercategory.click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("selectCat")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		WebElement enterContactno = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("contact"))));
		enterContactno.click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		enterContactno.sendKeys("12345890715");
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		WebElement enteremail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("email"))));
		//driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.MILLISECONDS);
		enteremail.click();
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		enteremail.sendKeys("sampless2000@gmail.com");
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		WebElement clickAddStakeholderbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("addstakeholder"))));
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		clickAddStakeholderbtn.click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		WebElement yesbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("yes"))));
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		yesbtn.click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
	}
	@Test(priority = 3)
	public void confirm() throws InterruptedException, IOException {
		boolean confirmbox=driver.findElement(By.xpath(PropertyManager.getProperty("confirmation"))).isEnabled();
		System.out.println(confirmbox);
		System.out.println("Confirmation Dialog Box is available");
	}

}