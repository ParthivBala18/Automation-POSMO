package com.pratian.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StakeElements {

	WebDriver driver;

	@FindBy(id="addStakeholder_internal_name")
	WebElement name;

	@FindBy(id="addStakeholder_internal_designation")
	WebElement designation;

	@FindBy(id="addStakeholder_internal_email")
	WebElement email;

	@FindBy(id= "addStakeholder_internal_categoryDiv")
	WebElement stakeCategory;

	@FindBy(id="addStakeholder_internal_contact_num")
	WebElement contactNum;

	@FindBy(id="addStakeholder_internal_picPath")
	WebElement profilePic;

	@FindBy(id="addStakeholder_internal_text")
	WebElement otherInfo;

	public StakeElements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void displayedFields() {

		if(name.isDisplayed() && email.isDisplayed() && designation.isDisplayed() && stakeCategory.isDisplayed()
				&& contactNum.isDisplayed() && profilePic.isDisplayed() && otherInfo.isDisplayed()) {
			System.out.println("All the fields of the form are available");
		}
	}


	}

