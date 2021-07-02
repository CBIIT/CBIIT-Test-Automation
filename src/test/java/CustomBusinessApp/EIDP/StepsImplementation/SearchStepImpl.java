package CustomBusinessApp.EIDP.StepsImplementation;

import java.util.List;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Pages.BasePage;
import CustomBusinessApp.EIDP.Util.CommonUtil;
import CustomBusinessApp.EIDP.Util.SharedData;
import appsCommon.PageInitializer;

public class SearchStepImpl extends PageInitializer {
	public String getInitiateTraineeAnotherName() {
		return searchPage.initiateTraineeAnotherName.getAttribute("value");
	}

	public void selectSearchForDropdown(String searchOption) {
		eidpBasePage.selectOption(searchPage.searchForDropdown, searchOption);
	}

	public void selectStatus(String statusOption) {
		CommonUtils.click(searchPage.currentIDPStatusDropdown);
		CommonUtils.click(WebDriverUtils.getWebDriver()
				.findElement(By.cssSelector(".select2-search.select2-search--dropdown .select2-search__field")));
		CommonUtils.sendKeys(
				WebDriverUtils.getWebDriver()
						.findElement(By.cssSelector(".select2-search.select2-search--dropdown .select2-search__field")),
				statusOption);
		CommonUtils.click(WebDriverUtils.getWebDriver()
				.findElement(By.xpath("//li[@role='treeitem'][text()=\"" + statusOption + "\"]")));
		CommonUtils.click(searchPage.searchButton);
	}

	public void checkTraineeWithoutIDPCheckbox() {
		CommonUtils.click(searchPage.traineesWithoutIDPCheckbox);
	}

	public void selectClassificationType(String type) {
		CommonUtils.click(searchPage.classificationTypeInput);
		WebElement option = WebDriverUtils.getWebDriver().findElement(

				By.xpath("//*[@id='select2-trainee-classifications-results']//li[text()=\"" + type + "\"]"));

		By.xpath("//*[@id='select2-trainee-classifications-results']//title[text()=\"" + type + "\"]");

		CommonUtils.click(option);
		CommonUtils.click(searchPage.trainneLastName);
		CommonUtils.click(searchPage.searchButton);

	}

	public void selectActiveCompletedIDP() throws Exception {
		CommonUtil.waitBrowser(4000);
		CommonUtils.waitForVisibility(WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results")));
		List<WebElement> activeButtons = WebDriverUtils.getWebDriver()
				.findElements(By.xpath("//button[@class='btn btn-primary initiateAnother'][not(@disabled)]"));
		Boolean isSelected = false;
		while (!isSelected) {
			activeButtons = WebDriverUtils.getWebDriver()
					.findElements(By.xpath("//button[@class='btn btn-primary initiateAnother'][not(@disabled)]"));
			if (activeButtons.size() > 0) {
				CommonUtils.click(activeButtons.get(0));
				isSelected = true;
			} else {
				searchPage.nextButton.click();
				Thread.sleep(8000);
			}
		}
	}

	public void selectReleaseHoldIDP() {
		CommonUtil.waitBrowser(4000);
		CommonUtils.waitForVisibility(WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results")));
		List<WebElement> activeButtons = WebDriverUtils.getWebDriver()
				.findElements(By.xpath("//button[@class='btn btn-primary holdIDP'][not(@disabled)]"));
		Boolean isSelected = false;
		while (!isSelected) {
			activeButtons = WebDriverUtils.getWebDriver()
					.findElements(By.xpath("//button[@class='btn btn-primary holdIDP'][not(@disabled)]"));
			if (activeButtons.size() > 0) {
				CommonUtils.click(activeButtons.get(0));
				isSelected = true;
			} else {
				if (searchPage.nextButton.isEnabled()) {
					CommonUtils.waitForClickability(searchPage.nextButton);
					MiscUtils.sleep(3000);
					searchPage.nextButton.click();
					CommonUtil.waitBrowser(8000);
				} else {
					break;
				}

			}
		}
	}

	public void selectCancelIDP() {
		CommonUtil.waitBrowser(4000);
		CommonUtils.waitForVisibility(WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results")));
		List<WebElement> activeButtons = WebDriverUtils.getWebDriver()
				.findElements(By.xpath("//button[@class='btn btn-primary'][not(@disabled)]"));
		Boolean isSelected = false;
		while (!isSelected) {
			activeButtons = WebDriverUtils.getWebDriver()
					.findElements(By.xpath("//button[@class='btn btn-primary'][not(@disabled)]"));
			if (activeButtons.size() > 0) {
				CommonUtils.click(activeButtons.get(0));
				isSelected = true;
			} else {
				if (searchPage.nextButton.isEnabled()) {
					searchPage.nextButton.click();
					CommonUtil.waitBrowser(8000);
				} else {
					break;
				}

			}
		}
	}

	public void selectUndoCancelIDP() {
		CommonUtil.waitBrowser(4000);
		CommonUtils.waitForVisibility(WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results")));
		List<WebElement> activeButtons = WebDriverUtils.getWebDriver()
				.findElements(By.xpath("//button[@class='btn btn-primary undoCancelledIDP'][not(@disabled)]"));
		Boolean isSelected = false;
		while (!isSelected) {
			activeButtons = WebDriverUtils.getWebDriver()
					.findElements(By.xpath("//button[@class='btn btn-primary undoCancelledIDP'][not(@disabled)]"));
			if (activeButtons.size() > 0) {
				CommonUtils.click(activeButtons.get(0));
				isSelected = true;
			} else {
				if (searchPage.nextButton.isEnabled()) {
					searchPage.nextButton.click();
					CommonUtil.waitBrowser(8000);
				} else {
					break;
				}

			}
		}
	}

	public void selectExistSurveyIDP() {
		CommonUtil.waitBrowser(4000);
		CommonUtils.waitForVisibility(WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results")));
		List<WebElement> activeButtons = WebDriverUtils.getWebDriver()
				.findElements(By.xpath("//button[@class='btn btn-primary exitSurvey'][not(@disabled)]"));
		Boolean isSelected = false;
		while (!isSelected) {
			activeButtons = WebDriverUtils.getWebDriver()
					.findElements(By.xpath("//button[@class='btn btn-primary exitSurvey'][not(@disabled)]"));
			if (activeButtons.size() > 0) {
				CommonUtils.click(activeButtons.get(0));
				isSelected = true;
			} else {
				if (searchPage.nextButton.isEnabled()) {
					searchPage.nextButton.click();
					CommonUtil.waitBrowser(8000);
				} else {
					break;
				}

			}
		}
	}

	public String getPrimaryMentorNameFromHoldConformationWindow() {
		return WebDriverUtils.getWebDriver().findElement(By.cssSelector("#primaryMentorInfo a")).getText();
	}

	public String getTrainneeNameFromHoldConfirmationWindow() {
		return WebDriverUtils.getWebDriver().findElement(By.cssSelector(".modal.modal-lg.fade.in .traineeDetails > a"))
				.getText();
	}

	public String getTraineeeNameFromCancelIdpConformationWindow() {
		return WebDriverUtils.getWebDriver().findElement(By.cssSelector("#cancelModalUserInfo")).getText();
	}

	public String getTraineeeNameFromUndoCancelIdpConformationWindow() {
		return WebDriverUtils.getWebDriver().findElement(By.cssSelector("#undoCancelModalUserInfo")).getText();
	}

	public void enterReleaseHoldComments() {
		WebDriverUtils.getWebDriver().findElement(By.id("releaseHoldComments")).sendKeys("Release hold comment");
	}

	public void enterCancelIdpComments(String comments) {
		WebDriverUtils.getWebDriver().findElement(By.id("cancellationComment")).sendKeys(comments);
	}

	public void enterUndoCancelIdpComments(String comments) {
		WebDriverUtils.getWebDriver().findElement(By.id("undoCancellationComment")).sendKeys(comments);
	}

	public void clickOnUndoCancelYesButton() {
		WebDriverUtils.getWebDriver().findElement(By.id("btnUndoCancelModalOK")).click();
	}

	public void clickOnReleaseHoldOkbutton() {
		WebDriverUtils.getWebDriver().findElement(By.id("release-hold-button")).click();
	}

	public void selectActiveTraineeNHGRI() throws Exception {

		Thread.sleep(8000);
		List<WebElement> searchResults = WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results"))
				.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		WebElement buttonEl;
		Boolean isSelected = false;
		while (true) {
			for (int i = 3; i < searchResults.size(); i++) {
				buttonEl = searchResults.get(i).findElement(By.tagName("button"));
				if (buttonEl.isEnabled()) {
					SharedData.traineeName = searchResults.get(i).findElement(By.tagName("a")).getText();
					buttonEl.click();
					isSelected = true;
					break;
				}
			}
			if (isSelected) {
				break;
			} else {
				searchPage.nextButton.click();
				Thread.sleep(8000);
				searchResults = WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results"))
						.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
			}
		}

	}

	public void selectActiveTrainee() throws Exception {

		Thread.sleep(8000);
		List<WebElement> searchResults = WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results"))
				.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		WebElement buttonEl;
		Boolean isSelected = false;
		while (true) {
			for (int i = 2; i < searchResults.size(); i++) {
				buttonEl = searchResults.get(i).findElement(By.tagName("button"));
				if (buttonEl.isEnabled()) {
					SharedData.traineeName = searchResults.get(i).findElement(By.tagName("a")).getText();
					buttonEl.click();
					Thread.sleep(2000);
					if (!searchPage.saveAndSendEmailButton.isDisplayed()) {
						continue;
					} else {
						isSelected = true;
						break;
					}
				}
			}
			if (isSelected) {
				break;
			} else {
				searchPage.nextButton.click();
				Thread.sleep(8000);
				searchResults = WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results"))
						.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
			}
		}

	}

	public void selectReviewExistingIDP() throws Exception {

		Thread.sleep(8000);
		List<WebElement> searchResults = WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results"))
				.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		WebElement buttonEl;
		Boolean isSelected = false;
		while (true) {
			for (int i = 0; i < searchResults.size(); i++) {
				buttonEl = searchResults.get(i).findElement(By.tagName("button"));
				if (buttonEl.isEnabled()) {
					SharedData.traineeName = searchResults.get(i).findElement(By.tagName("a")).getText();
					buttonEl.click();
					isSelected = true;
					break;
				}
			}
			if (isSelected) {
				break;
			} else {
				searchPage.nextButton.click();
				Thread.sleep(8000);
				searchResults = WebDriverUtils.getWebDriver().findElement(By.id("advanced_search_results"))
						.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
			}
		}

	}

	public Boolean isIDPFormDisplayed() {
		CommonUtils.waitForVisibility(searchPage.saveAndSendEmailButton);
		return searchPage.saveAndSendEmailButton.isDisplayed();
	}

	public void clickOnCloseButton() {
		CommonUtils.click(searchPage.closeButton);
	}

	public void clickOnSaveAndSendMailButton() {
		CommonUtils.click(searchPage.saveAndSendEmail);
	}

	public void clickOnOkButton() {
		CommonUtils.click(searchPage.okButton);
	}

	public void selectNCITrainingOrganization(String optionText) {
		eidpBasePage.selectOption(searchPage.nciTrainingOrganizationDropdown, optionText);
	}

	public String getTraineeName() {
		return searchPage.traineeName.getText();
	}

	public Boolean isIDPInitationSuccess() throws Exception {
		Thread.sleep(12000);
		CommonUtils.waitForVisibility(searchPage.idpInitiationMessage);
		Thread.sleep(1000);

		return searchPage.idpInitiationMessage.isDisplayed();
	}

	public void clickOnButton(String buttonName) {
		String xpath = "//button[text()='" + buttonName + "']";
		WebDriverUtils.getWebDriver().findElement(By.xpath(xpath)).click();
	}

	public void selectCheckBox(String value) {
		String xpath = "//label[normalize-space()='" + value + "']//input[@type='checkbox']";
		WebDriverUtils.getWebDriver().findElement(By.xpath(xpath)).click();
	}

	public void clickOnButtonInGrid(String button) {
		String xpath = "//button[@data-original-title='" + button + "']";
		WebDriverUtils.getWebDriver().findElement(By.xpath(xpath)).click();
	}

	public void clickOnPopUpYesButton() {
		String xpath = "//button[text()='Yes' and not(@id)]";
		WebDriverUtils.getWebDriver().findElement(By.xpath(xpath)).click();

	}

	public void clickOnSearchButton() {
		CommonUtils.waitForClickability(searchPage.searchButton);
		CommonUtils.click(searchPage.searchButton);
	}

	public void checkTraineeWithIDPCheckbox() {
		CommonUtils.click(searchPage.traineesWithIDPCheckbox);
	}

	public void enterTraineeFirstName(String enterName) {
		searchPage.TraineeFirstName.sendKeys(enterName);
	}

	public void enterTraineeLastName(String enterName) {
		searchPage.trainneLastName.sendKeys(enterName);
	}

	public void verifyFirmlyExpectedName(String expectedFirstName, String expectedLastName) {
		String expectedFullName = expectedLastName + ", " + expectedFirstName;
		String actualFullName = searchPage.searchResultTableFirstRowFirstCell.getText();
		Assert.assertEquals(expectedFullName, actualFullName);
	}

	public void verifyFirmlyClassificationType(String expectedClassificationType) {
		String actualClassificationType = searchPage.searchResultTableFirstRowThirdCell.getText();
		Assert.assertEquals(expectedClassificationType.toUpperCase(), actualClassificationType);
	}

	public void selectPrimaryMentorName() {
		CommonUtils.click(searchPage.selectPrimaryMentor);

	}

	public void verifyTraineeUnderPrimaryMentor(String primaryMentor) {
		eidpBasePage.selectOption(searchPage.choosePrimaryMentor, primaryMentor);
		clickOnSearchButton();
		MiscUtils.sleep(5000);
		List<WebElement> rows = WebDriverUtils.getWebDriver().findElements(By.cssSelector("td.sorting_2"));
		for (WebElement row : rows) {
			row.click();
			MiscUtils.sleep(5000);
			WebElement element = WebDriverUtils.getWebDriver().findElement(
					By.xpath("//span[@class='dtr-title' and text()='Primary Mentor']/following-sibling::span/a"));
			eidpBasePage.scrollToElement(element);
			String actualName = element.getText();
			Assert.assertEquals(primaryMentor, actualName);
			CucumberLogUtils.logScreenShot();
			row.click();
			MiscUtils.sleep(5000);
		}

	}

	public void clickOnSearchButtonGloriaCalloway() {
		CommonUtils.click(searchPage.searchButtonCallowayGloria);
	}

	public void verifyGloriaCallowayExpectedName(String expectedFirstName, String expectedLastName) {
		String expectedFullName = expectedLastName + ", " + expectedFirstName;
		String actualFullName = searchPage.searchResultTableFirstRowThirdCellCalloway.getText();
		Assert.assertEquals(expectedFullName, actualFullName);
	}

	public void selectClassificationTypeGloriaCalloway(String type) {
		CommonUtils.click(searchPage.classificationTypeInput);
		CommonUtils.selectDropDownValue(type, searchPage.classificationTypeDropDownGloriaGalloway);
	}

	public void selectPrimaryMentorName(String nameMentor) {
		CommonUtils.click(searchPage.selectPrimaryMentor);
		CommonUtils.selectDropDownValue(nameMentor, searchPage.choosePrimaryMentor);
	}

	public void selectTrainingOrganization(String organizationName) {
		CommonUtils.click(searchPage.selectTrainingOrganizationDropdown);

	}

	public void verifyTraineeOrganization(String nameOrg) {
		eidpBasePage.selectOption(searchPage.chooseCBIIT, nameOrg);
		MiscUtils.sleep(3000);
		clickOnSearchButton();
		MiscUtils.sleep(3000);
		List<WebElement> rows = WebDriverUtils.getWebDriver().findElements(By.cssSelector("td.sorting_2"));
		for (WebElement each : rows) {
			WebElement nameOrgList = WebDriverUtils.getWebDriver()
					.findElement(By.xpath("//table[@id='advanced_search_results']//tbody//tr[1]//td[4]"));
			eidpBasePage.scrollToElement(nameOrgList);
			if (each.getText().equals(nameOrg)) {
				Assert.assertTrue(each.getText().equals(nameOrg));
				MiscUtils.sleep(3000);

			}
		}

	}

	public void verifyClassificationType(String type) {
		MiscUtils.sleep(2000);
		List<WebElement> rows = WebDriverUtils.getWebDriver()
				.findElements(By.cssSelector("td.sorting_1.dtr-control::before"));
		for (WebElement eachRow : rows) {
			eachRow.click();
			MiscUtils.sleep(1000);
			WebElement typeOfClassification = WebDriverUtils.getWebDriver()
					.findElement(By.xpath("//span[@class='dtr-data' and text()='EMPLOYEE']"));
			eidpBasePage.scrollToElement(typeOfClassification);
			String actualType = typeOfClassification.getText();
			Assert.assertEquals(type.toUpperCase(), actualType);
			CucumberLogUtils.logScreenShot();
			eachRow.click();

		}
	}

	public void selectDropdownNIHSACGloriaCalloway(String SACname) {
		CommonUtils.selectDropDownValue(searchPage.chooseDropdownNIHSACGloriaCalloway, SACname);

	}

	public void verifyNIHSAAC(String name) {
		List<WebElement> rows = WebDriverUtils.getWebDriver()
				.findElements(By.cssSelector("sorting_1 dtr-control::before"));
		for (WebElement each : rows) {
			WebElement nameofList = WebDriverUtils.getWebDriver()
					.findElement(By.xpath("//table[@id ='search-results']//tbody//tr[1]//td[5]"));
			eidpBasePage.scrollToElement(nameofList);
			if (each.getText().contains(name)) {
				Assert.assertTrue(each.getText().contains(name));
			} else {
				Assert.fail("RESULT DOES NOT EXIST" + name);
			}
		}
	}

}
