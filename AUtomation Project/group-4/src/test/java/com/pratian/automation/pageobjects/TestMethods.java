package com.pratian.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestMethods extends StakeholdersPage{

	public TestMethods(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void Tc031() {
		clickClientsBtn();
		clickFirstClient();
		System.out.println("Client Clicked\n");
		clickAddbtn();
		clickAddbtn1();
	}
	public void Tc039() {
		clickClientsBtn();
		clickFirstClient();
		System.out.println("Client Clicked\n");
		clickAddbtn();
		clickbtn2();
		clickbtn3();
		clickbtn4();
		clickbtn5();
		clickbtn6();
	}
	
	public void Tc047() {
		clickClientsBtn();
		clickFirstClient();
		System.out.println("Client Clicked\n");
		clickAddbtn();
		clickFilter();
		clickFilter1();
		clickFilter2();
		clickFilter();
		clickFilter1();
		clickFilter3();
		
	}
	
	public void Tc060() {
		clickClientsBtn();
		clickFirstClient();
		System.out.println("Client Clicked\n");
		clickAddbtn();
		clickFilter();
		clickcatFilter();
		clickcatFilter2();
	}
	public void Tc061() {
		clickClientsBtn();
		clickFirstClient();
		System.out.println("Client Clicked\n");
		clickAddbtn();
		clickFilter();
		clickcatFilter();
		clickcatFilter2();
		clickFilter();
		clickcatFilter();
		clickcatFilter3();
	}
}
