package com.pratian.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientP extends BasePage {

	public ClientP(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@id=\"viewStakeholder_sortBtnFn\"]")
	private WebElement sort;

	@FindBy(xpath = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-dashboard/ngx-sidebar/div/div/div/div[2]/ul[3]/li/a")
	private WebElement toCLient;

	@FindBy(xpath = "//*[@id=\"viewStakeholder_filterBtn\"]")
	private WebElement filter;

	@FindBy(xpath = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-client-dashboard/div[2]/div[3]/ngx-view-stakeholder/div/div[2]/div/span/button[2]")
	private WebElement f1;

	@FindBy(xpath = "//*[@id=\"viewStakeholderInfo_filter_subMenu1Fn\"]")
	private WebElement Category;

	@FindBy(xpath = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[3]/div/div/div/button[2]")
	private WebElement Management;

	@FindBy(xpath = "//*[@id=\"mat-menu-panel-10\"]/div/button[2]")
	private WebElement Staktype;

	@FindBy(xpath = "//*[@id=\"mat-menu-panel-13\"]/div/button[1]")
	private WebElement internalStake;

	@FindBy(xpath = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[3]/div/div/div/button[2]")
	private WebElement extternalSTake;


	public Boolean sortClick() {
		if(sort.isEnabled()) {
			this.sort.click();
			return true;
		}
		return false;
	}

	public void toClientModule() {
		this.toCLient.click();
	}

	public void clickFilterButtton() {
		this.filter.click();
	}

	public void clickCategoryButtton() {
		this.Category.click();
	}

	public void clickManagementButtton() {
		this.Management.click();
	}

	public void clickStaktype() {
		this.Staktype.click();
	}

	public void clickInternal() {
		this.internalStake.click();
	}

	public void clickextternalSTake() {
		this.extternalSTake.click();
	}

	public void clickF1() {
		this.f1.click();
	}

}
