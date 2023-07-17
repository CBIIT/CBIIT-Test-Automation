package CustomBusiness.EIDP.StepsImplementation;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import CustomBusiness.EIDP.Util.SharedData;
import appsCommon.PageInitializer;
import io.cucumber.datatable.DataTable;

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
		if (name != null) {
			CommonUtils.click(generalInformationPage.primaryMentorsName);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, name);
			MiscUtils.sleep(2000);
			CommonUtils.click(generalInformationPage.dropdownOptions);
		}
	}

	public void enterLabBranchName(String name) {
		if (name != null) {
			CommonUtils.click(generalInformationPage.labBranchNameDropdown);
			CommonUtils.click(generalInformationPage.dropdownOptions);
			CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, name);
			CommonUtil.waitBrowser(2000);
			CommonUtils.click(generalInformationPage.dropdownOptions);
		}
	}

	public void selectCoPrimaryMentor(String name) {
		if (name != null) {

			CommonUtils.click(generalInformationPage.coPrimaryMentorsName);
			CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, name);
			CommonUtil.waitBrowser(2000);
			CommonUtils.click(generalInformationPage.dropdownOptions);
		}
	}

	public void selectRandomHighestDegree() {
		MiscUtils.sleep(1000);
		if (CommonUtils.isElementDisplayed(generalInformationPage.highestDegreeDropdown2)) {
			eidpBasePage.selectOptionByIndex(generalInformationPage.highestDegreeDropdown2);
			MiscUtils.sleep(1000);
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
			CommonUtils.click(generalInformationPage.primaryMentorsName);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, (SharedData.primaryMentorName));
			MiscUtils.sleep(2000);
			CommonUtils.click(generalInformationPage.dropdownOptions);
		}
		//Selecting Co-PM
		if (!requestDt.get("Co-PM").isEmpty()) {
			SharedData.coPmName = requestDt.get("Co-PM");
			doYouHaveCoPrimaryMentory(true);
			Thread.sleep(1000);
			CommonUtils.click(generalInformationPage.coPrimaryMentorsName);
			CommonUtils.waitForVisibility(generalInformationPage.searchInputField);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, (SharedData.coPmName));
			MiscUtils.sleep(3000);
			CommonUtils.click(generalInformationPage.dropdownOptions);
		} else {
			doYouHaveCoPrimaryMentory(false);
		}
		//Selecting LBO Chief
		if (!requestDt.get("LBO").isEmpty()) {
			SharedData.lbo = requestDt.get("LBO");
			CommonUtils.click(generalInformationPage.labBranchNameDropdown);
			CommonUtils.sendKeys(generalInformationPage.searchInputField, (SharedData.lbo));
			MiscUtils.sleep(2000);
			CommonUtils.click(generalInformationPage.dropdownOptions);
		}
		MiscUtils.sleep(1000);
		//clicking on Save and Continue
		CommonUtils.click(generalInformationPage.saveAndContinueButton);
	}

	public void doYouHaveCoPrimaryMentory(Boolean isCoPrimary) {
		if (isCoPrimary) {
			MiscUtils.sleep(1000);
			WebDriverUtils.webDriver.findElement(By.id("coprimMentorYes")).click();
		} else {
			MiscUtils.sleep(1000);
			WebDriverUtils.webDriver.findElement(By.id("coprimMentorNo")).click();

		}
	}

	public String getTraineeName() {
		return generalInformationPage.traineeName.getAttribute("value");
	}

	public void clickOnDeclineIDPButton() {
		CommonUtils.click(generalInformationPage.declineIDPButton);
	}

	public void reviewTakeAction() {
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
		List<WebElement> rows = WebDriverUtils.getWebDriver().findElements(By.cssSelector("td.sorting_1"));
		for (WebElement row : rows) {
			if (row.getText().equals(traineeName)) {
				break;
			}
			CommonUtils.click(generalInformationPage.ProceedButton);
		}
	}
}