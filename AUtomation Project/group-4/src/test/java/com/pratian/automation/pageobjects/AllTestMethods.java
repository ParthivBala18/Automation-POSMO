package com.pratian.automation.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AllTestMethods extends StakeHolderPage {

	public AllTestMethods(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void Tc021 () {
		clickClientsBtn();
		clickFirstClient();
		System.out.println("Client Clicked\n");
		clickAddbtn();
		StakeHolderdetailsTitle();
	}
	public void Tc055() {
		clickClientsBtn();
		clickFirstClient();
		clickAddbtn();
		verifyAddStakeHolderTitle();
	}
	public void Tc056() {
		clickClientsBtn();
		clickStakeHolder();
		ViewStakeholdertitle();
	}
	public void Tc051() {
		clickClientsBtn();
		clickFirstClient();
		clickAddbtn();
		EnterNameStakeHolder();
		EnterDesignation();
		EnterCategory();
		EnterContactNo();
		EnterEmail();
		ClickAddBtn();
		ClickYesBtn();
	}
	public void Tc052() {
		clickClientsBtn();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		clickFirstClient();
		clickAddbtn();
		InvalidEnterNameStakeHolder();
		InvalidEnterDesignation();
		InvalidEnterCategory();
		InvalidEnterContactNo();
		InvalidEnterEmail();
		ClickAddBtn();

	}
	public void Tc023() {
		clickClientsBtn();
		clickFirstClient();
		clickAddbtn();
		VerifyAllStakeHolder();
	}

	public void Tc046() {
		clickClientsBtn();
	}
}
