package com.pratian.automation.testclasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.automation.pageobjects.Home;
import com.pratian.automation.utility.ExcelManager;
import com.pratian.automation.utility.PropertyManager;

public class Tc032 extends BaseTest{


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
	public void selectStakeHolder() throws IOException, InterruptedException {

		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PropertyManager.getProperty("stakeHolder")))).click();
		Thread.sleep(6000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("viewStakeHolder"));
		System.out.println("User selected stakeholder for editing info");
	}


	@DataProvider(name="login")
	public Object[][] getData(){
		Object data[][] = ExcelManager.getTestData("login");
		return data;
	}

}
