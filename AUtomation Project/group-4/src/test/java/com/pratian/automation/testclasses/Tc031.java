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

public class Tc031 extends TestLogin{

	@Test(priority = 1)
	public void vadlidateClientPage() throws InterruptedException, IOException {

		WebDriverWait wait=new WebDriverWait(driver, 5);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn")))).click();
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientUrl"));
		System.out.println("User is on Client Page");
	}

	@Test(priority = 2)
	public void verifyStakeholderAddbtn() throws IOException {
		WebDriverWait wait=new WebDriverWait(driver, 6);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PropertyManager.getProperty("clientselectid")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("addbtn")))).click();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//*[@id=\"addStakeholder_internal_addBtn1\"]")).click();
		WebElement text=driver.findElement(By.tagName("mat-error"));
		System.out.println(text.getText());
		if(text.getText() != null) {
			System.out.println("Required fields should be filled up");}
		else {
			System.out.println("Test Case Failure");}

	}

}
