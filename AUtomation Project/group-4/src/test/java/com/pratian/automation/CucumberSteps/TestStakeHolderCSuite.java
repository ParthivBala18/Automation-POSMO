package com.pratian.automation.CucumberSteps;

import java.io.FileInputStream;
import java.io.IOException;
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
import io.github.bonigarcia.wdm.WebDriverManager;

// CSuite Sort

public class TestStakeHolderCSuite {

	WebDriver driver;
	FileInputStream fin;
	Home objLogin;
	ClientP cobj;

	@Given("User is on Login Page")
	public void user_is_on_login_page() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.get("https://app.get2aha.pratian.com/POSMO/landing");
		driver.get(PropertyManager.getProperty("url.app"));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/button"))).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objLogin = new Home(driver);


		String Uname="prahas.kattimani@pratian.com";
		String pwd="Qwerty123";


		/*fin = new FileInputStream("data.xlsx");
		XSSFWorkbook wbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=wbook.getSheet("login");
		String Uname=sheet.getRow(1).getCell(0).getStringCellValue();
		String pwd=sheet.getRow(1).getCell(1).getStringCellValue();
		fin.close();*/

		objLogin.provideusername(Uname);
		objLogin.providepassword(pwd);
		objLogin.clickLogin();
	}

	@Then("User Comes on Client Tab")
	public void user_comes_on_client_tab() {
		driver.findElement(By.xpath("/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-dashboard/ngx-sidebar/div/div/div/div[2]/ul[3]/li/a")).click();
		Assert.assertEquals(driver.getCurrentUrl().toString(), "https://app.get2aha.pratian.com/POSMO/client");
		System.out.println("ON CLIENT PAGE SUCCESS ALL STAKEHOLDERS");
	}

	@Then("User Select Csuite Filter Option")
	public void user_select_csuite_filter_option() {
		driver.findElement(By.xpath("//*[@id=\"viewStakeholder_filterBtn\"]")).click();
		System.out.println("FILTER CLICK SUCCES");

		driver.findElement(By.xpath("//*[@id=\"viewStakeholderInfo_filter_subMenu1Fn\"]")).click();
		System.out.println("CATEGORY CLICK SUCCESS");

		driver.findElement(By.xpath("//*[@id=\"viewStakeholderInfo_filter_subMenu1_btnFn\"]")).click();
		System.out.println("CSUITE CLICK SUCCESS");

		System.out.println("TEST CASE PASSED SUCCESFULLY");

		driver.close();
	}


}
