package com.pratian.automation.testclasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.automation.pageobjects.Home;
import com.pratian.automation.utility.ExcelManager;
import com.pratian.automation.utility.PropertyManager;

public class Tc040 extends BaseTest {

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
	}

	@Test(priority = 2)
	public void viewStaleHolderList() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("viewClientBtn"))))
				.click();
		Thread.sleep(6000);

		int c = 0;
		List<WebElement> ls = driver.findElements(By.id("viewStakeholder_stakeholderData_detailsContainer_name"));
		if (ls.size() > 0) {
			for (WebElement stake : ls) {
				if (stake.isDisplayed() == true) {
					c++;
				}
			}
		}
		if (c == ls.size()) {
			System.out.println("User is able to view Stakeholder List");
		}
	}

	@DataProvider(name = "login")
	public Object[][] getData() {
		Object data[][] = ExcelManager.getTestData("login");
		return data;
	}

}
