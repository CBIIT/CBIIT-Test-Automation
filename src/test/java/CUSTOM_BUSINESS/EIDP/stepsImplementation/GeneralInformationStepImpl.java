package CUSTOM_BUSINESS.EIDP.stepsImplementation;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CUSTOM_BUSINESS.EIDP.utils.CommonUtil;
import CUSTOM_BUSINESS.EIDP.utils.SharedData;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.datatable.DataTable;

public class GeneralInformationStepImpl extends PageInitializer {
	public void selectCurrentYearOfTrainingDropdown(String year) {
		eidpBasePage.selectOption(generalInformationPage.currentYearOfTrainingDropdown, year);
	}

	public void clickOnGeneralInformationTab() {
		CommonUtils.clickOnElement(generalInformationPage.generalInformationTab);
	}

	public void clickOnSaveAndContinueButton() {
		CommonUtils.clickOnElement(generalInformationPage.saveAndContinueButton);
	}

	public void enterPrimaryMentor(String name) {
		if (name != null) {
			CommonUtils.clickOnElement(generalInformationPage.primaryMentorsName);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, name);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(generalInformationPage.dropdownOptions);
		}
	}

	public void enterLabBranchName(String name) {
		if (name != null) {
			CommonUtils.clickOnElement(generalInformationPage.labBranchNameDropdown);
			CommonUtils.clickOnElement(generalInformationPage.dropdownOptions);
			CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, name);
			CommonUtil.waitBrowser(2000);
			CommonUtils.clickOnElement(generalInformationPage.dropdownOptions);
		}
	}

	public void selectCoPrimaryMentor(String name) {
		if (name != null) {

			CommonUtils.clickOnElement(generalInformationPage.coPrimaryMentorsName);
			CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, name);
			CommonUtil.waitBrowser(2000);
			CommonUtils.clickOnElement(generalInformationPage.dropdownOptions);
		}
	}

	public void selectRandomHighestDegree() {
		CommonUtils.sleep(1000);
		if (CommonUtils.isElementDisplayed(generalInformationPage.highestDegreeDropdown2)) {
			eidpBasePage.selectOptionByIndex(generalInformationPage.highestDegreeDropdown2);
			CommonUtils.sleep(1000);
		} else if (CommonUtils.isElementDisplayed(generalInformationPage.highestDegreeDropdown)) {
			eidpBasePage.selectOptionByIndex(generalInformationPage.highestDegreeDropdown);
		}
	}

	public void selectRandomCurrentTitle() {
		eidpBasePage.selectOptionByIndex(generalInformationPage.currentTitle);
	}

	public void fillGeneralInformation(DataTable dataTable) throws Exception {
		Map<String, String> requestDt = CommonUtil.getMapFromDataTable(dataTable);
		//Selecting highest degree
		CommonUtils.waitForClickability(generalInformationPage.highestDegreeDropdown);
		eidpBasePage.selectOptionByIndex(generalInformationPage.highestDegreeDropdown);
		//Selecting Primary Mentor
		if (!requestDt.get("Primary Mentor").isEmpty()) {
			SharedData.primaryMentorName = requestDt.get("Primary Mentor");
			CommonUtils.clickOnElement(generalInformationPage.primaryMentorsName);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, (SharedData.primaryMentorName));
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(generalInformationPage.dropdownOptions);
		}
		//Selecting Co-PM
		if (!requestDt.get("Co-PM").isEmpty()) {
			SharedData.coPmName = requestDt.get("Co-PM");
			doYouHaveCoPrimaryMentory(true);
			CommonUtils.sleep(1000);
			CommonUtils.clickOnElement(generalInformationPage.coPrimaryMentorsName);
			CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, (SharedData.coPmName));
			CommonUtils.sleep(3000);
			CommonUtils.clickOnElement(generalInformationPage.dropdownOptions);
		} else {
			doYouHaveCoPrimaryMentory(false);
		}
		//Selecting LBO Chief
		if (!requestDt.get("LBO").isEmpty()) {
			SharedData.lbo = requestDt.get("LBO");
			CommonUtils.clickOnElement(generalInformationPage.labBranchNameDropdown);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, (SharedData.lbo));
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(generalInformationPage.dropdownOptions);
		}
		CommonUtils.sleep(1000);
		//clicking on Save and Continue
		CommonUtils.clickOnElement(generalInformationPage.saveAndContinueButton);
	}

	public void doYouHaveCoPrimaryMentory(Boolean isCoPrimary) {
		if (isCoPrimary) {
			CommonUtils.sleep(1000);
			generalInformationPage.coPMYES.click();
		} else {
			CommonUtils.sleep(1000);
			generalInformationPage.coPMNO.click();
		}
	}

	public String getTraineeName() {
		return generalInformationPage.traineeName.getAttribute("value");
	}

	public void clickOnDeclineIDPButton() {
		CommonUtils.clickOnElement(generalInformationPage.declineIDPButton);
	}

	public void reviewTakeAction() {
		CommonUtils.clickOnElement(generalInformationPage.reviewAndTakeAction);
	}

	public void sendToPrimaryMentor() {
		CommonUtils.clickOnElement(generalInformationPage.sendIdpToPrimaryMentor);
	}

	public void editGeneralInformation() {
		CommonUtils.clickOnElement(generalInformationPage.generalInformationEdit);
	}

	public void clickYes() {
		CommonUtils.clickOnElement(generalInformationPage.yesButton);
	}

	public void chooseTraineeProceedButton(String traineeName) {
		List<WebElement> rows = WebDriverUtils.webDriver.findElements(By.cssSelector("td.sorting_1"));
		for (WebElement row : rows) {
			if (row.getText().equals(traineeName)) {
				break;
			}
			CommonUtils.clickOnElement(generalInformationPage.ProceedButton);
		}
	}
}