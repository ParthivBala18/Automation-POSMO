package com.pratian.automation.testclasses;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.automation.pageobjects.Home;
import com.pratian.automation.utility.ExcelManager;

public class TestLogin extends BaseTest{

	@Test(dataProvider="login")
	public void Login(String user,String pwd) throws InterruptedException {
		Home home = new Home(driver);
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		home.providelogin();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		home.provideusername(user);
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		home.providepassword(pwd);
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		home.clickLogin();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);

	}
	@DataProvider(name="login")
	public Object[][] getData(){
		Object data[][] = ExcelManager.getTestData("login");
		return data;
	}
}