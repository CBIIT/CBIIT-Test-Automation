package CustomBusinessApp.EIDP.StepsImplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		if (CommonUtils.isElementDisplayed(generalInformationPage.highestDegreeDropdown)) {
			eidpBasePage.selectOptionByIndex(generalInformationPage.highestDegreeDropdown);
			}else if (CommonUtils.isElementDisplayed(generalInformationPage.highestDegreeDropdown2)) {
			eidpBasePage.selectOptionByIndex(generalInformationPage.highestDegreeDropdown2);
			MiscUtils.sleep(3000);
		}
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
		Thread.sleep(1000);
		CommonUtils.click(generalInformationPage.labBranchNameDropdown);
		Thread.sleep(1000);
		CommonUtils.click(generalInformationPage.dropdownOptions);
		Thread.sleep(1000);
		CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
		Thread.sleep(1000);
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
			MiscUtils.sleep(3000);
			WebDriverUtils.webDriver.findElement(By.id("coprimMentorYes")).click();
			MiscUtils.sleep(3000);
		} else {
			WebDriverUtils.webDriver.findElement(By.id("coprimMentorNo")).click();
			MiscUtils.sleep(3000);
		}
	}
	
	public String getTraineeName() {
		return generalInformationPage.traineeName.getAttribute("value");
	}
	
	public void clickOnDeclineIDPButton() {
		CommonUtils.click(generalInformationPage.declineIDPButton);
	}
	public void reviewTakeAction(){
		CommonUtils.click(generalInformationPage.reviewAndTakeAction);
	}
	
	public void sendToPrimaryMentor() {
		CommonUtils.click(generalInformationPage.sendIdpToPrimaryMentor);
	}
	
	public void editGeneralInformation() {
		CommonUtils.click(generalInformationPage.generalInformationEdit);
	}

	public void clickYes() {
		CommonUtils.click(generalInformationPage.yesButton);
	}
	
	public void chooseTraineeProceedButton(String traineeName) {
		List<WebElement>rows = WebDriverUtils.getWebDriver().findElements(By.cssSelector("td.sorting_1"));
		for(WebElement row: rows) {
		if(row.getText().equals(traineeName)) {
		break;
		}
		CommonUtils.click(generalInformationPage.ProceedButton);
		}
	}	
		
		
	}

