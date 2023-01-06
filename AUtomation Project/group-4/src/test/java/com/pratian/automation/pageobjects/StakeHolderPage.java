package com.pratian.automation.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StakeHolderPage extends Home{

	public StakeHolderPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//CLicking Client

	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-dashboard/ngx-sidebar/div/div/div/div[2]/ul[3]/li")
	WebElement clients;
	public void clickClientsBtn() {
		clients.click();
	}
	//Clicking first client in clients tab

	@FindBy(how = How.ID, using = "maincontent")
	WebElement firstClient;
	public void clickFirstClient() {
		firstClient.click();
	}

	//Clicking Add Stakeholder button

	@FindBy(how = How.XPATH,using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-view-client-dashboard/div[2]/div[4]/ngx-view-stakeholder/div/div[3]/div[2]/a/img")
	WebElement addbtn;
	public void clickAddbtn() {
		addbtn.click();
	}

	//Verifying the Stakeholder details title

	@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/div[2]/div[1]/span")
	WebElement StakeHolderdetails;
	public void StakeHolderdetailsTitle() {
		System.out.println("Title on the page : "+StakeHolderdetails.getText());
	}

	//Verifying the ADD Stakeholder title

	@FindBy(how=How.ID,using ="loginInfo_componentNameContainer")
	WebElement AddStakeholdertitle;
	public void verifyAddStakeHolderTitle() {
		System.out.println("Add Stakeholder Title is displayed ? : "+AddStakeholdertitle.isDisplayed());

	}

	//Clicking StakeHolder

	@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-client-dashboard/div[2]/div[3]/ngx-view-stakeholder/div/div[4]/div/div[1]/div/div[2]/div[2]")
	WebElement clickStakeholder;
	public void clickStakeHolder() {
		clickStakeholder.click();
	}

	//Verifying the ViEW Stakeholder title

	@FindBy(how=How.XPATH,using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-view-stakeholder-dashboard/div[1]/ngx-login-info/div[1]/div[1]")
	WebElement viewStakeholder;
	public void ViewStakeholdertitle() {
		System.out.println("View Stakeholder Title is displayed ? : "+viewStakeholder.isDisplayed());
	}

	//Entering Name for internal stakeholder

	@FindBy(how=How.XPATH,using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[1]/div/mat-form-field/div/div[1]/div/input")
	WebElement enterName;
	public void EnterNameStakeHolder() {
		enterName.click();
		enterName.sendKeys("Sample");
	}

	//Entering Designation for internal stakeholder

	@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[2]/mat-form-field/div/div[1]/div/input")
	WebElement enterDesignation;
	public void EnterDesignation() {
		enterDesignation.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		enterDesignation.sendKeys("COO");
	}

	//Entering Category for internal stakeholder

	@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[3]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
	WebElement entercategory;
	@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/div/div/mat-option[1]")
	WebElement selectcategory;
	public void EnterCategory() {
		entercategory.click();
		selectcategory.click();
	}

	//Entering Contact No. for internal stakeholder

	@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[4]/div/mat-form-field/div/div[1]/div/input")
	WebElement enterContactNo;
	public void EnterContactNo() {
		enterContactNo.click();
		enterContactNo.sendKeys("12345678910");
	}

	//Entering email for internal stakeholder

	@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[5]/div/mat-form-field/div/div[1]/div/input\r\n")
	WebElement enterEmail;
	public void EnterEmail() {
		enterEmail.click();
		enterEmail.sendKeys("sample@email.com");
	}

	//Clicking Add Button

	@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[7]/div[2]/button")
	WebElement clickAddbtn;
	public void ClickAddBtn() {
		clickAddbtn.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/mat-dialog-container/ngx-popup/div[2]/div/div[3]/div/div/div[2]/button")
	WebElement clickYesbtn;
	public void ClickYesBtn() {
		clickYesbtn.click();
		System.out.println("User added New StakeHolder with valid details");
	}

	//Supratika

	@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[2]/ngx-view-stakeholder/div/div[4]")
	WebElement allstakeholder;
	public void VerifyAllStakeHolder() {
		System.out.println("All the Stakeholders displayed ? : "+ allstakeholder.isDisplayed());
	}

	//Entering invalid Name for internal stakeholder

		@FindBy(how=How.XPATH,using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[1]/div/mat-form-field/div/div[1]/div/input")
		WebElement IVenterName;
		public void InvalidEnterNameStakeHolder() {
			IVenterName.click();
			IVenterName.sendKeys("");
		}

		//Entering invalid Designation for internal stakeholder

		@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[2]/mat-form-field/div/div[1]/div/input")
		WebElement IVenterDesignation;
		public void InvalidEnterDesignation() {
			IVenterDesignation.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			IVenterDesignation.sendKeys("00");
		}

		//Entering invalid Category for internal stakeholder

		@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[3]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
		WebElement IVentercategory;
		@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/div/div/mat-option[1]")
		WebElement IVselectcategory;
		public void InvalidEnterCategory() {
			IVentercategory.click();
			IVselectcategory.click();
		}

		//Entering invalid Contact No. for internal stakeholder

		@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[4]/div/mat-form-field/div/div[1]/div/input")
		WebElement IVenterContactNo;
		public void InvalidEnterContactNo() {
			IVenterContactNo.click();
			IVenterContactNo.sendKeys("");
		}

		//Entering invalid email for internal stakeholder

		@FindBy(how=How.XPATH,using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-add-stakeholder-dashboard/div[2]/div/div[1]/ngx-add-stakeholder/div/form/div/div/div[2]/div/div[5]/div/mat-form-field/div/div[1]/div/input\r\n")
		WebElement IVenterEmail;
		public void InvalidEnterEmail() {
			IVenterEmail.click();
			IVenterEmail.sendKeys("invalid entry");
			System.out.println("User cannot enter invalid details");
		}

}