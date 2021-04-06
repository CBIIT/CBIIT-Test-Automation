package CustomBusinessApp.EIDP.StepsImplementation;

import org.openqa.selenium.By;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;

public class GeneralInformationStepImpl extends PageInitializer {
	public void selectCurrentYearOfTrainingDropdown(String year) {
		eidpBasePage.selectOption(generalInformationPage.currentYearOfTrainingDropdown, year);
	}
	public void clickOnGeneralInformationTab() {
		CommonUtils.click(generalInformationPage.generalInformationTab);
	}
	public void clickOnSaveAndContinueButton() {
		CommonUtils.click(generalInformationPage.saveAndContinueButton);
	}
	
	public void enterPrimaryMentor(String name) {
		if(name != null) {
			CommonUtils.click(generalInformationPage.primaryMentorsName);
			CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, name);
			CommonUtil.waitBrowser(2000);
			CommonUtils.click(generalInformationPage.dropdownOptions);
		}
		
		
	}
	
	public void enterLabBranchName(String name) {
		if(name != null) {
			CommonUtils.click(generalInformationPage.labBranchNameDropdown);
			CommonUtils.click(generalInformationPage.dropdownOptions);
			CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, name);
			CommonUtil.waitBrowser(2000);
			CommonUtils.click(generalInformationPage.dropdownOptions);
		}
		
	}
	
	public void selectCoPrimaryMentor(String name) {
		if(name != null) {
			
			CommonUtils.click(generalInformationPage.coPrimaryMentorsName);
			CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, name);
			CommonUtil.waitBrowser(2000);
			CommonUtils.click(generalInformationPage.dropdownOptions);
		}
		
	}
	
	public void selectRandomHighestDegree() {
		MiscUtils.sleep(3000);
		CommonUtils.waitForVisibility(generalInformationPage.highestDegreeDropdown);
		eidpBasePage.selectOptionByIndex(generalInformationPage.highestDegreeDropdown);
	}
	
	public void selectRandomCurrentTitle() {
		eidpBasePage.selectOptionByIndex(generalInformationPage.currentTitle);
	}
	
	public void fillGeneralInformation() throws Exception {
		CommonUtils.click(generalInformationPage.primaryMentorsName);
		CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
		CommonUtils.sendKeys(generalInformationPage.searchInputField, "Berzofsky,Jay");
		Thread.sleep(6000);
		CommonUtils.click(generalInformationPage.dropdownOptions);
		CommonUtils.click(generalInformationPage.labBranchNameDropdown);
		CommonUtils.click(generalInformationPage.dropdownOptions);
		CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
		CommonUtils.sendKeys(generalInformationPage.searchInputField, "Lipkowitz,Stan");
		Thread.sleep(4000);
		CommonUtils.click(generalInformationPage.dropdownOptions);
		Thread.sleep(1000);
		eidpBasePage.selectOptionByIndex(generalInformationPage.highestDegreeDropdown);
		Thread.sleep(5000);
		doYouHaveCoPrimaryMentory(true);
		Thread.sleep(1000);
		CommonUtils.click(generalInformationPage.coPrimaryMentorsName);
		Thread.sleep(2000);
		CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
		CommonUtils.sendKeys(generalInformationPage.searchInputField, "Cole, Eric");
		Thread.sleep(3000);
		CommonUtils.click(generalInformationPage.dropdownOptions);
		Thread.sleep(3000);
		CucumberLogUtils.logScreenShot("General Information");
		CommonUtils.click(generalInformationPage.saveAndContinueButton);
	
	}
	
	public void doYouHaveCoPrimaryMentory(Boolean isCoPrimary) {
		if(isCoPrimary) {
			MiscUtils.sleep(10000);
			WebDriverUtils.webDriver.findElement(By.id("coprimMentorYes")).click();
		} else {
			WebDriverUtils.webDriver.findElement(By.id("coprimMentorNo")).click();
		}
	}
	
	public String getTraineeName() {
		return generalInformationPage.traineeName.getAttribute("value");
	}
	
	public void clickOnDeclineIDPButton() {
		CommonUtils.click(generalInformationPage.declineIDPButton);
	}

}
