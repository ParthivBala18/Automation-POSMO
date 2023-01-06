package com.pratian.automation.testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pratian.automation.utility.PropertyManager;

public class SortButton extends TestLogin {


	public void sortbtn() throws Exception{




		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn")))).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientUrl"));
		System.out.println("User is on Client Page");
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientviewPageBtn")))).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientviewUrl"));
		System.out.println("User is on View Client Page");
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("addstakeholder")))).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("addstakeholderurl"));
		System.out.println("stakeholder add option opened");

		wait.until(ExpectedConditions.elementToBeClickable (By.xpath("//*[@id=\"viewStakeholder_sortBtnFn\"]/span[1]/span")));
		System.out.println("sort button can be clicked");
		System.out.println("2 test cases done!");
		Thread.sleep(30000);

	}
}
