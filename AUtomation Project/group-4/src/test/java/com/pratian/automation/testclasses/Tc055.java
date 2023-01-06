package com.pratian.automation.testclasses;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pratian.automation.pageobjects.AllTestMethods;

public class Tc055 extends TestLogin{

	@Test(priority=1)
	public void Button() throws InterruptedException {
		AllTestMethods Button=new AllTestMethods(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Button.Tc055();
	}
}