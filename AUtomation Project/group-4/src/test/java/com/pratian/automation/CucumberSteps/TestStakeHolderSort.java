package com.pratian.automation.CucumberSteps;

import java.io.FileInputStream;
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

public class TestStakeHolderSort {

	WebDriver driver;
	FileInputStream fin;
	Home objLogin;
	ClientP cobj;

	@Given("Login Page Of StakeHolder")
	public void login_page_of_stake_holder() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		cobj = new ClientP(driver);
		//driver.get("https://app.get2aha.pratian.com/POSMO/landing");
		driver.get(PropertyManager.getProperty("url.app"));

		WebDriverWait wait = new WebDriverWait(driver, 1);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/button"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objLogin = new Home(driver);


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
		objLogin.clickLogin();
	}

	@Then("CLient Page of StakeHolder")
	public void c_lient_page_of_stake_holder() {
		//driver.findElement(By.xpath("/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-dashboard/ngx-sidebar/div/div/div/div[2]/ul[3]/li/a")).click();
		cobj.toClientModule();
		Assert.assertEquals(driver.getCurrentUrl().toString(), "https://app.get2aha.pratian.com/POSMO/client");
		System.out.println("ON CLIENT PAGE SUCCESS ALL STAKEHOLDERS");
	}

	@Then("User Clicks on Sort Button")
	public void user_clicks_on_sort_button() {
		Boolean exp = true;
		//Boolean ans  = driver.findElement(By.xpath("//*[@id=\"viewStakeholder_sortBtnFn\"]")).isEnabled();
		Boolean ans = cobj.sortClick();
		System.out.println("YES : " + ans);
		Assert.assertEquals(ans, exp);
		driver.close();

	}


}
