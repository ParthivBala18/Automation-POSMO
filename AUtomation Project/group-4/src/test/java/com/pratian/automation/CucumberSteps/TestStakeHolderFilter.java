package com.pratian.automation.CucumberSteps;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pratian.automation.pageobjects.ClientP;
import com.pratian.automation.pageobjects.Home;
import com.pratian.automation.utility.PropertyManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


//  Verify whether the user is able to navigate from internal to external and vice-versa 15 27

public class TestStakeHolderFilter {

	WebDriver driver;
	FileInputStream fin;
	Properties p;
	Action action;
	Home objLogin;
	ClientP cobj;

	@Given("user on login page")
	public void user_on_login_page() throws Exception {

		cobj = new ClientP(driver);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.get("https://app.get2aha.pratian.com/POSMO/landing");
		driver.get(PropertyManager.getProperty("url.app"));
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertyManager.getProperty("login")))).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objLogin = new Home(driver);

	}

	@When("User types correct username and password")
	public void user_types_correct_username_and_password() throws Exception {
		String Uname="prahas.kattimani@pratian.com";
		String pwd="Qwerty123";
		/*
		fin = new FileInputStream("data.xlsx");
		XSSFWorkbook wbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=wbook.getSheet("login");
		String Uname=sheet.getRow(1).getCell(0).getStringCellValue();
		String pwd=sheet.getRow(1).getCell(1).getStringCellValue();
		fin.close();*/

		objLogin.provideusername(Uname);
		objLogin.providepassword(pwd);
	}


	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		objLogin.clickLogin();
	}

	@Then("User clicks on Client Tab")
	public void user_clicks_on_client_tab() {

		driver.findElement(By.xpath("/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-dashboard/ngx-sidebar/div/div/div/div[2]/ul[3]/li/a")).click();
		Assert.assertEquals(driver.getCurrentUrl().toString(), "https://app.get2aha.pratian.com/POSMO/client");
		System.out.println("ON CLIENT PAGE SUCCESS ALL STAKEHOLDERS");
	}

	@Then("User click on Internal and External Filter")
	public void user_click_on_internal_and_external_filter() {
		driver.findElement(By.xpath("/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-client-dashboard/div[2]/div[3]/ngx-view-stakeholder/div/div[2]/div/span/button[2]")).click();
		System.out.println("FILTER SUCCESS");

		driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-10\"]/div/button[2]")).click();
		System.out.println("STAKE TYPE SUCCESS");

		driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-13\"]/div/button[1]")).click();
		System.out.println("INTERNAL STAKE HOLDERS NAVIGATION SUCCESS");

		WebDriverWait wait = new WebDriverWait(driver,10);

		driver.findElement(By.xpath("/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-client-dashboard/div[2]/div[3]/ngx-view-stakeholder/div/div[2]/div/span/button[2]")).click();
		System.out.println("FILTER SUCCESS AGAIN");

		driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-10\"]/div/button[2]")).click();
		System.out.println("STAKE TYPE SUCCESS AGIAN");

		//driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-13\"]/div/button[2]")).click();
		driver.findElement(By.xpath("/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[3]/div/div/div/button[2]")).click();
		//c.ClickExternalStakeHolder();
		//cobj.clickextternalSTake();
		System.out.println("EXTERNAL STAKE HOLDER SUCCESS");

		System.out.println("TEST CASE PASSED");

		driver.close();
	}

}
