package com.pratian.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BasePage{

	public Home(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-landing-screen/div/ngx-top-header/div/div/div[3]/div/div[2]/button")
	private WebElement login;

	@FindBy(xpath="//*[@id='email']")
	private WebElement username;

	@FindBy(xpath="//*[@id='password']")
	private WebElement password;

	@FindBy(xpath="//*[@id='next']")
	private WebElement logbtn;

	public void providelogin() throws InterruptedException {
		this.login.click();
		Thread.sleep(6000);
	}

	public void provideusername(String uname) {
		this.username.clear();
		this.username.sendKeys(uname);
	}
	public void providepassword(String pswrd) {
		this.password.clear();
		this.password.sendKeys(pswrd);
	}
	public void clickLogin() {
		this.logbtn.click();
	}

}
