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
public class AddStakeholderButton extends TestLogin
{
	@Test(priority = 1)
	public void vadlidateClientPage() throws InterruptedException, IOException {

		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(60000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientPageBtn")))).click();
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientUrl"));
		System.out.println("User is on Client Page");
		driver.manage().timeouts().pageLoadTimeout(60000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("clientviewPageBtn")))).click();
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("clientviewUrl"));
		System.out.println("User is on View Client Page");
	}
	@Test
	public void addnew() throws InterruptedException, IOException {
		WebElement addNew = driver.findElement(By.xpath(PropertyManager.getProperty("add")));
		addNew.click();
        //System.out.println(addNew);
        System.out.println("Add new Stakeholder button is available");
	}
	/*@Test(priority = 4)
	public void addValid() throws InterruptedException, IOException {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(60000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("add")))).click();
		Thread.sleep(6000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("addUrl"));
		System.out.println("User is on add stakeholder Page");
		driver.findElement(By.xpath(PropertyManager.getProperty("name"))).sendKeys("Mhhj");
		driver.findElement(By.xpath(PropertyManager.getProperty("designation"))).sendKeys("CEO");
		driver.findElement(By.xpath(PropertyManager.getProperty("stakeholderCategory"))).click();
		driver.findElement(By.xpath(PropertyManager.getProperty("selectCat"))).click();
		driver.findElement(By.xpath(PropertyManager.getProperty("contact"))).sendKeys("9809775321");
		driver.findElement(By.xpath(PropertyManager.getProperty("email"))).sendKeys("abklakmmvabra@gmail.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath(PropertyManager.getProperty("addstakeholder"))).click();
		driver.findElement(By.xpath(PropertyManager.getProperty("yes"))).click();
		System.out.println("New Stakeholder added");

	}
	@Test(priority = 3)
	public void addInvalid() throws InterruptedException, IOException {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("add")))).click();
		Thread.sleep(6000);
		Assert.assertEquals(driver.getCurrentUrl().toString(), PropertyManager.getProperty("addUrl"));
		System.out.println("User is on add stakeholder Page");
		driver.findElement(By.xpath(PropertyManager.getProperty("name"))).sendKeys("Ab,,");
		driver.findElement(By.xpath(PropertyManager.getProperty("designation"))).sendKeys("123");
		driver.findElement(By.xpath(PropertyManager.getProperty("stakeholderCategory"))).click();
		driver.findElement(By.xpath(PropertyManager.getProperty("selectCat"))).click();
		driver.findElement(By.xpath(PropertyManager.getProperty("contact"))).sendKeys("9806778090");
		driver.findElement(By.xpath(PropertyManager.getProperty("email"))).sendKeys("abrakadabra@gn.mom");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath(PropertyManager.getProperty("addstakeholder"))).click();
		driver.findElement(By.xpath(PropertyManager.getProperty("yes"))).click();
		//Assert.assertEquals(driver.findElement(By.id("mat-error-3")), "Field is required*");
		System.out.println("Stakeholder with invalid details");

	}
	/*@Test
public void viewClient() {
		driver.findElement(By.xpath("/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-dashboard/ngx-sidebar/div/div/div/div[2]/ul[3]/li/a")).click();
   	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	   driver.findElement(By.id("maincontent")).click();
   	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	   driver.findElement(By.xpath("/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-view-client-dashboard/div[2]/div[4]/ngx-view-stakeholder/div/div[3]")).click();
   	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	   driver.findElement(By.id("addStakeholder_internal_addBtn1")).click();
	}
	 public void addNullDetails() {
  	   driver.findElement(By.xpath(null));
     }*/


}
