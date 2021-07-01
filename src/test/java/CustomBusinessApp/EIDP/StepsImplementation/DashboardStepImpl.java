package CustomBusinessApp.EIDP.StepsImplementation;

import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.SharedData;
import appsCommon.PageInitializer;

public class DashboardStepImpl extends PageInitializer {

	public void clickOnSubmitButton() {
		CommonUtils.click(eidpDashboardPage.submitButton);
	}

	public void selectVerifyMeetingCheckbox() {
		WebDriverUtils.getWebDriver().findElement(By.cssSelector(".checkbox.btn.btn-primary")).click();
	}

	public void clickOnSearch() {
		CommonUtils.click(eidpDashboardPage.search);
	}

	public void clickOnManageDelegate() {
		CommonUtils.click(eidpDashboardPage.manageDelegate);
	}

	public void clickOnStartIDPButton() {
		CommonUtils.waitForVisibility(eidpDashboardPage.startIDPButton);
		CommonUtils.click(eidpDashboardPage.startIDPButton);
	}

	public void clickOnReviseIDP() throws Exception {
		List<WebElement> allElements = WebDriverUtils.getWebDriver()
				.findElements(By.xpath("//img[@data-original-title=\"Revise existing IDP\"]"));
		for (WebElement e : allElements) {
			if (e.isEnabled()) {
				e.click();
				return;
			}
		}
		throw new Exception("No button available to click for revise IDP");
	}

	public void clickOnProceedButton() {
		CommonUtils.waitForVisibility(eidpDashboardPage.proceedButton);
		CommonUtils.click(eidpDashboardPage.proceedButton);
	}

	public void clickOnSendIDPToPrimaryMentorButton() {
		CommonUtils.click(eidpDashboardPage.sendIDPToPrimaryMentoryButton);
	}

	public void clickOnVerifyMeetingButton() {
		CommonUtils.click(eidpDashboardPage.verifyMeetingButton);
	}

	public Boolean isIDPSentMessage() {
		String message = eidpDashboardPage.idpMessage.getText();
		return message.contains("Thank you! You have successfully sent your IDP to the Primary Mentor");

	}

	public void clickOnIDPAwaitResponsButton() {
		if (CommonUtils.isElementDisplayed(eidpDashboardPage.idpAwaitingResponseButton)) {
			CommonUtils.click(eidpDashboardPage.idpAwaitingResponseButton);
		}
	}

	public Boolean selectFirstPendingReviewIDP() {
		Boolean isSelected = false;
		List<WebElement> reviews = WebDriverUtils.getWebDriver()
				.findElements(By.cssSelector("a[title='Pending Review']"));
		if (reviews.size() > 0) {
			CommonUtils.click(reviews.get(0));
			isSelected = true;
		}
		return isSelected;
	}

	public Boolean selectIDPRequestOfTrainee() throws Exception {
		if (WebDriverUtils.getWebDriver().findElements(By.xpath("//div[@id='d1']/span[text()='IDP Awaiting Response']"))
				.size() > 0) {
			WebDriverUtils.getWebDriver().findElement(By.xpath("//div[@id='d1']/span[text()='IDP Awaiting Response']"))
					.click();
		}

		Boolean isSelected = false;
		String traineeName = SharedData.traineeName;
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}
		List<WebElement> pendingReviews = WebDriverUtils.getWebDriver()
				.findElements(By.xpath("//a[text()='" + traineeName + "']//ancestor::tr//a[@title='Pending Review']"));
		if (pendingReviews.size() > 0) {
			pendingReviews.get(0).click();
			isSelected = true;
		}
		if (!isSelected) {
			WebDriverUtils.getWebDriver().findElement(By.xpath(
					"//tr//a[text()='" + traineeName + "']/parent::td/following-sibling::td//a[@title='Proceed']"))
					.click();
			//
		}
		return isSelected;
	}

	public Boolean selectIDPRequestOfTraineeForRenewal() throws Exception {
		Boolean isSelected = false;
		String traineeName = SharedData.traineeName;
		if (traineeName.trim().equals("")) {
			throw new Exception("Trainee Name is blank");
		}
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}
		traineeName = traineeName.toLowerCase();
		String str = traineeName.split(",")[1].trim();
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		String str2 = traineeName.split(",")[0].trim();
		str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
		traineeName = str2 + "," + str;
		Thread.sleep(5000);
		if (CommonUtils.isElementDisplayed(By.xpath("//tr//a[contains(text(),'" + str2 + "') and contains(text(),'"
				+ str + "')]/parent::td/following-sibling::td//a/img[@alt='proceed']"))) {
			WebDriverUtils.getWebDriver().findElement(By.xpath("//tr//a[contains(text(),'" + str2
					+ "') and contains(text(),'" + str + "')]/parent::td/following-sibling::td//a/img[@alt='proceed']"))
					.click();
		} else if (CommonUtils.isElementDisplayed(By.xpath("//tr//a[contains(text(),'" + str2
				+ "') and contains(text(),'" + str + "')]/parent::td/following-sibling::td//a/img[@alt='Proceed']"))) {
			WebDriverUtils.getWebDriver().findElement(By.xpath("//tr//a[contains(text(),'" + str2
					+ "') and contains(text(),'" + str + "')]/parent::td/following-sibling::td//a/img[@alt='Proceed']"))
					.click();
		} else {
			if (CommonUtils.isElementEnabled(
					WebDriverUtils.getWebDriver().findElement(By.xpath("//li[@id=\"mentorsTable_next\"]/a")))) {
				WebDriverUtils.getWebDriver().findElement(By.xpath("//li[@id=\"mentorsTable_next\"]/a")).click();
				selectIDPRequestOfTraineeForRenewal();
			} else {
				throw new Exception("Unable to find the trainne to proceed");
			}
		}
		return isSelected;
	}

	public void finishSteps() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverUtils.getWebDriver().findElement(By.xpath("title=\"Verify Meeting And Accept IDP\"")).click();
		WebDriverUtils.getWebDriver().findElement(By.id("checkboxMeetingVerified")).click();
		WebDriverUtils.getWebDriver().findElement(By.xpath("//button[@onclick=\"form_submit_verifyMeetingPM()\"]"))
				.click();
	}

	public void clickProceedButtonOfTrainee() throws Exception {

		String traineeName = SharedData.traineeName;
		// String traineeName = "Bugge, Thomas";
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}

		Thread.sleep(25000);
		WebElement button = WebDriverUtils.getWebDriver().findElement(By.xpath(String.format(
				"//h4[contains(text(),'ADD')]/ancestor::div[@class='container main']//tbody//*[text()='%s']//parent::td/following-sibling::td/a[@class=\"btn btn-primary\"]",
				traineeName)));
		button.click();

	}

	public String getIDPRequestStatus() {
		return WebDriverUtils.getWebDriver().findElement(By.xpath("//table//tbody//td[2]")).getText();
	}

	public void clickOnSearchButton() {
		CommonUtils.click(eidpDashboardPage.searchButton);
	}

}
