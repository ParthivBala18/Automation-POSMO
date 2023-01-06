package com.pratian.automation.testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pratian.automation.utility.PropertyManager;

public class ExitButton extends TestLogin{

	public void exitbtn() throws Exception{




		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn")))).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientUrl"));
		System.out.println("User is on Client Page");
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientviewPageBtn")))).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientviewUrl"));
		System.out.println("User is on View Client Page");
		driver.manage().timeouts().pageLoadTimeout(500000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("addstakeholder")))).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("addstakeholderurl"));
		System.out.println("stakeholder add option opened");

		//Testcase49

		driver.manage().timeouts().pageLoadTimeout(10000000, TimeUnit.MILLISECONDS);
		Boolean exitbtn = driver.findElement(By.xpath(PropertyManager.getProperty("exitbutton"))).isEnabled();
		System.out.println("exit button enabled: "+ exitbtn);
		System.out.println("5 test cases done!");




		System.out.println("All test cases are done!!!");
		Thread.sleep(30000);

	}
}