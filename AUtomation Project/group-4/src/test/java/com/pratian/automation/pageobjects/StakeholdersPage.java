package com.pratian.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StakeholdersPage extends Home{

	public StakeholdersPage(WebDriver driver) {
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

		//Clicking Add Stakeholder Plus Icon

		@FindBy(how = How.XPATH,using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-view-client-dashboard/div[2]/div[4]/ngx-view-stakeholder/div/div[3]/div[2]/a/img")
		WebElement addbtn;
		public void clickAddbtn() {
			addbtn.click();
		}
		
		//Clicking Add Stakeholder button
		@FindBy(how = How.XPATH,using ="//*[@id=\"viewStakeholder_addStakeholder_container\"]")
		WebElement addStakeholder;
		public void clickAddbtn1() {
			addStakeholder.click();
}
		
//		@FindBy(how = How.XPATH,using ="//*[@id=\"addStakeholder_internal_addBtn1\"]")
//		WebElement addStakeholder1;
//		public void clickAddbtn2() {
//			addStakeholder1.click();
//}
		//Clicking on particular stakeholder
		@FindBy(how = How.XPATH,using = "//*[@id=\"viewStakeholder_stakeholderData_detailsContainer\"]")
		WebElement clickStakeholder;
		public void clickbtn2() {
			clickStakeholder.click();
}
		//Click if want to save changes
		@FindBy(how = How.XPATH,using ="//*[@id=\"click-button\"]/div/div/div[2]/button")
		WebElement yesStakeholder;
		public void clickbtn3() {
			yesStakeholder.click();
}
		//Clicking edit button
		@FindBy(how = How.ID,using ="stakeholder_btns1_editBtnFn")
		WebElement editStakeholder;
		public void clickbtn4() {
			editStakeholder.click();
}
		//Clicking cancel button
		@FindBy(how = How.ID,using ="editStakeholder_internal_cancelBtn")
		WebElement cancelStakeholder;
		public void clickbtn5() {
			cancelStakeholder.click();
}
		//Clicking again on cancel button
		@FindBy(how = How.ID,using ="stakeholder_btns1_cancelBtnFn")
		WebElement cancelBtn;
		public void clickbtn6() {
			cancelBtn.click();
}

		//Filter
		@FindBy(how = How.XPATH,using ="//*[@id=\"viewStakeholder_filterBtn\"]")
		WebElement filterBtn;
		public void clickFilter() {
			filterBtn.click();
}
		//Filter Stakeholder type
		@FindBy(how = How.XPATH,using ="//*[@id=\"viewStakeholderInfo_filter_subMenu2Fn\"]")
		WebElement filterBtn1;
		public void clickFilter1() {
			filterBtn1.click();
}
		
		//Filter Stakeholder type external
		@FindBy(how = How.XPATH,using ="//*[@id=\"viewStakeholderInfo_filter_subMenu2_btnFn\"]")
		WebElement filterBtn2;
		public void clickFilter2() {
			filterBtn2.click();
}
		//Filter Stakeholder type clear btn
		@FindBy(how = How.XPATH,using ="//*[@id=\"viewStakeholderInfo_filter_subMenu3_clearBtnFn\"]")
		WebElement filterBtn3;
		public void clickFilter3() {
			filterBtn3.click();
}
		//Filter Stakeholder category
		@FindBy(how = How.XPATH,using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/div/div/button[1]")
		WebElement catfilterBtn;
		public void clickcatFilter() {
			catfilterBtn.click();
}
		
		//Filter stakeholder category investor
		@FindBy(how = How.XPATH,using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[3]/div/div/div/button[4]")
		WebElement catfilterBtn2;
		public void clickcatFilter2() {
			catfilterBtn2.click();
}
		//Filter stakeholder category clear btn
		@FindBy(how = How.XPATH,using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[3]/div/div/div/button[7]")
		WebElement catfilterBtn3;
		public void clickcatFilter3() {
			catfilterBtn3.click();
}
		

		
}