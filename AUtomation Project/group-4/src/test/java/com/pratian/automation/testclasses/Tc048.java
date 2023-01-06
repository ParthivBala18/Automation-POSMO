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
import com.pratian.automation.utility.ExcelManager;
import com.pratian.automation.utility.PropertyManager;

public class Tc048 extends BaseTest{

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
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn")))).click();
		Thread.sleep(6000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientUrl"));
		System.out.println("User is on Client Page");
	}

	@Test(priority = 2)
	public void selectStakeHolder() throws IOException, InterruptedException {
		driver.findElement(By.id(PropertyManager.getProperty("stakeHolder"))).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Assert.assertTrue(driver.findElement(By.id("stakeholder_btns1_editBtnFn")).isEnabled());
		System.out.println("Stakeholder Edit Button is enabled");
	}

	@DataProvider(name = "login")
	public Object[][] getData() {
		Object data[][] = ExcelManager.getTestData("login");
		return data;
	}
}
