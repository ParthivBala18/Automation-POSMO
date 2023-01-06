package com.pratian.automation.testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.automation.pageobjects.Home;
import com.pratian.automation.pageobjects.StakeElements;
import com.pratian.automation.utility.ExcelManager;
import com.pratian.automation.utility.PropertyManager;

public class Tc024 extends BaseTest{

	StakeElements obj1;

	@Test(dataProvider="login")
	public void Login(String user,String pwd) throws InterruptedException {
		Home home = new Home(driver);
		home.providelogin();
		home.provideusername(user);
		home.providepassword(pwd);
		home.clickLogin();
	}

	@Test(priority = 1)
	public void vadlidateClientPage() throws InterruptedException, IOException {

		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn")))).click();
		Thread.sleep(6000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientUrl"));
		System.out.println("User is on Client Page");
	}


	@Test(priority = 2)
	public void validateAddStakeholderPage() throws InterruptedException, IOException {
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("viewClientBtn")))).click();
		Thread.sleep(6000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("viewClientUrl"));
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath(PropertyManager.getProperty("addStakeBtn"))).click();
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("addStakeUrl"));
		System.out.println("User is on Add StakeholderPage");
	}

	@Test(priority = 3)
	public void verifyFields() throws InterruptedException {
		obj1 = new StakeElements(driver);
		obj1.displayedFields();
		Thread.sleep(3000);
	}


	@DataProvider(name="login")
	public Object[][] getData(){
		Object data[][] = ExcelManager.getTestData("login");
		return data;
	}

}