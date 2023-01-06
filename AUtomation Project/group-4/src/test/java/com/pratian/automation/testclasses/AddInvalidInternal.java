package com.pratian.automation.testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pratian.automation.pageobjects.Home;
import com.pratian.automation.utility.PropertyManager;

public class AddInvalidInternal extends TestLogin {

	@Override
	@Test(dataProvider = "login")
	public void Login(String user, String pwd) throws InterruptedException {
		Home home = new Home(driver);
		home.providelogin();
		home.provideusername(user);
		home.providepassword(pwd);
		home.clickLogin();
	}

	@Test(priority = 1)
	public void vadlidateClientPage() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn"))))
		.click();
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
	public void addInvalid() throws InterruptedException, IOException {
		WebDriverWait wait=new WebDriverWait(driver, 15);


		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("add")))).click();
		Thread.sleep(6000);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		WebElement enterName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("name"))));
		enterName.click();
		enterName.sendKeys("Sample");
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		WebElement enterDesignation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("designation"))));
		enterDesignation.click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		enterDesignation.sendKeys("CO");
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		WebElement enterStakeholdercategory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("stakeholderCategory"))));
		enterStakeholdercategory.click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("selectCat")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		WebElement enterContactno = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("contact"))));
		enterContactno.click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		enterContactno.sendKeys("12345");
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		WebElement enteremail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("email"))));
		//driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.MILLISECONDS);
		enteremail.click();
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		enteremail.sendKeys("sample");
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


}
