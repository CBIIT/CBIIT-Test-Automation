package CustomBusinessApp.EIDP.StepsImplementation;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
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
		MiscUtils.sleep(2000);
		CommonUtils.click(eidpDashboardPage.startIDPButton);
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
		CommonUtils.click(eidpDashboardPage.idpAwaitingResponseButton);
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

	public boolean selectIDPRequestOfTrainee() throws Exception {
		Boolean isSelected = false;
		String traineeName = SharedData.traineeName;
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}
		MiscUtils.sleep(8000);
		for (byte i = 1; i <= 8; i++) {
			List<WebElement> pendingReviews = WebDriverUtils.getWebDriver()
					.findElements(By.xpath("//table[@id='mentorsTable']//tr/td[1]/a"));

			for (WebElement each : pendingReviews) {
				if (each.getText().equals(traineeName)) {
					WebElement pendingReviewsTraineeButton = WebDriverUtils.getWebDriver().findElement
							(By.xpath("(//a[text()='" + traineeName + "']//ancestor::tr//a[@title='Pending Review'])[1]"));
							//(By.xpath("(//tr//a[text()='" + traineeName
								//	+ "']/parent::td/following-sibling::td//a[@title='Pending Review']"));
							pendingReviewsTraineeButton.click();
					isSelected = true;
					break;
				}
			}
			MiscUtils.sleep(8000);
			if (isSelected) {
				break;
			} else {
				WebElement nextButton = WebDriverUtils.getWebDriver()
						.findElement(By.xpath("//li[@id='mentorsTable_next']/a[contains(text(), 'Next')]"));
				nextButton.click();
				MiscUtils.sleep(5000);
			}
		}
		return isSelected;
	}



	public boolean clickProceedButtonOfTrainee() throws Exception {
		Boolean isSelected = false;
		String traineeName = SharedData.traineeName;
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}
		MiscUtils.sleep(8000);
		for (byte i = 1; i <= 7; i++) {
			List<WebElement> pendingReviews = WebDriverUtils.getWebDriver()
					.findElements(By.xpath("//table[@id='mentorsTable']/tbody/tr"));

			for (byte j = 0; j < pendingReviews.size(); j++) {
				String name = WebDriverUtils.getWebDriver()
						.findElement(By.xpath(".//*[@id='mentorsTable']/tbody/tr[" + (j + 1) + "]/td[1]")).getText();
				if (name.equals(traineeName)) {
					WebElement button = WebDriverUtils.getWebDriver().findElement

					(By.xpath("//tr//a[text()='" + traineeName
							+ "']/parent::td/following-sibling::td//a[@title='Proceed']"));

					button.click();
					isSelected = true;
					break;
				}
			}
			MiscUtils.sleep(8000);
			if (isSelected) {
				break;
			} else {
				WebDriverUtils.getWebDriver()
						.findElement(By.xpath("//li[@id='mentorsTable_next']/a[contains(text(), 'Next')]")).click();
				MiscUtils.sleep(5000);
			}
		}
		return isSelected;
	}

	public void clickProceedButtonOfTraineeCoPrimaryMentor() throws Exception {
		String traineeName = SharedData.traineeName;
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}
		Thread.sleep(5000);
		WebElement button = WebDriverUtils.getWebDriver()
				.findElement(By.xpath("//a[text()='" + traineeName + "']//ancestor::tr//a[@title='Proceed']"));
				Thread.sleep(5000);
		button.click();

	}

	public String getIDPRequestStatus() {
		return WebDriverUtils.getWebDriver().findElement(By.xpath("//table//tbody//td[2]")).getText();
	}

	public void clickOnSearchButton() {
		CommonUtils.click(eidpDashboardPage.searchButton);
	}

}
